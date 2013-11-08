
package controlif;


public class ControlIf {

   
    public static void main(String[] args) {
        String miciudad = "Valencia";
        int edad = 25;
        String mimascota = "Perro";
        
       if(miciudad == "Barcelona" || edad == 33 || mimascota == "Gato"){
           System.out.println("Al menos una de las afirmaciones es cierta");
       }else{
           System.out.println("Ninguna es cierta");
       }
    }
}
