
package app.clase2.aritmetico;

public class AppAritmetica {
    public static void main(String[] args) {
        
        Operaciones operaciones = new Operaciones();
        
        double suma = operaciones.sumar(10d, 20d);
        System.out.println("suma");
        
        int mayor = operaciones.getMax(10 , 11);
        System.out.println(mayor);
        
        float mayorFloat = operaciones.getMax(10f, 50f);
        System.out.println(mayorFloat);
    }
}
