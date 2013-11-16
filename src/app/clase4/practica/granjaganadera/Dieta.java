package app.clase4.practica.granjaganadera;

import app.clase2.aula.animales.Animal;


public abstract class Dieta extends Animal {

    private String suministrar;

    public abstract void cantidadAlimento();

    public abstract void cantidadAgua();

    public String getSuministrar() {
        return suministrar;
    }

    public void setSuministrar(String suministrar) {
        this.suministrar = suministrar;
    }

    public Dieta(String suministrar) {
        this.suministrar = suministrar;
    }

    @Override
    public String getNombre() {
        return super.getNombre(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getColor() {
        return super.getColor(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setColor(String color) {
        super.setColor(color); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getPeso() {
        return super.getPeso(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setPeso(double peso) {
        super.setPeso(peso); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getEdad() {
        return super.getEdad(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setEdad(int edad) {
        super.setEdad(edad); //To change body of generated methods, choose Tools | Templates.
    }

    
}
