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

    
}
