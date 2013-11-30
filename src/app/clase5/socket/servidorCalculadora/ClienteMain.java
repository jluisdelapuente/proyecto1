package app.clase5.socket.servidorCalculadora;

public class ClienteMain {

    public static void main(String[] args) {
        Cliente c = new Cliente("localhost", 2365);
        c.doConectar();
    }
}
