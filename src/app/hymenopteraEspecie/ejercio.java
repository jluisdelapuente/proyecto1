
package app.hymenopteraEspecie;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class ejercio {
    
    public static void main(String[] args) {
        ejercio.Ejemplo6();
    }
     public static void Ejemplo6()1
             {
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

        for (int i = 0; i <= 100; i++) {
            if (frecuencias[i] != 0) {
                System.out.print(i + " : ");
                for (int j = 0; j < frecuencias[i]; j++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
        }
    }

    
}
