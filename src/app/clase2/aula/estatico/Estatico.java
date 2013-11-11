package app.clase2.aula.estatico;

public class Estatico {

    static int contador;

    public Estatico() {
        ++contador;
    }

    public static double dolaraEuro(double dolar) {
        double euro = dolar * 0.81559;
        return euro;
    }
}
