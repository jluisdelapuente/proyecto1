
import java.util.InputMismatchException;
import java.util.Scanner;
import org.omg.CosNaming.NamingContextPackage.CannotProceed;

public class tarea3Excep {

    public static void main(String[] args) {

        try {
            Scanner stdIn = new Scanner(System.in);
            System.out.print("Dime un número: ");
            int valor1 = stdIn.nextInt();
            boolean mul2 = ((valor1 % 2) == 0);
            boolean mul3 = ((valor1 % 3) == 0);
            boolean mul5 = ((valor1 % 5) == 0);
            String res2 = mul2 ? "Es múltiplo de 2" : "No es múltiplo de 2";
            String res3 = mul3 ? "Es múltiplo de 3" : "No es múltiplo de 3";
            String res5 = mul5 ? "Es múltiplo de 5" : "No es múltiplo de 5";
            System.out.println(res2);
            System.out.println(res3);
            System.out.println(res5);
            
        } catch (InputMismatchException e) {
            System.out.println("DATO INGRESADO ES ERRONEO");
            System.out.println("Los Errores se detallan líneas abajo:");
            e.printStackTrace();
        } finally { // se puede colocar como no.
            System.out.println("PROGRAMA FINALIZADO.");
        }

    }

}
