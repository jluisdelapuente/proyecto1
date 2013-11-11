
package app.clase3.interfaces.capital;

public class Oracion implements Capitalizable{

    private String texto;

    public Oracion(String texto) {
        this.texto = texto;
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

