package app.clase4.colecciones;

public class Colecciones {

    public static void ejemploEstudiena() {

        Estudiante e1 = new Estudiante("Alberto", "Zapata", "Bolognesi 123", 100525);
        Estudiante e2 = new Estudiante("Benjamin", "Ayasta", "Libertad 987", 100526);
        Estudiante e3 = new Estudiante("Carlos", "Lopez", "Union 456", 100527);
// ArrayList
        ArrayList<Estudiante> c = new ArrayList<Estudiante>();
        c.add(e1);
        c.add(e2);
        c.add(e3);
        Collections.sort(c);
        for (Estudiante e : c) {
            System.out.println(e.getNombres() + " " + e.getApellidos());
        }

    }
}
