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
            System.out.println("Nombre> "+ nombre + "delay " + delay);
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
            }
    //        System.out.println(nombre + );
        }


    }

    void start() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setPriority(int MAX_PRIORITY) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   }
