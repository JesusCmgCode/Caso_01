package gestionlibreria;

public class LibroDigital extends Libro {
    private String formato;
    private double tamañoArchivo;
    private String enlaceDescarga;

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public void setTamañoArchivo(double tamañoArchivo) {
        this.tamañoArchivo = tamañoArchivo;
    }

    public void setEnlaceDescarga(String enlaceDescarga) {
        this.enlaceDescarga = enlaceDescarga;
    }
}
