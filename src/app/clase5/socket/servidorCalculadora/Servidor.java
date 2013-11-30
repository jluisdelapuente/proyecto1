package app.clase5.socket.servidorCalculadora;

import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

    private int port;

    public Servidor(int port) {
        this.port = port;
    }

    public void ejecutar() {

        try {
            ServerSocket server = new ServerSocket(port);

            System.out.println("Servidor iniciado...");

            while (true) {
                
                Socket cliente = server.accept();
                ServidorHilo ts = new ServidorHilo(cliente);
                ts.start();

            }

        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
            e.printStackTrace();
        }
    }
}
