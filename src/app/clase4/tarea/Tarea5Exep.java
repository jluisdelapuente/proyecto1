package app.clase4.tarea;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tarea5Exep {

    public static void main(String[] args) {
        // TODO code application logic here

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

}
