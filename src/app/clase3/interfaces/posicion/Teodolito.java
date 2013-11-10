
package app.clase3.interfaces.posicion;

public class Teodolito {
    
    public void getDistancia(Position p1, Position p2){
        
        double resultado = p2.getLongitud() - p1.getLongitud();
        
        System.out.println(resultado);
    
}
    
    
}
