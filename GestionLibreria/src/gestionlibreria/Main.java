package gestionlibreria;

public class Main {
    public static void main(String[] args) {
        GestorLibro gestor = new GestorLibro();
        Libro libro = gestor
            .setTitulo("El Quijote")
            .addAutor("Miguel de Cervantes")
            .addReseña("Una obra maestra de la literatura")
            .build();

        System.out.println("Título: " + libro.getTitulo());
        System.out.println("Autores: " + libro.getAutores());
        System.out.println("Reseñas: " + libro.getReseñas());
    }
}
