package org.acme;

import io.quarkus.test.junit.QuarkusTest;

import org.hamcrest.core.Is;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

@QuarkusTest
public class UsersTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/api/users")
          .then()
             .statusCode(200);
    }

}