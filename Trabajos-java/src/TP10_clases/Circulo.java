package TP10_clases;

public class Circulo {
    private double radio;

    public Circulo(double radio){
        this.radio = radio;
    }

    public double area(){
        return Math.PI * Math.pow(radio, 2);
    }
    public double circunferencia(){
        return radio*2;
    }
}
