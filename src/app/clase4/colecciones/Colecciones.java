package app.clase4.colecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Colecciones {

    public static void main(String[] args) {
        Colecciones.ejemploEstudiante();
    }

    public static void ejemploEstudiante() {

        Estudiante jose new  Estudiante("José", "Eusebio Alderete");
        Estudiante gomes new  Estudiante("Jean", "Gomez Gutierrez");
        Estudiante jorge new  Estudiante("Jorge", "Ortiz Pisco");
        Estudiante luis new  Estudiante("Luis", "Gutierrez Paloma");
        Estudiante refa new  Estudiante("Rafael", "Lopez Ponce");


        List<Estudiante> listado = new ArrayList<Estudiante>();
        listado.add(luis);
        listado.add(jose);
        listado.add(rafa);
        listado.add(jorge);
        listado.add(gomez);

        Collection.sort(listado);

        for (Estudiante estudiante : listado) {
            estudiante.prinEstudiante();

        }
    }
}
