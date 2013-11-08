
package acadena;



public class encadenar {
    private int mes;
    private int dia;
    private int anio;   
    
    public encadenar(int m, int d, int a){
    mes = m;
    dia = d;
    anio = a;
    System.out.printf("El constructor es: %s\n", this);
    }
    
    public String toString(){
        return String.format("%d/%d/%d", mes,dia,anio);
    }
}
