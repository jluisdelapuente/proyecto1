package app.clase3.tarea.CentrosDistribucion.datos;

import app.clase3.tarea.CentrosDistribucion.distribucion.Distritos;

public abstract class Cliente extends Distritos {

    private int DNI;
    private String Nombres;
    private int Telefono;
    private String Direccion;
    private String Distrito;

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getDistrito() {
        return Distrito;
    }

    public void setDistrito(String Distrito) {
        this.Distrito = Distrito;
    }

    public Cliente(int DNI, String Nombres, int Telefono, String Direccion, String Distrito) {
        this.DNI = DNI;
        this.Nombres = Nombres;
        this.Telefono = Telefono;
        this.Direccion = Direccion;
        this.Distrito = Distrito;
    }

    

}
