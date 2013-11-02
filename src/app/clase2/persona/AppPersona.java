
package app.clase2.persona;

public class AppPersona {
    
    public static void main(String[] args) {
        Persona jose = new Persona("Jose", "de la Puente", 42);
                
        System.out.println("Atributos del Objeto");
        System.out.println("Nombres: "+jose.getNombre());
        System.out.println("Apellidos: "+jose.getApellidos());
        System.out.println("Edad: "+jose.getEdad()+" Anos");
                
    }
}
