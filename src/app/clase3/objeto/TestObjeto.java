package app.clase3.objeto;

public class TestObjeto {

    public static void main(String[] arg) {
        Socio JOSE = new Socio(12, "David", "Tecsup");
        Socio LUIS = new Socio(12, "David", "Tecsup");
        if (JOSE == LUIS) {
            System.out.println("Comprobando referencia");
        }
        if (JOSE.equals(LUIS)) {
            System.out.println("Comprobando el valor");
        }


    }
    
}
