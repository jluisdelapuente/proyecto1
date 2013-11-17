package App.clase4.colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Colecciones {

    public static void main(String args[]) {
        //Colecciones.ejemploEstudiantes();
        //Colecciones.ejemploLinkedList();
        Colecciones.ejemploMap();
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

    public static void ejemploMap() {
        Estudiante juan = new Estudiante("Alberto", "Zapata", "Bolognesi 123", 100525);
        Estudiante luis = new Estudiante("Benjamin", "Ayasta", "Libertad 987", 100526);
        Estudiante jose = new Estudiante("Carlos", "Lopez", "Union 456", 100527);

        HashMap<String, Estudiante> listado = new HashMap<>();
        listado.put("123", juan);
        listado.put("124", luis);
        listado.put("125", jose);

        listado.get("123").printEstudiante();

        Collections<Estudiante> listadoMap = listado.values();
        for (Estudiante estudiante : listadoMap) {
            estudiante.prinEstudiante();

        }
    }
}