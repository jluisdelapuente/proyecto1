
package app.clase2.aula.animales;

public class Gato extends Animal{
    
      public Gato(String nombre, int edad) {
        this.setNombre(nombre);
        this.setEdad(edad);
    }
      @Override
        public void hacerRuido() {
        System.out.println("Miau");
    }

    @Override
    public void comer() {
        System.out.println("Ratones");
    }
    
    
}
