
package entrada;

import java.util.Scanner;

public class Entrada {

    
    public static void main(String[] args) {
        //En este segmento introducimos datos
       System.out.println("Introduce una palabra: ");
        Scanner primeraentrada = new Scanner(System.in);
        //Los devolvemos en pantalla
        
        System.out.println("La palabra que has escrito es: "+primeraentrada.nextLine());
        
        
    }
}
