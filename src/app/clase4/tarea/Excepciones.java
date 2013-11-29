package app.clase4.tarea;

import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Excepciones {

    public static void main(String[] args) {

        Excepciones.Ejemplo1();
        //   Excepciones.Ejemplo2();
        //   Excepciones.Ejemplo3();
        //   Excepciones.Ejemplo4();
        //   Excepciones.Ejemplo5();
        //   Excepciones.Ejemplo6();
        //   Excepciones.Ejemplo7();
        //   Excepciones.Ejemplo8();
        //   Excepciones.Ejemplo9();
        //   Excepciones.Ejemplo10();

    }

    public static void Ejemplo1() {
        int i = 12;
        int j = 10;
        int suma = i + j;
        int resta = i - j;
        int mult = i * j;
        int div = i / j;
        int modulo = i % j;

        System.out.print("Suma :");
        System.out.println(suma);
        System.out.print("Resta :");
        System.out.println(resta);
        System.out.print("Multiplicacion :");
        System.out.println(mult);
        System.out.print("Division :");
        System.out.println(div);
        System.out.print("Modulo :");
        System.out.println(modulo);

    }

    public static void Ejemplo2() { //como buscar el error!!!
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

    public static void Ejemplo3() {
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

    public static void Ejemplo4() {
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

    public static void Ejemplo5() {
        try {

            Scanner stdIn = new Scanner(System.in);
            System.out.print("Ingresar temperatura en Farenheit:");
            float valor = stdIn.nextFloat();
            double resultado = (5.0 / 9.0) * (valor - 32);
            System.out.print("La temperaturan en Celsius: ");
            System.out.println(resultado);

        } catch (InputMismatchException e) {
            System.out.println("Error de Datos");
        } finally { // se puede colocar como no.
            System.out.println("Fin del programa");

        }
    }

    public static void Ejemplo6() {
        String str1 = "12";
        String str2 = "7";
        String respuesta;
        int numerador, denominador, cociente;
        try {
            numerador = Integer.parseInt(str1);
            denominador = Integer.parseInt(str2);
            cociente = numerador / denominador;
            respuesta = String.valueOf(cociente);
        } catch (NumberFormatException ex) {
            respuesta = "Se han introducido caracteres no numéricos";
        } catch (ArithmeticException ex) {
            respuesta = "División entre cero";
        }
        System.out.println(respuesta);
    }

    public static void Ejemplo7() {
        int cinco = 5;
        int cero = 0;
        try {
            System.out.println(cinco / cero);
        } catch (ArithmeticException jl) {
            JOptionPane.showMessageDialog(null, "DATO ERRONEO " + jl.getLocalizedMessage());
            //  System.out.println(exception);
        }

        System.out.println("Fin del programa");
    }

    public static void Ejemplo8() {
//Variable que nos dirá si es un número o no
        boolean entero = true;
        //Cadena que evaluaremos
        String cadena = "JLUIS";
        try {
            //Parseo de String a Integer
            Integer.parseInt(cadena);
        } catch (NumberFormatException nfe) {
            //En caso de excepción
            JOptionPane.showMessageDialog(null, "Error " + nfe.getLocalizedMessage());
            entero = false;
        } finally {
            //Mostramos el resultado de la evaluación
            JOptionPane.showMessageDialog(null, entero);

        }
    }

    public static void Ejemplo9() {
        try {

            Scanner stdIn = new Scanner(System.in);

            System.out.println("Introduce los sigientes datos:");

            System.out.print("Nombre: ");
            String nombre = stdIn.next();

            System.out.print("Edad: ");
            int edad = stdIn.nextInt();

            System.out.print("DNI: ");
            int dni = stdIn.nextInt();

            System.out.print("Teléfono de contacto: ");
            int telefono = stdIn.nextInt();

            System.out.print("Correo electrónico: ");
            String correo = stdIn.next();

            System.out.println("############################################");
            System.out.println("Datos personales:");
            System.out.print("Nombre y apellidos: \"");
            System.out.print(nombre);
            System.out.println("\"");
            System.out.print("Edad: ");
            System.out.println(edad);
            System.out.print("DNI: \"");
            System.out.print(dni);
            System.out.println("\"");
            System.out.print("Teléfono de contacto: ");
            System.out.println(telefono);
            System.out.print("Correo electrónico: \"");
            System.out.print(correo);
            System.out.println("\"");
            System.out.println("############################################");

        } catch (InputMismatchException e) {
            System.out.println("DATO INGRESADO ES TEXTO");
            e.printStackTrace();
        } finally { // se puede colocar como no.
            System.out.println("PROGRAMA FINALIZADO.");
        }
    }

    public static void Ejemplo10() {
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
