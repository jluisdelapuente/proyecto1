package app.clase5.socket.servidorCalculadora;

public class ServidorMain {

    public static void main(String[] args) {
        Servidor s = new Servidor(2365);
        s.ejecutar();
    }
}
