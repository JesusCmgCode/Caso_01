package gestionlibreria;

public class GestorLibro {
    private Libro libro;

    public GestorLibro() {
        this.libro = new Libro();
    }

    public GestorLibro setTitulo(String titulo) {
        libro.setTitulo(titulo);
        return this;
    }

    public GestorLibro addAutor(String autor) {
        String autores = libro.getAutores();
        if (autores == null) {
            autores = autor;
        } else {
            autores += ", " + autor;
        }
        libro.setAutores(autores);
        return this;
    }

    public GestorLibro addReseña(String reseña) {
        String reseñas = libro.getReseñas();
        if (reseñas == null) {
            reseñas = reseña;
        } else {
            reseñas += "; " + reseña;
        }
        libro.setReseñas(reseñas);
        return this;
    }

    public Libro build() {
        return libro;
    }
}
