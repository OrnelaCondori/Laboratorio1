import java.util.Scanner;
public class Tp5Laboratorio {
    public static void main(String[] args) throws Exception {
        Scanner number = new Scanner(System.in);
        Scanner word = new Scanner(System.in);
        //1
        System.out.print("Ingrese un número(para saber si es par o no): ");
        int num1 = number.nextInt();
        if(num1%2==0){
            System.out.println("Es par");
        } else{
            System.out.println("Es impar");
        }
        System.out.println("------------------");

        //2
        System.out.print("Ingrese un número(para saber si esnultiplo de 10): ");
        int num2 = number.nextInt();
        if(num2%10==0){
            System.out.println("Es multiplo de 10");
        } else{
            System.out.println("No es multiplo");
        }
        System.out.println("------------------");

        //3 
        System.out.print("Ingrese una letras: ");
        char letra = word.next().charAt(0);
        if (Character.isUpperCase(letra)){
            System.out.println("Es una letra mayuscula");
        } else{
            System.out.println("No es una letra mayuscula");
        }
        System.out.println("------------------");

        //4  
        System.out.print("Ingrese el primer número a comparar: ");
        int num3 = number.nextInt();
        System.out.print("Ingrese el segundo número a comparar: ");
        int num4 = number.nextInt();

        if(num3 == num4){
            System.out.println("Son iguales");
        } else{
            System.out.println("No son iguales");
        }
        System.out.println("------------------");

        //5 calcular el mayor de dos números enteros que se introducen por teclado.
        System.out.print("Ingrese el primer número a comparar: ");
        int num5 = number.nextInt();
        System.out.print("Ingrese el segundo número a comparar: ");
        int num6 = number.nextInt();

        if(num5 == num6){
            System.out.println("Son iguales");
        } else if (num5 > num6){
            System.out.println(num5+" es más grande");
        } else {
            System.out.println(num6+" es más grande");
        }
        System.out.println("------------------");

        //6
        System.out.print("Ingrese el primer número: ");
        int num7 = number.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num8 = number.nextInt();
        if((num7%10)==(num8%10)){
            System.out.println("El ultimo digito de ambos números es igual");
        } else {
            System.out.print("Los ultimos digitoa de estos números No son iguales");
        }
        System.out.println("------------------");

        //7
        System.out.print("Ingrese el primer número: ");
        int num9 = number.nextInt();
        if ((num9%3==0)&(num9%5==0)){
            System.out.print("El número es multiplo de 5 y 3");
        }
        System.out.println("------------------");

        //8
        System.out.print("Ingrese el primer número: ");
        int num10 = number.nextInt();
        if (num10%3==0){
            System.out.print("El número es multiplo de 3");
        } else if (num10%2==0){
            System.out.print("El número es multiplo de 2");
        } else{
            System.out.print("El número no es multiplo de 3 ni de 2");
        }
        System.out.println("------------------");

        //9
        System.out.print("Ingrese un caracter: ");
        char caracter1 = word.next().charAt(0);
        System.out.print("Ingrese otro caracter: ");
        char caracter2 = word.next().charAt(0);
        if (caracter1 == caracter2){
            System.out.print("Los caracteres ingresados SON IGUALES");
        }else{
            System.out.print("NO SON IGUALES");
        }
        System.out.println("------------------");

        //10
        System.out.print("Ingrese un caracter: ");
        char caracter3 = word.next().charAt(0);
        System.out.print("Ingrese otro caracter: ");
        char caracter4 = word.next().charAt(0);

        if (Character.isLowerCase(caracter3) & Character.isLowerCase(caracter4)){
            System.out.print("Ambos son letras minusculas");
        } else if(Character.isLowerCase(caracter3)){
            System.out.print("Solo "+ caracter3+ " es minuscula");
        }else if(Character.isLowerCase(caracter4)){
            System.out.print("Solo "+ caracter4+ " es minuscula");
        }else{
            System.out.print("Ninguno es minuscula");
        }
        System.out.println("------------------");

        //11
        char caracter = word.next().charAt(0);
        if (Character.isDigit(caracter)) {
            System.out.println("El carácter ingresado es un dígito numérico.");
        } else {
            System.out.println("El carácter ingresado no es un dígito numérico.");
        }
        System.out.println("------------------");

        //12 
        System.out.print("Ingresa el primer número: ");
        //tienen que ser double, porque el resultado de dividirlo puede ser decimal
        double numero1 = number.nextDouble();
        System.out.print("Ingresa el segundo número: ");
        double numero2 = number.nextDouble();
        
        if (numero2 != 0) {
            double resultado = numero1 / numero2;
            System.out.println("El resultado de la división es: " + resultado);
        } else {
            System.out.println("Error: El divisor no puede ser cero.");
        }
        System.out.println("------------------");

        //13
        System.out.print("Ingresa un año(para comprobar si es o no bisiesto): ");
        int anio = number.nextInt();
        if (((anio%4==0)&(anio%100!=0)) || (anio%400==0)){
            System.out.println("Es un año bisiesto");
        } else{
            System.out.println("NO es un año bisiesto");
        }
        System.out.println("------------------");

        //14
        System.out.print("Ingrese un número de 3 cifras(para comprobar si es capicua): ");
        int num11 = number.nextInt();
        int cifra1 = num11/100;
        int cifra3 = num11%10;
        if(cifra1==cifra3){
            System.out.println("Es capicua");
        } else{
            System.out.println("No es capicua");
        }
        System.out.println("------------------");

        //15
        System.out.print("Ingrese la hora: ");
        int H = number.nextInt();
        System.out.print("Ingrese los minutos: ");
        int M = number.nextInt();
        System.out.print("Ingrese los segundos: ");
        int S = number.nextInt();

        if (0 <= H && H < 24 && 0 <= M && M < 60 && 0 <= S && S < 60) {
            System.out.println("La hora ingresada es válida.");
        } else {
            System.out.println("La hora ingresada no es válida.");
        }
        System.out.println("------------------");

        //17
        System.out.print("Ingrese su calificacion: ");
        int calif = number.nextInt();
        if (calif<0 || calif>10){
            System.out.println("La nota ingresada no es valida!");
        } else{
            if (0 <= calif  &  calif<5 ){
                System.out.println("Insuficiente");
            } else if (5 <= calif  &  calif <6 ){
                System.out.println("Suficiente");
            } else if (6 <= calif  &  calif <7 ){
                System.out.println("Bien");
            } else if (7 <= calif && calif <9 ){
                System.out.println("Notable");
            } else {
                System.out.println("Sobresaliente");
            }
        }
        System.out.println("------------------");

        //18
        int i = 1;
        while (i <=100){
            System.out.print(i+ " ");
            i++;
        }
        System.out.println("------------------");

        //19
        i = 1;
        do {
            System.out.print(i+ " ");
            i++;
        } while (i <= 100);
        System.out.println("------------------");

        //20
        for (i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println("------------------");

        //21
        i = 100;
        while (i >=1){
            System.out.print(i+ " ");
            i--;
        }
        System.out.println("------------------");

        //22
        i = 100;
        do {
            System.out.print(i+ " ");
            i--;
        } while (i >= 1);
        System.out.println("------------------");

        //23
        for (i = 100; i >=1; i--) {
            System.out.print(i + " ");
        }
        System.out.println("------------------");

        //24
        System.out.print("Ingrese un número: ");
        int n = number.nextInt();

        System.out.print("Imprime utilizando for: ");
        for (i = 1; i <= n; i++) {
            System.out.print(i+ " ");
        }
        System.out.println(" ");
        System.out.print("Imprime utilizando while: ");
        i = 1;
        while (i <= n) {
            System.out.print(i+ " ");
            i++;
        }
        System.out.println(" ");
        System.out.print("Imprime utilizando do while: ");
        i = 1;
        do {
            System.out.print(i+ " ");
            i++;
        } while (i <= n);
        System.out.println(" ");

        //25
        System.out.print("Ingrese un número: ");
        n = number.nextInt();
        
        for (i = n; i >= 1; i--) {
            System.out.print(i+" ");
        }
        System.out.println(" ");
        System.out.print("Imprime utilizando while: ");
        i = n;
        while (i >= 1) {
            System.out.print(i+" ");
            i--;
        }
        System.out.println(" ");
        System.out.print("Imprime utilizando do while: ");
        i = n;
        do {
            System.out.print(i+" ");
            i--;
        } while (i >= 1);
        System.out.println(" ");

        //26
        int numero4, numero5;
        do {
            System.out.print("Ingrese el primer número: ");
            numero4 = number.nextInt();
            
            System.out.print("Ingrese el segundo número: ");
            numero5 = number.nextInt();
            
            if (numero4 == numero5) {
                System.out.println("Los números son iguales. Por favor, ingrese números distintos.");
            }
        } while (numero4 == numero5);
        
        int menor = Math.min(numero4, numero5);
        int mayor = Math.max(numero4, numero5);
        for (i = menor; i <= mayor; i++) {
            System.out.print(i+ " ");
        }
        System.out.println(" ");

        //27
        System.out.print("Ingrese A:");
        int A = number.nextInt();
        System.out.print("Ingrese B: ");
        int B =number.nextInt();

        while (B>A) {
            System.out.print("Los números ingresados son incorrectos (A debe ser menor que B)");
            System.out.print("Ingrese A:");
            A = number.nextInt();
            System.out.print("Ingrese B: ");
            B =number.nextInt();
        }
        for (i = A; i<=B; i++ ){
            if (i%2 == 0){
                System.out.print(i+" ");
            }
        }
        System.out.println(" ");

        //28
        System.out.print("Ingrese N:");
        int N = number.nextInt();
        System.out.print("Ingrese M: ");
        M =number.nextInt();

        while (M>N) {
            System.out.print("Los números ingresados son incorrectos (A debe ser menor que B)");
            System.out.print("Ingrese N:");
            N = number.nextInt();
            System.out.print("Ingrese M: ");
            M =number.nextInt();
        }
        System.out.println(" ");
        System.out.print("Los numeros multiplos son: ");
        for (i = 1; i<=M; i++ ){
            if (i%N == 0){
                System.out.print(i+" ");
            }
        }

        //29
        int milla = 1;
        while (milla!=0){
            System.out.print("Ingrese las millas (para pasarlo a kilometros): ");
            milla = number.nextInt();
            Double Km = milla * 1.6093;
            System.out.println("Equivale a "+Km+"Km");
        }

        number.close();
        word.close();
    }
}
