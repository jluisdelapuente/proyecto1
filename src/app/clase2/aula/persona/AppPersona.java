
package app.clase2.aula.persona;

import app.clase2.aula.bicicleta.Bicicleta;

public class AppPersona {
    public static void main(String[] args) {
        
        Persona jose = new Persona("José","EA", 25);

        System.out.println("Atributos del Objeto");
        System.out.println("Nombres: "+jose.getNombres());
        System.out.println("Apellidos: "+jose.getApellidos());
        
        Persona luis = new Persona();
        luis.setNombres("Luis");
        luis.setApellidos("EA");
        luis.printNombreCompleto();
        
        
        Persona carlo = new Persona();
        carlo.setNombresApellidos("Carlo", "EA");
        carlo.printNombreCompleto();
        
    }
    
    
    
}
