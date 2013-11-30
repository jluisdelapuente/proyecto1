package app.clase5.socket.sockethilos;

public class TestServidor {
    
    public static void main(String[] args) {
              Servidor Server  = new Servidor(2365);
        Server.ejecutar();
    }
}
