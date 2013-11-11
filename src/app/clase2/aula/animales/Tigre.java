package app.clase2.aula.animales;

public class Tigre extends Animal {

    public Tigre(String nombre, int edad) {
        this.setNombre(nombre);
        this.setEdad(edad);
    }

    @Override
    public void hacerRuido() {
        System.out.println("GRRRRRRR");
    }

    public void hacerRuido(Boolean molestar) {
        System.out.println("GRUHHASDLKHKASDH");
    }

    @Override
    public void comer() {
        System.out.println("Carne");
    }
}
