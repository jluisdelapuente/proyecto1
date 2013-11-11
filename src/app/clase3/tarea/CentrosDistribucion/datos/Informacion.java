package app.clase3.tarea.CentrosDistribucion.datos;

public abstract class Informacion {

    private String código;
    private int RUC;
    private String razónSocial;
    private String dirección;
    private int teléfonos;

    public String getCódigo() {
        return código;
    }

    public void setCódigo(String código) {
        this.código = código;
    }

    public int getRUC() {
        return RUC;
    }

    public void setRUC(int RUC) {
        this.RUC = RUC;
    }

    public String getRazónSocial() {
        return razónSocial;
    }

    public void setRazónSocial(String razónSocial) {
        this.razónSocial = razónSocial;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public int getTeléfonos() {
        return teléfonos;
    }

    public void setTeléfonos(int teléfonos) {
        this.teléfonos = teléfonos;
    }
    
    
    
}
