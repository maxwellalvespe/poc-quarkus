package org.acme.model;

public class Topico {

    private String idUsuario;
    private String idEquete;
    private Voto voto;

    public Topico(String idUsuario, String idEquete, Voto voto) {
        this.idUsuario = idUsuario;
        this.idEquete = idEquete;
        this.voto = voto;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public String getIdEquete() {
        return idEquete;
    }

    public Voto getVoto() {
        return voto;
    }

    @Override
    public String toString() {
        return "Topico [idUsuario=" + idUsuario + ", idEquete=" + idEquete + ", voto=" + voto + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((idUsuario == null) ? 0 : idUsuario.hashCode());
        result = prime * result + ((idEquete == null) ? 0 : idEquete.hashCode());
        result = prime * result + ((voto == null) ? 0 : voto.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Topico other = (Topico) obj;
        if (idUsuario == null) {
            if (other.idUsuario != null)
                return false;
        } else if (!idUsuario.equals(other.idUsuario))
            return false;
        if (idEquete == null) {
            if (other.idEquete != null)
                return false;
        } else if (!idEquete.equals(other.idEquete))
            return false;
        if (voto != other.voto)
            return false;
        return true;
    }

}
