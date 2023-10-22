package TP9_clases;

public class Pelicula {
    private String titulo;
    private String director;
    private int duracionMinutos;

    public Pelicula(String titulo, String director, int duracionMinutos) {
        this.titulo = titulo;
        this.director = director;
        this.duracionMinutos = duracionMinutos;
    }

    public void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Director: " + director);
        System.out.println("Duración: " + duracionMinutos + " minutos");
    }
}
