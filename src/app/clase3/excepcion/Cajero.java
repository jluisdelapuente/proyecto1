package app.clase3.excepcion;

public class Cajero {

    public static void main(String[] args) {

        try {

            Cuentas cuentaJose = new Cuentas("Jose", 5000);

            System.out.println("SALDO:" + cuentaJose.retirarCajero(3000));
            System.out.println("SALDO:" + cuentaJose.retirarCajero(3000));
        } catch (saldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }

    }
}
