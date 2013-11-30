package app.clase5.socket.servidorCalculadora;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {

    private String host;
    private int port;
    Scanner reader = new Scanner(System.in);

    public Cliente(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public void doConectar() {
        try {
            Socket cliente = new Socket(host, port);

            BufferedReader in = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
            PrintWriter out = new PrintWriter(cliente.getOutputStream(), true);

            String numero1 = in.readLine();
            System.out.print(numero1);
            
            out.println(reader.nextDouble());

            String numero2 = in.readLine();
            System.out.print(numero2);

            out.println(reader.nextDouble());

            String operacion = in.readLine();

            System.out.print(operacion);
            out.println(reader.nextInt());
            
            String resultado= in.readLine();
            System.out.print("Resultado: "+resultado);
            
            in.close();
            out.close();
            cliente.close();
        } catch (Exception e) {
            System.out.println("Error Cliente : " + e.getMessage());
        }
    }
}
