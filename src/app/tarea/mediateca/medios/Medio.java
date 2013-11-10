package app.clase2.tarea.mediateca.medios;

public abstract class Medio {

    private String titulo;
    private String autor;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void printDetalle() {
        System.out.println(this.autor + " - " + this.titulo);
    }
}
