package app.clase4.hilos;

public class Hilos {

    private static HiloSimpleDelayThread HiloHiloSimpleDelayThreadrunner;

    public static void main(String[] args) {
        //  Hilos.testHiloHerencia();
        // Hilos.TestHiloInterface();
        // Hilos.testHiloSimpleDelayHilo();
        // Hilos.testPrioridad();
         Hilos.testProcesos();
    }

    public static void testProcesos() {
        ProcesosHilos hilo = new ProcesosHilos();
        hilo.start();
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
    }

    private static void testSimple2DelayThread() {
        /*
         long delay1 = (long) (Math.random() * 2000);
         Simple2DelayThread delay
      
         delay = new Simple2DelayThread("Jose", delay1);
         delay.start();
         * */
    }

    public static void testPrioridad() {
        Simple2DelayThread delayjose = new Simple2DelayThread("Jose", 0);
        Simple2DelayThread delayLuis = new Simple2DelayThread("Luis", 0);

        delayLuis.setPriority(Thread.MAX_PRIORITY);
        delayjose.setPriority(Thread.MIN_PRIORITY);

        delayjose.start();
        delayLuis.start();


    }
}
