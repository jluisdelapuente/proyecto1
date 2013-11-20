
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio07 {

    public static void main(String[] args) {

        try {
            Scanner stdIn = new Scanner(System.in);
            System.out.print("Dime un número: ");
            int valor1 = stdIn.nextInt();
            System.out.print("Dime otro número: ");
            int valor2 = stdIn.nextInt();
            System.out.print("Suma: ");
            int resultado = valor1 + valor2;
            System.out.println(resultado);

        } catch (InputMismatchException mate) {
            System.out.println("Dato Ingresado no es CORRECTO");
        } finally {
            System.out.println("FIN DEL PROGRAMA");
        }

    }

}
