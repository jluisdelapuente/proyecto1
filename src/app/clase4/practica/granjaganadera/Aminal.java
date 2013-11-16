package app.clase4.practica.granjaganadera;

import java.util.Date;

public abstract class Aminal {

    private String id;
    private String nombre;
    private String especie;
    private String pesoActual;
    private Date fechaNaciemiento;
    private String observaciones;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getPesoActual() {
        return pesoActual;
    }

    public void setPesoActual(String pesoActual) {
        this.pesoActual = pesoActual;
    }

    public Date getFechaNaciemiento() {
        return fechaNaciemiento;
    }

    public void setFechaNaciemiento(Date fechaNaciemiento) {
        this.fechaNaciemiento = fechaNaciemiento;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}
