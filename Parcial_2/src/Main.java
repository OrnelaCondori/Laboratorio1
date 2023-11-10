import java.util.ArrayList;
import java.util.Scanner;

//Uso de objetos - arrayList - Metodos - arrays

//El código que hice utiliza objetos, pero en caso de que no fuesee necesario hubiera utliado un metodo en el main, para determinar si es o no mutante
public class Main {
    //Funcion para verificar que los datos ingresados por el usuario sean correctos
    public static boolean validacionInformacionGenetica(String cadena){
        if (cadena.length() != 6 ){
            return false;
        }else{
            for (int i = 0; i < cadena.length(); i++) {
                char l = cadena.charAt(i);
                if (l != 'A' && l != 'T' && l != 'C' && l != 'G') {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Scanner scanner2= new Scanner(System.in);
        int continuarPrograma;

        do{
            System.out.println("\n -----------VERIFICACION DE ADN---------\n");
            System.out.println("A continuacion ingrese las 6 cadenas de datos (Ejemplo: ATGCGA)");

            ArrayList<String> informacion_genetica = new ArrayList<>();
            char[][] matrizADN = new char[6][6];

            //Pide al usuario el ingreso de 6 cadenas de texto, y verifica que cumpla con el largo y letras especificadas
            for (int i = 0; i < 6; i++) {
                boolean esValida;
                do {
                    System.out.print("Cadena "+ (i+1)+": ");
                    String dna = scanner2.nextLine();
                    dna = dna.toUpperCase();
                    //Uso de funcion boolena
                    esValida = validacionInformacionGenetica(dna);
                    if (esValida){
                        informacion_genetica.add(dna);
                    }else {
                        System.out.println("! La cadena ingresada no es válida, verifique las letras ingresadas sean A/T/C/G");
                    }
                }while (!esValida);
            }

            //Creo una matriz para guardar letra por letra
            for (int i = 0; i < 6; i++) {
                String cadenaADN = informacion_genetica.get(i);
                for (int j = 0; j < 6; j++) {
                    matrizADN[i][j] = cadenaADN.charAt(j);
                }
            }

            System.out.println("----------------------------------------");
            System.out.println("DNA = "+informacion_genetica);
            //Imprimo la matriz
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 6; j++) {
                    System.out.print(matrizADN[i][j]+ " ");
                }
                System.out.println();
            }

            System.out.println("----------------------------------------");
            //utilizando el metodo del objeto verifica si el adn(matriz) ingresado cumple con las condiciones
            analisisADN primerAnalisis = new analisisADN(matrizADN);
            if (primerAnalisis.is_mutant()){
                System.out.println("Es un mutante");
            } else {
                System.out.println("NO es un mutante");
            }
            System.out.println("----------------------------------------");

            while (true){
                //Menú para el usuario, si desea ingresar otro ADN o terminar el programa
                try{
                    System.out.println("Indique qué desea hacer:    \n1. Ingresar otro ADN   \n2. Salir del programa");
                    System.out.print("Eleccion (1/2): ");
                    continuarPrograma = scanner.nextInt();

                    if (continuarPrograma != 1 && continuarPrograma != 2) {
                        System.out.println("! El número ingresado no corresponde a ninguna opción, ingréselo nuevamente.");
                    } else {
                        break;
                    }

                } catch (java.util.InputMismatchException e) {
                    System.out.println("! Entrada no válida, ingrese un número entero válido.");
                }
            }

        } while (continuarPrograma !=2);

    }
}

//Ejemplo para cuando la función es false:
// acggca
// cagcac
// attagg
// ggtttg
// aatcgc
// agtgta

//Ejemplo para que la función sea True:
// ctgcga
// cactgc
// ttatgt
// agaagg
// ccccat
// tcactg
