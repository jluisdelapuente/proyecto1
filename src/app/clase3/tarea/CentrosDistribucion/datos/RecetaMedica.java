package app.clase3.tarea.CentrosDistribucion.datos;

import java.util.Date;

public abstract class RecetaMedica {

    private Cliente Cliente; // las clases se pueden usar como tipo
    private Date fechaemision;
    private Date fechavencimiento;
    private int cantidad;
    private String medicamento;
    private Medico  medico;

    public RecetaMedica(Cliente Cliente, Date fechaemision, Date fechavencimiento, int cantidad, String medicamento, Medico medico) {
        this.Cliente = Cliente;
        this.fechaemision = fechaemision;
        this.fechavencimiento = fechavencimiento;
        this.cantidad = cantidad;
        this.medicamento = medicamento;
        this.medico = medico;
    }

    public Cliente getCliente() {
        return Cliente;
    }

    public void setCliente(Cliente Cliente) {
        this.Cliente = Cliente;
    }

    public Date getFechaemision() {
        return fechaemision;
    }

    public void setFechaemision(Date fechaemision) {
        this.fechaemision = fechaemision;
    }

    public Date getFechavencimiento() {
        return fechavencimiento;
    }

    public void setFechavencimiento(Date fechavencimiento) {
        this.fechavencimiento = fechavencimiento;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(String medicamento) {
        this.medicamento = medicamento;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

   

}
