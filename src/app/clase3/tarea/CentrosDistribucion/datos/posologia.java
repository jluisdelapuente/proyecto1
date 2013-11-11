package app.clase3.tarea.CentrosDistribucion.datos;

public abstract class posologia {

    private String modoUso;
    private double dosisKg;
    private String agenteEtiologico;
    private String causasEnfermedad;
    private String diagnósticoPreciso;
    private double pesoPaciente;
    private int edad;
    private String Sexo;

    
    
    public String getModoUso() {
        return modoUso;
    }

    public void setModoUso(String modoUso) {
        this.modoUso = modoUso;
    }

    public double getDosisKg() {
        return dosisKg;
    }

    public void setDosisKg(double dosisKg) {
        this.dosisKg = dosisKg;
    }

    public String getAgenteEtiologico() {
        return agenteEtiologico;
    }

    public void setAgenteEtiologico(String agenteEtiologico) {
        this.agenteEtiologico = agenteEtiologico;
    }

    public String getCausasEnfermedad() {
        return causasEnfermedad;
    }

    public void setCausasEnfermedad(String causasEnfermedad) {
        this.causasEnfermedad = causasEnfermedad;
    }

    public String getDiagnósticoPreciso() {
        return diagnósticoPreciso;
    }

    public void setDiagnósticoPreciso(String diagnósticoPreciso) {
        this.diagnósticoPreciso = diagnósticoPreciso;
    }

    public double getPesoPaciente() {
        return pesoPaciente;
    }

    public void setPesoPaciente(double pesoPaciente) {
        this.pesoPaciente = pesoPaciente;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

}
