package app.clase5.socket.sockethilos;

import app.clase5.socket.socketBasico.Cliente;

public class TestCliente {
   
    public static void main(String[] args) {
        Cliente cliente = new Cliente("192.168.14.12", 2365);
        cliente.doConectar();
    }
    
}