package TP10_clases;

public class TP9 {
    public static void main(String[] args) {
        Perro primerPerro = new Perro("Tincho", "caniche", 1);
        primerPerro.ladrar();

        Circulo circulo1 = new Circulo(4.5);
        double area = circulo1.area();
        double circunferencia = circulo1.circunferencia();
        System.out.println("El area del circulo es "+area+" y su circunferencia es "+circunferencia);

        Estudiante estudiante1 = new Estudiante("Juan", 20, "123456");

        libro libro1 = new libro("El principito", "Antoine de Saint-Exupéry", 1943);
        libro1.mostrarInformacion();

        CuentaBancaria cuentaOrne = new CuentaBancaria(50000, 159);
        cuentaOrne.depositar(1500);
        cuentaOrne.retirar(500);

        Rectangulo rect = new Rectangulo(10,6);
        System.out.println(rect.calcularArea());
        System.out.println(rect.calcularPerimetro());

        Coche miCoche = new Coche("Toyota", "Corolla", 2022);
        miCoche.acelerar(50);
        miCoche.frenar(20);

        Pelicula miPelicula = new Pelicula("Titanic", "James Cameron", 195);
        miPelicula.mostrarInformacion();
    }

}
