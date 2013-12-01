package app.hymenopteraEspecie.apicultores.colonia;

public  abstract class Hymenoptera {
   private String especie;
   private int ciclo;
   private String funciones;
   
    public abstract void alimento();

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getCiclo() {
        return ciclo;
    }

    public void setCiclo(int ciclo) {
        this.ciclo = ciclo;
    }

    public String getFunciones() {
        return funciones;
    }

    public void setFunciones(String funciones) {
        this.funciones = funciones;
    }

  

    

    
    }
    
   