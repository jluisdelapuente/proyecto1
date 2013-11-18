
public class Libro {
    private final String titulo;
    private final String autor;
    private double calificacion;

    public Libro(String titulo, String autor, double calificacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.calificacion = calificacion;
    }

    public String getAutor() {
        return autor;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }




}
