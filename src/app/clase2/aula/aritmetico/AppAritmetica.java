
package app.clase2.aula.aritmetico;

public class AppAritmetica {
    
    public static void main(String[] args) {
        
        Operaciones operacion = new Operaciones();
        double suma = operacion.sumar(10, 20);
        System.out.println(suma);
        
        
        int mayor = operacion.getMax(10, 11);
        System.out.println(mayor);
        
        float mayorFloat = operacion.getMax(10f, 50f);
        System.out.println(mayorFloat);
        
    }
}
