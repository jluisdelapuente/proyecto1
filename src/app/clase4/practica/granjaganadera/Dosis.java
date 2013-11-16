package app.clase4.practica.granjaganadera;

public class Dosis extends Dieta {

    private String toma1;
    private String toma2;
    private String toma3;

    @Override
    public void cantidadAlimento() {
        System.out.println("compuesta por cantidades específicas de alimentos ");
    }

    @Override
    public void cantidadAgua() {
        System.out.println("cantidad de agua para mezclar con cada alimento");
    }

    @Override
    public void hacerRuido() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void comer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Dosis(String suministrar) {
        super(suministrar);
    }

    public String getToma1() {
        return toma1;
    }

    public void setToma1(String toma1) {
        this.toma1 = toma1;
    }

    public String getToma2() {
        return toma2;
    }

    public void setToma2(String toma2) {
        this.toma2 = toma2;
    }

    public String getToma3() {
        return toma3;
    }

    public void setToma3(String toma3) {
        this.toma3 = toma3;
    }
}
