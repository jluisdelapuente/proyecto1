
import java.util.InputMismatchException;
import java.util.Scanner;

public class tarea2Excep {

    public static void main(String[] args) {

        try {

            Scanner stdIn = new Scanner(System.in);
            System.out.print("Ingresar temperatura en Farenheit:");
            float valor = stdIn.nextFloat();
            double resultado = (5.0 / 9.0) * (valor - 32);
            System.out.print("La temperaturan en Celsius: ");
            System.out.println(resultado);

        } catch (InputMismatchException e) {
            System.out.println("Error de Datos");
            e.printStackTrace();
        } finally { // se puede colocar como no.
            System.out.println("Fin del programa");

        }

    }
}
