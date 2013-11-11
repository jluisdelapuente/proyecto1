package app.clase3.objeto;

public class TestObjeto {

    public static void main(String[] args) {

        Socio jose = new Socio(12, "Jose", "Jr. Las Grullas");
        Socio luis = new Socio(12, "Jose", "Jr. Las Grullas");

        if (jose == luis) {
            System.out.println("Comprobando referencia");
        }
        
        
        if (jose.equals(luis)) {
            System.out.println("Comprobando el valor");
            
            System.out.println(jose.toString());
        }


    }
}
