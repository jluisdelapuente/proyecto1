
package app.clase2.tarea.distribuidora.abstractas;

public abstract class Distribuidoras {
    
     private String razonSocial;
    
    public abstract void articulos();

    public abstract void medicamentos();

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }
    
    
}
