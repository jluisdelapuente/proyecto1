package app.clase5.serializacion;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serializacion {

    public static void main(String[] args) {
        Serializacion.serializarPersona();
        Serializacion.deserializarPersona();
        //deserializarPersona();
    }

    public static void serializarPersona() {
        ObjectOutputStream salida = null;

       // Persona persona = new Persona("Alonso", 23);
        Persona persona = new Persona("José Luis", 42);
        Persona persona2 = new Persona("Fabiola", 27);

        try {
            FileOutputStream archivo = new FileOutputStream("c:\\objeto.txt");
            archivo = new FileOutputStream("c:\\objeto.txt");
            salida = new ObjectOutputStream(archivo);
            salida.writeObject(persona);
            
            salida.flush();
        } catch (IOException e) {
            System.out.println("Imposible crear el archivo o escribir en él");
        } finally {
            try {
                salida.close();
            } catch (IOException e) {
                System.out.println("No pudo cerrarse el canal");
            }
        }


    }

    public static void deserializarPersona() {
        File archivo = new File("c:\\objeto.txt ");
        
        
        try {
            FileInputStream fis = new FileInputStream(archivo);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Persona p1 = (Persona) ois.readObject();
            ois.close();
            fis.close();
            System.out.println("Persona recuperada: " + p1.toString());
        } catch (IOException e) {
            System.err.println(e.toString());
        } catch (ClassNotFoundException e) {
            System.err.println(e.toString());
        }

    }
}
