package app.clase3.excepcion;

public class Excepcion {

    private static int dividendo;

    public static void main(String[] args) {
        //Excepcion.testExcepcion();
        //Excepcion.testExcepcion2();
        Excepcion.testExepcion3();
    }

    public static void testExcepcion() {

        try {
            int dividendo = 10;
            int divisor = 10;
            int resultado = dividendo / divisor;
        } catch (Exception e) {
            System.out.println("Hubo un Error: " + e.getMessage());
            e.printStackTrace(); //INDICA POSICION DEL ERROR.
        }
        System.out.println("PROGRAMA TERMINADO");
    }

    public static void testExcepcion2() {

        try {
            // ERROR ARIMETICO
            int dividendo = 10;
            int divisor = 0;
            int resultado = dividendo / divisor;

            // ERROR ARRAY
            int[] array = new int[2];
            array[10] = 100;

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error Array: ");
        } catch (ArithmeticException e) {
            System.out.println("Error Matematica");
        } finally { // se puede colocar como no.
            System.out.println("Fin del programa");
        }
    }

    public static void testExepcion3() {

        try {
            //int[] numeros = null;
            int[] numeros = {11,2,34,4,6,7,8,98,4,4,8};
            for (int i = 0; i < 11; i++) {
                int j = numeros[i];
                System.out.println(j);
            }

        } catch (NullPointerException e) {
            System.out.println("ERROR ARRAY NULO");
            e.printStackTrace();  //imprime la traza del error.
        }finally{
            System.out.println("Aplicacion terminada");
        }






    }
}