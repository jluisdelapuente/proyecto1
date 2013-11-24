package app.clase5.serializacion;

import java.io.Serializable;

public class Persona implements Serializable{
 private String nombre;
 private String direccion;
 private int edad;

    public Persona(String nombre, String direccion, int edad) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.edad = edad;
    }

    

    @Override
    public String toString() {
        return this.nombre + " " + this.direccion + " " + this.edad;
    }

 
 
    
}
