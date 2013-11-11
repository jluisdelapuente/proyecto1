package app.clase3.tarea.CentrosDistribucion.datos;

public abstract class Contraindicaciones {

    private String noAdministrarEn;
    private String noTomarCon;

    public abstract void Embarazada();

    public abstract void Niño();
    public abstract void OtroMedicamento();

    public String getNoAdministrarEn() {
        return noAdministrarEn;
    }

    public void setNoAdministrarEn(String noAdministrarEn) {
        this.noAdministrarEn = noAdministrarEn;
    }

    public String getNoTomarCon() {
        return noTomarCon;
    }

    public void setNoTomarCon(String noTomarCon) {
        this.noTomarCon = noTomarCon;
    }

    
    
    
}
