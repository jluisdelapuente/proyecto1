package app.clase4.hilos;

public class Hilos {
    private static HiloSimpleDelayThread HiloHiloSimpleDelayThreadrunner;

    public static void main(String[] args) {
        //  Hilos.testHiloHerencia();
        // Hilos.TestHiloInterface();
        Hilos.testHiloSimpleDelayHilo();
    }

    public static void testHiloHerencia() {
        HilosHerencia hilo = new HilosHerencia();
        hilo.start();
    }

    public static void TestHiloInterface(HiloIMplementacion hilo) {
        hilo = new HiloIMplementacion();
        Thread runner = new Thread(hilo);
        runner.start();
    }
    /*
    public static void testHiloSimpleDelayHilo() {
        HiloSimpleDelayThread = new HiloSimpleDelayThread();
        runner.start();
    }
    */

    private static void testHiloSimpleDelayHilo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
}
