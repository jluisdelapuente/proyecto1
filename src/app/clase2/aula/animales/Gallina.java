
package app.clase2.aula.animales;

public class Gallina extends Animal{

    public Gallina(String nombre, int edad) {
        this.setNombre(nombre);
        this.setEdad(edad);
    }

    @Override
    public void hacerRuido() {
        System.out.println("COC COC");
    }

    @Override
    public void comer() {
        System.out.println("Maiz");
    }
    
    
    
    
}
