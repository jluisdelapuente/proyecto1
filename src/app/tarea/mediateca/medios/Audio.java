package app.clase2.tarea.mediateca.medios;

public class Audio extends Medio {

    private String lugar;
    private Double duracion;

    public Audio(String autor, String titulo) {
        this.setAutor(autor);
        this.setTitulo(titulo);
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public Double getDuracion() {
        return duracion;
    }

    public void setDuracion(Double duracion) {
        this.duracion = duracion;
    }
}
