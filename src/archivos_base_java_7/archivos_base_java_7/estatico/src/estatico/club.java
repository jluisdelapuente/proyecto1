
package estatico;


public class club {
    private String nombre;
    private String apellido;
    private static int contador = 0;
    
    
   public club(String nom, String ape){
       nombre = nom;
       apellido = ape;
       contador++;
       System.out.printf("Constructor para %s %s, hay %d\n", nombre, apellido, contador);
   }
  public String getNombre(){
      return nombre;
  }
  public String getApellido(){
      return apellido;
  }
  public static int getMiembros(){
      return contador;
    }
  
}
