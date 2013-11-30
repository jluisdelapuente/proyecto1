package app.clase5.socket.servidorCalculadora;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ServidorHilo extends Thread {

    private Socket cliente;
    double resultado = 0,num1=0,num2=0;
    String tipop = "";

    public ServidorHilo(Socket cliente) {
        this.cliente = cliente;
    }

    @Override
    public void run() {
        try {
            
            PrintWriter out = new PrintWriter(cliente.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
            
            out.println("Ingresa primer numero: ");
            num1 = Double.parseDouble(in.readLine());
            
            out.println("Ingresa segundo numero: ");
            num2 = Double.parseDouble(in.readLine());


            out.println("Elige Operacion: ([S] SUMA | [1] RESTA | [2] MULTIPLICACION | [3] DIVISION ):");

            String op = in.readLine();

            switch (Integer.parseInt(op)) {
                case 0:
                    resultado = num1 + num2;
                    tipop = " + ";
                    break;
                case 1:
                    resultado = num1 - num2;
                    tipop = " - ";
                    break;
                case 2:
                    resultado = num1 * num2;
                    tipop = " * ";
                    break;
                case 3:
                    resultado = num1 / num2;
                    tipop = " / ";
                    break;
                default:
                    resultado = 0;
                    tipop = "Operacion Desconocida";
            }

            out.println("----> " + num1 + tipop + num2 + " = " + resultado);

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
        }
    }
}