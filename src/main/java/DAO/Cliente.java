package DAO;

public class Cliente {

    public long idCliente; 
    public String nombre ;
    public String apellido; 
    public String nombre_Completo ;
    public String rnc ;
    public String telefono ;
    public String idNcf ;
    public String platinumCard ;
    public int millas_Acumuladas;

    public Cliente() {
    } 

    public long getIdCliente() {
        return this.idCliente;
    }

    public void setIdCliente(long idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre_Completo() {
        return this.nombre_Completo;
    }

    public void setNombre_Completo(String nombre_Completo) {
        this.nombre_Completo =this.nombre + " " + this.apellido;
    }

    public String getRnc() {
        return this.rnc;
    }

    public void setRnc(String rnc) {
        this.rnc = rnc;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getIdNcf() {
        return this.idNcf;
    }

    public void setIdNcf(String idNcf) {
        this.idNcf = idNcf;
    }

    public String getPlatinumCard() {
        return this.platinumCard;
    }

    public void setPlatinumCard(String platinumCard) {
        this.platinumCard = platinumCard;
    }

    public int getMillas_Acumuladas() {
        return this.millas_Acumuladas;
    }

    public void setMillas_Acumuladas(int millas_Acumuladas) {
        this.millas_Acumuladas = millas_Acumuladas;
    }
}
