
package app.clase3.interfaces.capital;

public class Imprenta {
    
    public static void main(String[] args) {
        
        Capitalizable[] array = new Capitalizable[3];
        
        array[0] = new Palabra("hola");
        array[1] = new Oracion("EL muercielago rojo.");
        array[2] = new Palabra("java");
        
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].cambiaMayuscula());
            
        }
    }
    
}
