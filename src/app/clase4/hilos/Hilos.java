package app.clase4.hilos;

public class Hilos {

    public static void main(String[] args) {
        Hilos.testHiloHerencia();
    }
    
        public static void testHiloHerencia() {
        HilosHerencia hilo = new HilosHerencia();
        hilo.start();
    }
}
