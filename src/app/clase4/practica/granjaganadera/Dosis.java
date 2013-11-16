package app.clase4.practica.granjaganadera;

public class Dosis extends Dieta {

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
    
    
    
    
}
