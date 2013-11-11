package app.clase2.aula.bicicleta;

public class AppBicicleta {

    public static void main(String[] args) {
        
        Bicicleta monark = new Bicicleta();
        monark.setMarca("Monark");
        monark.setModelo("123");
        
        monark.cambiarLlantas();
        System.out.println(monark.getMarca());
        
        
        
    }
    
}
