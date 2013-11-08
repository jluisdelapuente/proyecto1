package App.clase2.animales;

public class Vicuña extends Animal {

    public Vicuña(String nombre, int edad) {

        this.setNombre(nombre);
        this.setEdad(edad);
    }

    public void hacerRuido() {
        System.out.println("GRRRRRRRRRRRRR");
    }

    public void hacerRuido(Boolean molestar) {
        System.out.println("ibghrtnhtriontyionmtyionjyotnj");
    }

    public void comer() {
        System.out.println("Carne");
    }

    private void setNombre(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }

    private void setEdad(int edad) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
