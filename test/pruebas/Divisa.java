/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

/**
 *
 * @author alumno
 */
public class Divisa {
   private int importe;
    private String denominación;

    public Divisa(int imp, String den) {
        this.importe = imp;
        this.denominación = den;
    }

    public int getImporte() {
        return importe;
    }

    public String getDenominación() {
        return denominación;
    }

    public Divisa sumar(Divisa d) throws ESxception, Exception {
        Divisa res;
        if (d.denominación.equals(this.denominación)) {
            res = new Divisa(d.importe + this.importe, denominación);
            return res;
        } else {
            throw new Exception("Denominación diferente: no se pueden sumar");
        }
    }

    private static class ESxception extends Exception {

        public ESxception() {
        }
    }
 
}
