
package app.clase3.universo.abstrato;

public abstract class SerVivo {
    
    private String nombre;
    
    public abstract void cocmer();
    public abstract void comuicarse();
    public abstract void sentir();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
 
}
