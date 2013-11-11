package app.clase3.tarea.CentrosDistribucion.datos;

public abstract class Apertura {
   
    private String botica; // botica atencion 24 horas 
    private String farmacia; // horario de atencion
    
        
    public abstract void boticaAtencion();
        
    public abstract void farmaciaAtencion();

    public String getBotica() {
        return botica;
    }

    public void setBotica(String botica) {
        this.botica = botica;
    }

    public String getFarmacia() {
        return farmacia;
    }

    public void setFarmacia(String farmacia) {
        this.farmacia = farmacia;
    }
    
    
    
}
