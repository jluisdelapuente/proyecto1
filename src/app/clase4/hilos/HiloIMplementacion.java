package app.clase4.hilos;

public class HiloIMplementacion implements Runnable { // por implementacion

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(i);
        }

    }
}
