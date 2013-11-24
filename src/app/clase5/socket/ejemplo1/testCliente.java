package app.clase5.socket.ejemplo1;

public class testCliente {
  
    public static void main(String[] args) {
        Cliente cliente = new Cliente("192.168.14.12", 2365);
        cliente.doConectar();
    }
}
