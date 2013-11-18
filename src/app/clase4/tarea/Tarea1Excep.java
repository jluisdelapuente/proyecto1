
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 */
public class Tarea1Excep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            System.out.println("Introduzca la longitud del array");
            Scanner sc = new Scanner(System.in);
            int lgtud = sc.nextInt();
            System.out.println("Introduzca los " + lgtud + " valores del array");

            int[] array1 = new int[lgtud];
            int[] array2 = new int[lgtud];

            for (int i = 0; i < lgtud; i++) {
                System.out.println("Introduzca el valor " + i + " del array1");
                array1[i] = sc.nextInt();
            }
            for (int i = 0; i < lgtud; i++) {
                System.out.println("Introduzca el valor " + i + " del array2");
                array2[i] = sc.nextInt();
            }

            int[] res = new int[lgtud];
            System.out.println("El resultado es");
            for (int i = 0; i < lgtud; i++) {
                res[i] = array1[i] * array2[i];
                System.out.print(res[i] + " ");
            }
            System.out.println();

        } catch (InputMismatchException e) {
            System.out.println("DATO INGRESADO ES TEXTO");
            e.printStackTrace();
        } finally { // se puede colocar como no.
            System.out.println("PROGRAMA FINALIZADO.");
        }
    }
}
