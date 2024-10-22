package gestionlibreria;

public class Audiolibro extends Libro {
    private double duracionGrabacion;
    private String formatoAudio;

    public void setDuracionGrabacion(double duracionGrabacion) {
        this.duracionGrabacion = duracionGrabacion;
    }

    public void setFormatoAudio(String formatoAudio) {
        this.formatoAudio = formatoAudio;
    }
}
