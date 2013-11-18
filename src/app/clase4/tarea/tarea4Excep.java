
import java.util.InputMismatchException;
import java.util.Scanner;

public class tarea4Excep {

    public static void main(String[] args) {

        try {

            Scanner stdIn = new Scanner(System.in);
            System.out.print("Dime un número de 4 dígitos:");
            int valor = stdIn.nextInt();
            int digito1 = valor % 10;
            int digito2 = valor / 10 % 10;
            int digito3 = valor / 100 % 10;
            int digito4 = valor / 1000 % 10;

            digito1 = (digito1 + 7) % 10;
            digito2 = (digito2 + 7) % 10;
            digito3 = (digito3 + 7) % 10;
            digito4 = (digito4 + 7) % 10;

            int temporal;

            temporal = digito1;
            digito1 = digito3;
            digito3 = temporal;

            temporal = digito2;
            digito2 = digito4;
            digito4 = temporal;

            int resultado = digito1 + (digito2 * 10) + (digito3 * 100) + (digito4 * 1000);

            System.out.print("El resultado es ");
            System.out.println(resultado);

        } catch (InputMismatchException e) {
            System.out.println("Datos Ingresado no es Numerico");
        }
        System.out.println("Fin del programa");

    }

}
