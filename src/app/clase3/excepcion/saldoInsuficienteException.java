package app.clase3.excepcion;

public class saldoInsuficienteException extends Exception {

    public saldoInsuficienteException(double saldo, double cuantoDesea) {
        super("En su cuenta tiene " + saldo + " soles. No puede prestarse " + cuantoDesea + " soles.");
        
    }
}
