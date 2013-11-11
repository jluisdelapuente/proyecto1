package app.clase2.aula.estatico;

public class AppEstatico {

    public static void main(String[] args) {
        AppEstatico.runMetodoEstatico();
    }

    public static void runMetodoEstatico() {
        double euro = Estatico.dolaraEuro(10d);
        System.out.println(euro);
    }

    public static void runAtributoEstatico() {
        System.out.println(Estatico.contador);
        Estatico estaUn = new Estatico();
        Estatico estaDo = new Estatico();
        Estatico estaTre = new Estatico();
        System.out.println(Estatico.contador);
    }
}
