package app.clase4.hilos;

public class HilosHerencia extends Thread { // por herencia
       
    @Override
    public void run() {
        for (int i = 0; i < 150; i++) {
            System.out.print(" "+i);
        }
    }
    /*
        public static void main(String[] args) {
            HilosHerencia hilo = new HilosHerencia();
            hilo.start();
               }
*/    
}
