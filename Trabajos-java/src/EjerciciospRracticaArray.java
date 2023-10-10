import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class EjerciciospRracticaArray {
    //Método para verificar si un número es primo- para el EJER 2
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) throws Exception {
        //DECLARACION E INICIALIZACION
        Random random = new Random();

        //Ejercicio 1
        int[] arrayNum = new int[10];
        int num = 1;
        for(int i = 0; i <10 ; i ++){
            arrayNum[i] = num;
            num ++;
        }

        //Ejercicio 2
        int[] numerosPrimos = new int[10];
        int numeroActual = 2;  // Comenzamos desde el primer número primo

        for (int i = 0; i < 10;) {
            if (esPrimo(numeroActual)) {
                numerosPrimos[i] = numeroActual;
                //Se mueve a la siguiente posicion,si la condicion se cumple
                i++;
            }
            numeroActual++;
        }
        // Mostrar los 10 números primos
        for (int i = 0; i < 10; i++) {
            System.out.print(numerosPrimos[i] + " ");
        }
        System.out.println(" ");
        
        //Ejecicio 3
        int[][] numerosEnteros = new int[10][10];
        for(int i = 0; i<10; i++){
            for(int f = 0 ; f <10; f ++){
                numerosEnteros[i][f] = random.nextInt(50);
            }
        }
        System.out.println("El array de números enteros es: ");
        for(int i = 0; i<10; i++){
            for(int f = 0 ; f <10; f ++){
                System.out.print(numerosEnteros[i][f]+" ");
            }
            System.out.println(" ");
        }

        //Ejercio 4
        double[][][] arrayTridimensional = new double[2][3][3];
        double valor = 1.0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    arrayTridimensional[i][j][k] = valor;
                    valor += 1.0; // Incrementar el valor
                }
            }
        }
        // Imprimir el array lleno
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    System.out.println("arrayTridimensional[" + i + "][" + j + "][" + k + "] = " + arrayTridimensional[i][j][k]);
                }
            }
        }

        //LECTURA Y ESCRITURA
        //Ejercicio 1
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        System.out.println("Ingresa 10 valores enteros:");
        // Utilizar un bucle para leer los valores
        for (int i = 0; i < 10; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        //Ejercicio 2
        double[] arrayNumerosReales = new double[10];
        System.out.println("Ingresa 10 numeros reales:");
        // Utilizar un bucle para leer los valores
        for (int i = 0; i < 10; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            arrayNumerosReales[i] = scanner.nextDouble();
        }

        //Ejercicio 3
        char[] arrayCaracteres = new char[10];
        System.out.println("Ingresa 10 caracteres:");
        // Utilizar un bucle para leer los valores
        for (int i = 0; i < 10; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            arrayCaracteres [i] = scanner.next().charAt(0);
        }

        //Ejercicio 4
        boolean[] arrayBooleanos = new boolean[10];
        System.out.println("Ingresa 10 booleanos:");
        // Utilizar un bucle para leer los valores
        for (int i = 0; i < 10; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            arrayBooleanos[i] = scanner.nextBoolean();
        }

        //OPEARACIONES ARITMETICAS
        //Ejercicio 1
        int[] arraySuma = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int suma = 0;

        for (int i = 0; i < arraySuma.length; i++) {
            suma += arraySuma[i];
        }
        System.out.println("La suma de los elementos del array es: " + suma);

        //Ejercicio 2
        int[] arrayMultiplicar = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int multiplicacionArray = 0;

        for (int i = 0; i < arrayMultiplicar.length; i++) {
            multiplicacionArray *= arrayMultiplicar[i];
        }
        System.out.println("La multiplicacion de los elementos del array es: " + multiplicacionArray);
        
        //Ejercicio 3
        int[] arrayMayorMenor = {5, 3, 9, 1, 7, 2, 8, 4, 10, 6};
        // Ordenar el array de enteros de menor a mayor
        Arrays.sort(arrayMayorMenor);

        System.out.println("Array ordenado de menor a mayor:");
        for (int i = 0; i < arrayMayorMenor.length; i++) {
            System.out.print(arrayMayorMenor[i] + " ");
        }
        System.out.println(" ");

        //Ejercicio 4
        String[] arrayOrdenAbc = {"Manzana", "Banana", "Durazno", "Cereza", "Fresa", "Uva"};
        // Ordenar el array de cadenas alfabéticamente
        Arrays.sort(arrayOrdenAbc);
        System.out.println("Array ordenado alfabéticamente:");
        for (int i = 0; i < arrayOrdenAbc.length; i++) {
            System.out.println(arrayOrdenAbc[i]);
        }
        System.out.println(" ");


        scanner.close();
    }
}
