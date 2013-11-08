
package trycatch;
import java.util.Scanner;

public class Trycatch {

    public static void main(String[] args) {
       int numero;
       String cadena = "hola";
       
       Scanner dimenumero = new Scanner(System.in);
       
       
        try{
            numero = Integer.parseInt(dimenumero);
            System.out
        }catch(NumberFormatException ex){
            System.out.println("No es un numero, es una cadena");
        }
    }
}
