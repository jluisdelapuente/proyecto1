
package app.clase3.interfaces.capital;


public class Oracion implements Capitalizable{
   
    private String texto;
    
    

    public Oracion(String texto) {
        this.texto = texto;
    }

    @Override
    public String cambiaMayuscula() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String cambiaMinuscula() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    
}
