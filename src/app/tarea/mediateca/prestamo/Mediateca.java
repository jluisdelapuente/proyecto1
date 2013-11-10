package app.clase2.tarea.mediateca.prestamo;

import app.clase2.tarea.mediateca.medios.Libro;
import app.clase2.tarea.mediateca.medios.Video;




public interface Mediateca {

    public Libro gameThrones = new Libro("George Martin", "ASOIF - Game of Thrones");
    public Libro cienSoledad = new Libro("Gabriel García Márquez", "100 años de Soledad");
    
    public Video darkKnight = new Video("Christopher Nolan", "The Dark Knight");
    public Video ironMan = new Video("Jon Favreau", "Iron Man");
    
    public Video cancionAnimalSoda = new Video("Soda Stereo", "Canción Animal");
    public Video bohemioCalamaro = new Video("Andrés Calamaro", "Bohemio");
    
    
    public Integer nroElementosPrestamo = 3;
}
