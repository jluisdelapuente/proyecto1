
package sobrecarga;


public class cargado {
   
    public cargado(int h){
        System.out.println("La hora es " + h);
    }
    public cargado(int h, int m){
        System.out.println("La hora es " + h + "El minuto es " + m);
    }
    public cargado(int h, int m, int s){
        System.out.println("La hora es " + h + "El minuto es " + m + " Y el segundo es " + s);
    }
    
}
