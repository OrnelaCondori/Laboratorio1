package TP9_clases;

public class Coche {
    private String marca;
    private String modelo;
    private int anioFabricacion;
    private int velocidad; // para la velocidad actual del coche

    public Coche(String marca, String modelo, int anioFabricacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
        this.velocidad = 0;
    }

    public void acelerar(int incremento) {
        velocidad += incremento;
        System.out.println("El coche aceleró y su velocidad actual es " + velocidad + " km/h.");
    }
    public void frenar(int decremento) {
        if (velocidad - decremento >= 0) {
            velocidad -= decremento;
        } else {
            velocidad = 0;
        }
        System.out.println("El coche frenó y su velocidad actual es " + velocidad + " km/h.");
    }
}
