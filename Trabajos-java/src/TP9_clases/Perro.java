package TP9_clases;

public class Perro {
    // Atributos
    private String nombre;
    private String raza;
    private int edad;

    // Constructor
    public Perro(String nombre, String raza, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }

    // Métodos
    public void ladrar() {
        System.out.println("Guau Guau");
    }
}
