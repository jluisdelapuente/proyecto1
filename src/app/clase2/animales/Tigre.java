package app.clase2.animales;

public class Tigre extends Animal {

    public Tigre(String nombre, int edad) {
        this.setNombre(nombre);
        this.setEdad(edad);
    }

    public void hacerRuido() {
        System.out.println("GRRRRR");
    }

    public void hacerRuido(Boolean molestar) {
        System.out.println("GRUHUSAHUSD");
    }
}
