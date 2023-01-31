package org.acme.resource;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import org.acme.model.User;
import io.vertx.core.impl.logging.Logger;
import io.vertx.core.impl.logging.LoggerFactory;

@Path("api/users")
public class Users {

    Logger logger = LoggerFactory.getLogger(Users.class);

    private List<User> users = new ArrayList<>();

    @GET
    public List<User> getUser() {
        return this.users;
    }

    @POST
    public User post(User user) {
        logger.info("Requisição obtida : {}".replace("{}", user.toString()));
        users.add(user);
        return users.stream()
                .filter(u -> u.getCpf().equals(user.getCpf()))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("Usuario não foi salvo na base de dados"));
    }

    @DELETE
    @Path("/{id}")
    public void remove(@PathParam("id") String id){

        for(User us : users){

            if(us.getCpf().equals(id)){
                logger.info("CPF LOCALIZADO.."+ us);
                this.users.remove(us);
                break;
            }
        }
        logger.info("Registro removido com sucesso: {}".replace("{}", id));
    }
}