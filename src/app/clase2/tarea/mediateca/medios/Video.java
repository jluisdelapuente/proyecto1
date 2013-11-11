package app.clase2.tarea.mediateca.medios;

import java.util.List;

public class Video extends Medio {

    private List<String> actores;
    private Double duracion;

     public Video(String director, String titulo) {
        this.setAutor(director);
        this.setTitulo(titulo);
    }
    
    
    public List<String> getActores() {
        return actores;
    }

    public void setActores(List<String> actores) {
        this.actores = actores;
    }

    public Double getDuracion() {
        return duracion;
    }

    public void setDuracion(Double duracion) {
        this.duracion = duracion;
    }

    public String getDirector() {
        return this.getAutor();
    }

    public void setDirector(String director) {
        this.setAutor(director);
    }
}
