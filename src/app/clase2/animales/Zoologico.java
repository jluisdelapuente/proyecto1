package app.clase2.animales;

public class Zoologico {

    public static void main(String[] args) {

        Tigre diego = new Tigre("Diego", 20);
        diego.hacerRuido();
        diego.hacerRuido(true);

        Gato benito = new Gato("Fy", 2);
        benito.hacerRuido();

    }
}
