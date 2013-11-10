
package app.clase3.interfaces.capital;

public class Palabra implements Capitalizable{

    private String texto;
    
    Palabra(String hola) {
       
    }

    @Override
    public String cambiaMayuscula() {
        return texto.toUpperCase();
       
    }

    @Override
    public String cambiaMinuscula() {
        return texto.toLowerCase();
        
    }
    
}
