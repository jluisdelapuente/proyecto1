 
package App.clase3.cadenas;


public class Cadena {
    
    public static void main(String[] args) {
        //Cadena.concatenar();
        //Cadena.extraccion();
        //Cadena.reemplazo();
        //Cadena.metodosString();
        Cadena.buffer1();
    }

    public static void concatenar() {
        String nombre = "James";
        String apellido = "Gosling";
        if (nombre.equals("James")) {
            System.out.println(nombre + " " + apellido);
        }
        String completo = nombre.concat(" " + apellido);
        if (nombre.equals("James")) {
            System.out.println(completo);
        }
    }

    public static void extraccion() {
        String texto = "Tecsup";
        System.out.println("Número de Caracteres: " + texto.length() + "\n");
        for (int i = 0; i < texto.length(); i++) {
            System.out.println(texto.substring(i, i + 1) + "\n");
        }
    }
    public static void reemplazo() {
        String texto = "java permite crear java applets, javabeans y java servlets"; 
        System.out.println(texto.replaceAll("java","JAVA"));
    }
    public static void metodosString() {
        String texto="quero aprender java";
        System.out.println(texto.toUpperCase());
    }
    
     public static void buffer1() {
         StringBuffer buffer = new StringBuffer("Tecsup");
         buffer.append(" - ");
         buffer.append("Java");
         
         buffer.insert(0, "Instituto");
         
         buffer.delete(buffer.indexOf("Java"),buffer.length());
         
         System.out.println(buffer);
         
         System.out.println(buffer.reverse());
     }
     
     public static void buffer2(){
         }
     
     
     
     
}
