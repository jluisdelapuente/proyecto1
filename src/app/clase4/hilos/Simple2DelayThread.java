package app.clase4.hilos;

public class Simple2DelayThread {

    private String nombre;
    private long delay;

    public Simple2DelayThread(String nombre, long delay) {
        this.nombre = nombre;
        this.delay = delay;
    }

    public void run() {
//
        for (int i = 0; i < 5; i++) {
            System.out.println("Nombre> "+ nombre + );
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.println(i);
        }


    }
}
