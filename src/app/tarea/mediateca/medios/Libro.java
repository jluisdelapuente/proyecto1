package app.clase2.tarea.mediateca.medios;

public class Libro extends Medio {

    private Integer numeroPaginas;
    private Long numeroISBN;

    public Libro(String autor, String titulo) {
        this.setAutor(autor);
        this.setTitulo(titulo);
    }

    public Integer getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(Integer numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public Long getNumeroISBN() {
        return numeroISBN;
    }

    public void setNumeroISBN(Long numeroISBN) {
        this.numeroISBN = numeroISBN;
    }

    @Override
    public void printDetalle() {
        System.out.println(this.getAutor() + " - " + this.getTitulo() +" "+this.numeroPaginas);
    }
    
    
}
