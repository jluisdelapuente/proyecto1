package app.clase2.animales;

public class Zoologico {

    public static void main(String[] args) {

        Tigre diego = new Tigre("Diego", 20);
        diego.hacerRuido();
        diego.hacerRuido(true);
        diego.comer();

        Gato benito = new Gato("Fy", 2);
        benito.hacerRuido();
        benito.comer();

        Vicuña charli = new Vicuña("Richar", 30);
        charli.hacerRuido();
        charli.comer();
        
    }
}
