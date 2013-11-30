package app.clase5.socket.sockethilos;

public class TestCliente {
   
    public static void main(String[] args) {
        ClienteHilos cliente = new ClienteHilos("localhost", 2365);
        cliente.doConectar();
    }
    
}