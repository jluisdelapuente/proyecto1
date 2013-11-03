
package app.clase2.animales;

public class Gato extends Animal{
    
      public Gato(String nombre, int edad) {
        this.setNombre(nombre);
        this.setEdad(edad);
    }
        public void hacerRuido() {
        System.out.println("Miau");
    }
    
    
}
