package app.clase2.tarea.mediateca;

import app.clase2.tarea.mediateca.medios.Audio;
import app.clase2.tarea.mediateca.medios.Libro;
import app.clase2.tarea.mediateca.medios.Medio;
import app.clase2.tarea.mediateca.medios.Video;
import app.clase2.tarea.mediateca.prestamo.Mediateca;
import app.clase2.tarea.mediateca.prestamo.Prestamo;
import app.clase2.tarea.mediateca.prestamo.Socio;
import java.text.NumberFormat;
import java.util.Locale;

public class RegistroPrestamo {

    public static void main(String[] args) throws Exception {
        
        Libro libro = new Libro("GGM","Cien Años de Soledad");
        libro.setNumeroPaginas(300);
        
        libro.printDetalle();
        
        Video video = new Video("PJ","El Hobbit");
        video.printDetalle();
        
    }

    public static void ejecutarPrestamos() {
        Socio socioJose = new Socio("Jose");
        RegistroPrestamo.doPrestamo(socioJose, Mediateca.bohemioCalamaro, 1);
        RegistroPrestamo.doPrestamo(socioJose, Mediateca.cancionAnimalSoda, 10);
        RegistroPrestamo.doPrestamo(socioJose, Mediateca.cienSoledad, 40);
        RegistroPrestamo.doPrestamo(socioJose, Mediateca.gameThrones, 8);


        Socio socioJorge = new Socio("Jorge");
        RegistroPrestamo.doPrestamo(socioJose, Mediateca.darkKnight, 2);
        RegistroPrestamo.doPrestamo(socioJorge, Mediateca.cienSoledad, 5);
    }

    public static void doPrestamo(Socio socio, Medio medio, Integer dias) {

        if (socio.getTotal() < 3) {
            Prestamo prestamo = new Prestamo();
            prestamo.setMedio(medio);


            if (medio instanceof Libro) {
                if (dias > 15) {
                    System.out.println("Límite no permitido. Máx 15 días");
                    return;
                }
                prestamo.setNumeroDias(dias);
                prestamo.setCostoTotal(dias * 5d);

            } else if (medio instanceof Video) {
                if (dias > 3) {
                    System.out.println("Límite no permitido. Máx 3 días");
                    return;
                }
                prestamo.setNumeroDias(dias);
                prestamo.setCostoTotal(dias * 10d);

            } else if (medio instanceof Audio) {
                if (dias > 5) {
                    System.out.println("Límite no permitido. Máx 5 días");
                    return;
                }
                prestamo.setNumeroDias(5);
                prestamo.setCostoTotal(20d);
            }

            socio.addPrestamo(prestamo);
            RegistroPrestamo.printPrestamoDetalle(prestamo);


        } else {

            System.out.println("Ud. ha alcanzado el límite de prestamos");
        }
    }

    public static void printPrestamoDetalle(Prestamo prestamo) {
        Medio medio = prestamo.getMedio();
        Locale locale = new Locale("es", "PE");
        NumberFormat formatoSoles = NumberFormat.getCurrencyInstance(locale);


        StringBuffer mensaje = new StringBuffer("Prestamo ");
        mensaje.append(medio.getClass().getSimpleName() + " :");
        mensaje.append(" ");
        mensaje.append(medio.getAutor() + " - " + medio.getTitulo());
        mensaje.append(" -> ");
        mensaje.append(prestamo.getNumeroDias());
        mensaje.append("días \t");
        mensaje.append(formatoSoles.format(prestamo.getCostoTotal()));

        System.out.println(mensaje);
    }
}
