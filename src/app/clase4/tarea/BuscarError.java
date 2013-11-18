
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 */
public class BuscarError {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Introduzca el numero de valores a leer");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] frecuencias = new int[101];

        int numero;
        for (int i = 0; i < num; i++) {

            System.out.println("Introduzca un numero:");
            boolean correcto;
            do {
                numero = sc.nextInt();

                if (numero < 1 || numero > 100) {
                    System.out.println("Error el numero introducido tiene que pertencer al intervalo (0,100)");
                    correcto = false;
                } else {
                    correcto = true;
                }
            } while (!correcto);

            frecuencias[numero]++;
        }

        for (int i=0; i<=100; i++) {
            if (frecuencias[i] != 0) {
                System.out.print(i + " : ");
                for (int j=0; j< frecuencias[i]; j++) System.out.print("*");
                System.out.println("");
            }
        }

    }
}
