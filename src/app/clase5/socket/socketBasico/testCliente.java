package app.clase5.socket.socketBasico;

public class testCliente {
  
    public static void main(String[] args) {
        Cliente cliente = new Cliente("192.168.1.150", 2365);
        cliente.doConectar();
    }
}
