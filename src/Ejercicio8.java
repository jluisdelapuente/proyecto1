
import javax.swing.undo.CannotUndoException;

public class Ejercicio8 {

    public static void main(String[] args) {

        try {

            int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 8}};

            double determinante = matriz[0][0] * matriz[1][1] * matriz[2][2]
                    + matriz[0][1] * matriz[1][2] * matriz[2][0]
                    + matriz[0][2] * matriz[1][0] * matriz[2][1]
                    - matriz[0][0] * matriz[1][2] * matriz[2][1]
                    - matriz[0][1] * matriz[1][0] * matriz[2][2]
                    - matriz[0][2] * matriz[1][1] * matriz[2][0];

            System.out.println("Determinante es: " + determinante);

        } catch (CannotUndoException e) { //indicar que nombre de error o como hallar el error.
            System.out.println("DATO INGRESADO ES ERRONEO");
        } finally { // se puede colocar como no.
            System.out.println("PROGRAMA FINALIZADO.");
        }
    }
}
