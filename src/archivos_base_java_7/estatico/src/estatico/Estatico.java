
package estatico;


public class Estatico {

    
    public static void main(String[] args) {
        
        club miembro1 = new club("Juan","Lopez");
        club miembro2 = new club("Jaime","Gimenez");
        club miembro3 = new club("Javier","Garcia");
        
        System.out.println();
        System.out.println("El nombre del socio es " + miembro2.getNombre());
        System.out.println("El apellido del socio es "+ miembro2.getApellido());
        System.out.println("El numero total de socios es " + miembro2.getMiembros());
        
    }
}
