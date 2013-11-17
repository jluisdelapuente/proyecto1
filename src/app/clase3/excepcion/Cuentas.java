package app.clase3.excepcion;

public class Cuentas {

    String nombre;
    double saldo;

    public Cuentas(String nombre, double saldo) {
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public double retirarCajero(double montoRerito) throws saldoInsuficienteException {

        if (montoRerito > saldo) {
            throw new saldoInsuficienteException(saldo, montoRerito);
        }


        this.saldo = saldo - montoRerito;
        return saldo;



    }
}
