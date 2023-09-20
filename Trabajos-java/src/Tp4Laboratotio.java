import java.util.Scanner;
public class Tp4Laboratotio {
    public static void main(String[] args) throws Exception {
        //1
        Scanner number = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int num1 = number.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = number.nextInt();
        System.out.println("Los números ingresados son " + num1+" y "+num2);
        System.out.println("------------------");

        //2
        Scanner name = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String name1 = name.nextLine();
        System.out.println("Su nombre es "+name1);
        System.out.println("------------------");

        //3
        System.out.print("Ingrese el número del cual desea obtener el doble y triple: ");
        int num3 = number.nextInt();
        int doble = num3*2;
        int triple = num3*3;
        System.out.println("Doble = "+ doble);
        System.out.println("Triple = "+triple);
        System.out.println("------------------");

        //4
        System.out.print("Ingrese los grados en celcius: ");
        double gradosCen = number.nextInt();
        double gradosFah = 32+(9*gradosCen/5);
        System.out.println("En grados Fahrenheit: "+gradosFah);
        System.out.println("------------------");

        //5
        System.out.print("Ingrese en valor del radio: ");
        double radio = number.nextInt();
        double longi = (2*radio)* 3.1415 ;
        double area = (Math. pow(radio, 2))*3.1415;
        System.out.println("La longitud del circulo es: "+longi);
        System.out.println("El área del circulo es: "+area);
        System.out.println("------------------");

        //6 
        System.out.print("Ingrese la velocidad en km/h: ");
        double kmh = number.nextDouble();
        double ms = kmh/3.6;
        System.out.println("En m/s es equivalente a: "+ms);
        System.out.println("------------------");

        //7
        System.out.print("Ingrese el valor del cateto 1: ");
        double cat1 = number.nextDouble();
        System.out.print("Ingrese el valor del cateto 2: ");
        double cat2 = number.nextDouble();
        double hipot = Math.sqrt(Math.pow(cat1, 2)+Math.pow(cat2,2));
        System.out.println("El valor de la hipotenusa es "+hipot);
        System.out.println("------------------");

        //8
        System.out.print(("EL valor del radio de la esfera es: "));
        double radioEsfera = number.nextDouble();
        double volEsfera = (4.0/3)* Math.PI * Math.pow(radioEsfera, 3);
        System.out.println("El volumen es: "+volEsfera);
        System.out.println("------------------");

        //9
        System.out.println("Ingrese las medidas de los lados del triangulo");
        System.out.print("Lado 1 :");
        double a = number.nextInt();
        System.out.print("Lado 2 :");
        double b = number.nextInt();
        System.out.print("Lado 3 :");
        double c = number.nextInt();
        double p = (a+b+c)/2;
        double area2 = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println("El area es: "+area2);
        System.out.println("------------------"); 

        //10
        System.out.print("Ingrese un número de 3 digitos: ");
        int num = number.nextInt();
        int dig1 = num/100;
        int dig2 = (num/10) %10;
        int dig3 = num%10;
        System.out.println("Los digitos son "+dig1+" - "+dig2+" - "+dig3);
        System.out.println("------------------");

        //11
        System.out.print("Ingrese un número de 5 digitos: ");
        int num4 = number.nextInt();
        System.out.println(num4/10000);
        System.out.println(num4/1000);
        System.out.println(num4/100);
        System.out.println(num4/10);
        System.out.println(num4/1);
        System.out.println("------------------");

        //12
        System.out.print("Ingrese un número de 5 digitos: ");
        int num5 = number.nextInt();
        System.out.println(num5%10);
        System.out.println(num5%100);
        System.out.println(num5%1000);
        System.out.println(num5%10000);
        System.out.println(num5);
        System.out.println("------------------");

        //13
        System.out.println("A continuacion complete con su fecha de nacimiento, para conocer su número de la suerte");
        System.out.print("Día: ");
        int dia = number.nextInt();
        System.out.print("Mes: ");
        int mes = number.nextInt();
        System.out.print("Año: ");
        int anio = number.nextInt();
        int suma = dia+mes+anio;
        int numeroSuerte = (suma/1000)+((suma/100)%10)+((suma/10)%10)+(suma%10);
        System.out.println("Su numero de la suerte es: "+numeroSuerte);
        System.out.println("------------------");

        //14
        System.out.print("Ingrese la cantidad de productos vendidos");
        int cantProducto = number.nextInt();
        System.out.print("EL precio por unidad al que lo compro: ");
        double preProducto = number.nextDouble();
        double precioVenta = (cantProducto*preProducto)*1.21;
        System.out.println("El precio de venta es: "+precioVenta);
        System.out.println("------------------");
        
        //15
        System.out.println("Ingrese el número N: ");
        int n = number.nextInt();
        System.out.println("Ingrese el número m: ");
        int m = number.nextInt();
        int divisor = (int) Math.pow(10, m);
        int nuevoN = n / divisor;
        System.out.println("El nuevo valor de N es: " + nuevoN);
        System.out.println("------------------");

        //16
        System.out.println("Ingrese la temperatura en grados centígrados: ");
        double celsius = number.nextDouble();
        double reamur = celsius * 0.8;
        double kelvin = celsius + 273.15;
        System.out.println("La temperatura en grados Reamur es: " + reamur);
        System.out.println("La temperatura en grados Kelvin es: " + kelvin);

        number.close();
        name.close();
    } 
}