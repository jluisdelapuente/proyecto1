package app.clase4.hilos;

public class Hilos {

    public static void main(String[] args) {
        //  Hilos.testHiloHerencia();
        Hilos.TestHiloInterface();
    }

    public static void testHiloHerencia() {
        HilosHerencia hilo = new HilosHerencia();
        hilo.start();
    }

    public static void TestHiloInterface() {
        HiloIMplementacion hilo = new HiloIMplementacion();

        Thread runner = new Thread(hilo);
        runner.start();
    }
    
    
    
}
