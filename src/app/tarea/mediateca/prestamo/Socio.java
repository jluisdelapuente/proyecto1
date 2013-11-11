package app.clase2.tarea.mediateca.prestamo;

public class Socio {

    private String nombre;
    private Prestamo[] prestamo;
    private int total;

    public Socio(String nombre) {
        this.nombre = nombre;
        this.prestamo = new Prestamo[Mediateca.nroElementosPrestamo];
        this.total = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Prestamo[] getPrestamo() {
        return prestamo;
    }

    public void addPrestamo(Prestamo prestamo) {
        this.prestamo[this.total] = prestamo;
        ++this.total;
    }

    public int getTotal() {
        return total;
    }
    
    
}
