package gestionlibreria;

public class LibroFisico extends Libro {
    private int numPaginas;
    private double altura;
    private double ancho;
    private double grosor;

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public void setDimensiones(double altura, double ancho, double grosor) {
        this.altura = altura;
        this.ancho = ancho;
        this.grosor = grosor;
    }
}
