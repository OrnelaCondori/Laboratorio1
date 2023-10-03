import java.util.Scanner;

public class Tp6Laboratorio {
    public static void main(String[] args) throws Exception {
        Scanner Number = new Scanner(System.in);

        //EJERCICIO 1
        int[] arrayNum = new int[10];
        for (int i = 0 ; i <=9; i ++){
            System.out.print("Ingrese un numero: ");
            arrayNum[i] = Number.nextInt();
        }
        int positivos = 0;
        int cantPositivos = 0;
        int negativos= 0;
        int cantNegativos = 0;
        for(int i = 0 ; i <10; i ++){
            if( arrayNum[i] >0){
                positivos += arrayNum[i];
                cantPositivos +=1;
            } else{
                negativos += arrayNum[i];
                cantNegativos +=1;
                }
        }
        System.out.println("--------------------------------");

        //EJERCICIO 2
        System.out.println("La media de números positvos es: "+ positivos/cantPositivos);
        System.out.println("La media de números negativos es: "+ negativos/cantNegativos);

        int[] arrayParImpar = new int[10];
        for (int i = 0 ; i <=9; i ++){
            System.out.print("Ingrese un numero: ");
            arrayParImpar[i] = Number.nextInt();
        }
        int posPar = 0;
        int posImpar= 0;
        for(int i = 0 ; i <10 ; i ++){
            if(i%2 == 0){
                posPar+= arrayParImpar[i];
            } else{
                posImpar+= arrayParImpar[i];
                }
        }
        double mediaPar = posPar/5.0;
        double mediaImpar = posImpar/5.0;

        System.out.println("La media de números en las posiciones pares es: "+ mediaPar);
        System.out.println("La media de números en las posiciones impares es: "+ mediaImpar);
        System.out.println("--------------------------------");

        //EJERCICIO 3
        System.out.print("Cantidad de alumnos: ");
        int cantAlumnos = Number.nextInt();
        double mediaNotas = 0;

        double[] nota = new double[cantAlumnos];
        for (int i =0; i<=(cantAlumnos-1); i++){
            System.out.print("Ingrese la nota del alumno "+ (i+1)+": ");
            nota[i] = Number.nextDouble();
            mediaNotas += nota[i];
        }

        mediaNotas = mediaNotas/cantAlumnos;
        System.out.println("La media de las notas es: "+mediaNotas);
        for (int i =0; i<=(cantAlumnos-1); i++){
            if (nota[i]>mediaNotas){
                System.out.println("El alumno "+ (i+1)+" tiene una nota mayor al promedio: "+ nota[i]);
            }
        }
        System.out.println("-------------------------------- ");

        //EJERCICIO 4
        int[] Pares = new int[20];
        int numeroPar = 2;
        
        for (int i = 0; i < 20; i++) {
            Pares[i] = numeroPar;
            numeroPar += 2; 
        }
        
        System.out.println("Contenido del array 'Pares':");
        for (int i = 0; i < 20; i++) {
            System.out.print(Pares[i]);
            if (i < 19) {
                System.out.print(", "); // Separador entre elementos
            }
        }
        System.out.println(" ");
        System.out.println("--------------------------------");

        //EJERCICIO 5   
        int[] numPositivosNegativos = new int[10];
        for (int i = 0 ; i <=9; i ++){
            System.out.print("Ingrese un número: ");
            numPositivosNegativos[i] = Number.nextInt();
        }
        cantPositivos = 0;
        cantNegativos = 0;
        int cantCeros = 0;
        for(int i = 0 ; i <10; i ++){
            if(numPositivosNegativos[i] == 0){
                cantCeros +=1;
            }else if (numPositivosNegativos[i]>0){
                cantPositivos +=1;
            }else{
                cantNegativos +=1;
            }
        }
        System.out.println("La cantidad de ceros ingresados es "+cantCeros+"\nLa cantidad de números positivos es "+cantPositivos+"\nLa cantidad de números negativos es "+cantNegativos);
        System.out.println("--------------------------------");

        //EJERCICIO 6
        int[] numeros = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = Number.nextInt();
        }
        double sumaPositivos = 0;
        cantPositivos = 0;
        double sumaNegativos = 0;
        cantNegativos = 0;

        for (int numero : numeros) {
            if (numero > 0) {
                sumaPositivos += numero;
                cantPositivos++;
            } else if (numero < 0) {
                sumaNegativos += numero;
                cantNegativos++;
            }
        }

