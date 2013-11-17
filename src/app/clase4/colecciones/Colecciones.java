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
        List<Estudiante> c = new ArrayList<>();
        c.add(JUAN);
        c.add(LUIS);
        c.add(PEDRO);
        Collections.sort(c);
        for (Estudiante e : c) {
            System.out.println(e.getNombres() + " " + e.getApellidos());
        }
    }

    public static void ejemploLinkedList() {
        Estudiante e1 = new Estudiante("Alberto", "Zapata");
        Estudiante e2 = new Estudiante("Benjamin", "Ayasta");
        Estudiante e3 = new Estudiante("Carlos", "Lopez");
// LinkedList
        LinkedList<Estudiante> pila = new LinkedList<>();
        pila.addFirst(e1);
        pila.addFirst(e2);
        pila.addFirst(e3);
        ListIterator<Estudiante> ite = pila.listIterator();
        while (ite.hasNext()) {
            Estudiante e = (Estudiante) pila.poll();
            System.out.println(e.getNombres());
        }
        System.out.println(pila.size());
    }
}
