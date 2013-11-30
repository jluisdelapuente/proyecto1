package app.clase5.socket.sockethilos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ServidorHilo extends Thread {

    private Socket cliente;

    public ServidorHilo(Socket cliente) {
        this.cliente = cliente;
    }

    @Override
    public void run() {
        try {
// Crear los canales de lectura y escritura
            PrintWriter out = new PrintWriter(cliente.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    cliente.getInputStream()));
// COMUNICACION 1
            out.println("SERVIDOR: Bienvenido, ¿Cómo te llamas? ");
            String operacion = in.readLine();
            



// COMUNICACION 2
            String respuestaCliente = in.readLine();
            System.out.println(respuestaCliente);
            /* Cerramos el canal */
            in.close();
            out.close();
            cliente.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (cliente != null) {
                    cliente.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

    private void calculadora(PrintWriter out, BufferedReader in) throws IOException {

        String nombre = in.readLine();
        System.out.println(nombre);

        String operacion = in.readLine();
        Double operacor1 = Double.parseDouble(in.readLine());
        Double operacor2 = Double.parseDouble(in.readLine());

        if (operacion.equals("s")) {
            out.println("SERVIDOR: SUMA");
            out.println(operacor1 + operacor2);
            
        } else if (operacion.equals("r")) {
            out.println("SERVIDOR: MULTIPLICACION");
            out.println(operacor1 - operacor2);
            
        } else if (operacion.equals("m")) {
            out.println("SERVIDOR: MULTIPLICACION");
            out.println(operacor1 * operacor2);
            
        } else if (operacion.equals("d")) {
            out.println("SERVIDOR: DIVICION");
            out.println(operacor1 / operacor2);
        }



    }
}
}
