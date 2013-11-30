package app.clase5.socket.sockethilos;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClienteHilos {

    private String host;
    private int port;

    public ClienteHilos(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public void doConectar() {
        try {
            Socket cliente = new Socket(host, port);
// Crear los canales de lectura y escritura
            BufferedReader in = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
            PrintWriter out = new PrintWriter(cliente.getOutputStream(), true);
// COMUNICACION 1
            String msg = in.readLine();
            System.out.println(msg);
// COMUNICACION 2
            out.println("CLIENTE: José Luis ");
            out.println("d");
            
            
            out.println(15);
            out.println(0);
            
            msg = in.readLine();
            System.out.println(msg);
            
            msg = in.readLine();
            System.out.println(msg);
            
            msg = in.readLine();
            System.out.println(msg);
            
// Cerrar canales
            in.close();
            out.close();
            cliente.close();
        } catch (Exception e) {
            System.out.println("Error Cliente : " + e.getMessage());
        }


    }
}
