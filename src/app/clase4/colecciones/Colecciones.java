package App.clase4.colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Colecciones {

    public static void main(String args[]) {
        //Colecciones.ejemploEstudiantes();
        Colecciones.ejemploLinkedList();
    }

    public static void ejemploEstudiantes() {
        Estudiante JUAN = new Estudiante("Alberto", "Zapata");
        Estudiante LUIS = new Estudiante("Benjamin", "Ayasta");
        Estudiante PEDRO = new Estudiante("Carlos", "Lopez");
// ArrayList
        List<Estudiante> listado = new ArrayList<>();
        listado.add(JUAN);
        listado.add(LUIS);
        listado.add(PEDRO);
        Collections.sort(listado);
        for (Estudiante e : listado) {
            System.out.println(e.getNombres() + " " + e.getApellidos());
        }
    }

    public static void ejemploLinkedList() {
        Estudiante juan = new Estudiante("Alberto", "Zapata");
        Estudiante pedro = new Estudiante("Benjamin", "Ayasta");
        Estudiante luis = new Estudiante("Carlos", "Lopez");
// LinkedList
        LinkedList<Estudiante> pila = new LinkedList<>();
        pila.addFirst(juan);
        pila.addFirst(pedro);
        pila.addFirst(luis);
        ListIterator<Estudiante> ite = pila.listIterator();
        while (ite.hasNext()) {
            Estudiante e = (Estudiante) pila.poll();
            System.out.println(e.getNombres());
        }
        System.out.println(pila.size());
    }
    
    //public static void ejemplo {
        
    }

