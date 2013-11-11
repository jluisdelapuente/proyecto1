package app.clase3.interfaces.posicion;

public class Teodolito {
    
    public static void main(String[] args) {
        
        Position carro = new Auto(120,150);
        Position jose = new Persona(50,2000);       
        
            
        
        Teodolito.getDistancia(carro,jose);
        
    }
    
    public static void getDistancia(Position p1, Position p2){
        
        double d1 = p1.getLatitud() - p2.getLatitud();
        double d2 = p1.getLongitud() -p2.getLongitud();
        
        //System.out.println("Distancia aproximada es : ");
        System.out.println("La Distancia Aproximada es : "+(Math.sqrt( d1 * d1 + d2 * d2)));
        
    }    
}  