        if (cantPositivos > 0) {
            double mediaPositivos = sumaPositivos / cantPositivos;
            System.out.println("Media de los valores positivos: " + mediaPositivos);
        } else {
            System.out.println("No se ingresaron valores positivos.");
        }
        if (cantNegativos > 0) {
            double mediaNegativos = sumaNegativos / cantNegativos;
            System.out.println("Media de los valores negativos: " + mediaNegativos);
        } else {
            System.out.println("No se ingresaron valores negativos.");
        }
        System.out.println("--------------------------------");

        //EJERCICIO 7
        System.out.print("Ingrese la cantidad de personas: ");
        int N = Number.nextInt();

        double[] alturas = new double[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Ingrese la altura de la persona " + (i + 1) + " (en centímetros): ");
            alturas[i] = Number.nextDouble();
        }

        // Calcular la altura media
        double sumaAlturas = 0;
        for (double altura : alturas) {
            sumaAlturas += altura;
        }
        double alturaMedia = sumaAlturas / N;
        int personasAlturaSuperior = 0;
        int personasAlturaInferior = 0;

        for (double altura : alturas) {
            if (altura > alturaMedia) {
                personasAlturaSuperior++;
            } else if (altura < alturaMedia) {
                personasAlturaInferior++;
            }
        }
        System.out.println("Altura media: " + alturaMedia + " centímetros");
        System.out.println("Personas con altura superior a la media: " + personasAlturaSuperior);
        System.out.println("Personas con altura inferior a la media: " + personasAlturaInferior);
        System.out.println("--------------------------------");

        //EJERCICIO 8
        String[] nombres = new String[20];
        double[] sueldos = new double[20];

        String empleadoMasGana = "";
        double sueldoMasAlto = 0;

        for (int i = 0; i < 20; i++) {
            System.out.print("Ingrese el nombre del empleado " + (i + 1) + ": ");
            nombres[i] = Number.nextLine();
            System.out.print("Ingrese el sueldo de " + nombres[i] + ": ");
            sueldos[i] = Number.nextDouble();
            Number.nextLine(); // Limpiar 
            if (sueldos[i] > sueldoMasAlto) {
                sueldoMasAlto = sueldos[i];
                empleadoMasGana = nombres[i];
            }
        }
        System.out.println("El empleado que más gana es " + empleadoMasGana + " con un sueldo de $" + sueldoMasAlto);
        System.out.println("--------------------------------");
    
        //EJERCICIO 10
        // Leer el número de filas y columnas 
        System.out.print("Ingrese el número de filas de las matrices: ");
        int filas =Number.nextInt();
        System.out.print("Ingrese el número de columnas de las matrices: ");
        int columnas = Number.nextInt();

        // Crear las matrices A y B
        int[][] matrizA = new int[filas][columnas];
        int[][] matrizB = new int[filas][columnas];

        // Llenar las matrices A y B con valores enteros
        System.out.println("Ingrese los valores de la matriz A:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizA[i][j] = Number.nextInt();
            }
        }
        System.out.println("Ingrese los valores de la matriz B:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizB[i][j] = Number.nextInt();
            }
        }

        // Sumar las matrices A y B y obtener la matriz C
        int[][] matrizC = sumarMatrices(matrizA, matrizB);

        // Mostrar las matrices A, B y C
        System.out.println("Matriz A:");
        mostrarMatriz(matrizA);
        System.out.println("Matriz B:");
        mostrarMatriz(matrizB);
        System.out.println("Matriz C (Resultado de la suma de A y B):");
        mostrarMatriz(matrizC);
        System.out.println("--------------------------------");

        //EJERCICIO 11
        System.out.print("Ingrese el número de filas de la matriz: ");
        filas = Number.nextInt();
        System.out.print("Ingrese el número de columnas de la matriz: ");
        columnas = Number.nextInt();

        //matriz original y la matriz transpuesta
        int[][] matrizOriginal = new int[filas][columnas];
        int[][] matrizTranspuesta = new int[columnas][filas];

        // Leer los elementos de la matriz original
        System.out.println("Ingrese los elementos de la matriz original:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizOriginal[i][j] = Number.nextInt();
            }
        }
        // matriz transpuesta
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizTranspuesta[j][i] = matrizOriginal[i][j];
            }
        }
        System.out.println("Matriz Transpuesta:");
        for (int i = 0; i < columnas; i++) {
            for (int j = 0; j < filas; j++) {
                System.out.print(matrizTranspuesta[i][j] + " ");
            }
            System.out.println();
        }

        Number.close();
    }


    //*ejercicio 10-metodos
    // Método para sumar dos matrices y devolver el resultado
    public static int[][] sumarMatrices(int[][] matrizA, int[][] matrizB) {
        int filas = matrizA.length;
        int columnas = matrizA[0].length;
        int[][] resultado = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }
        return resultado;
    }

    // Método para mostrar una matriz por pantalla
    public static void mostrarMatriz(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    
    }
}
