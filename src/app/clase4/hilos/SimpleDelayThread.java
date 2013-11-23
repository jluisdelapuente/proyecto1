package app.clase4.hilos;

public class SimpleDelayThread extends Thread {
    private String delay;

        public void run(String nombre) {

        for (int i = 0; i < 5; i++) {
            System.out.println("NOmbre" + nombre + "Delay" + delay);
            try {

                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.println(i);
        }

    }
    }

