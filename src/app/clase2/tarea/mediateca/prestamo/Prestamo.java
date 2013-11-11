package app.clase2.tarea.mediateca.prestamo;

import app.clase2.tarea.mediateca.medios.Medio;



public class Prestamo {

    private Medio medio;
    private Integer numeroDias;
    private Double costoTotal;

    public Medio getMedio() {
        return medio;
    }

    public void setMedio(Medio medio) {
        this.medio = medio;
    }

    public Integer getNumeroDias() {
        return numeroDias;
    }

    public void setNumeroDias(Integer numeroDias) {
        this.numeroDias = numeroDias;
    }

    public Double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(Double costoTotal) {
        this.costoTotal = costoTotal;
    }

    
    
}
