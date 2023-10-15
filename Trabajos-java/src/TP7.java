import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class TP7 {
    public static void main(String[] args) {
        Scanner src= new Scanner(System.in);
        //1  Ordenar un array de números de menor a mayor
        int[] numeros={6,7,5,3,2,9};
        Arrays.sort(numeros);
        System.out.println("array ordenado de menor a mayor: ");
        for(int numero:numeros){
            System.out.println(numero+ " ");
        }
        //2 Ordenar un array de números enteros de mayor a menor.
        Integer[] numero_tres={6,7,5,3,2,9};
        Arrays.sort(numero_tres, Collections.reverseOrder());
        System.out.println("array ordenado de menor a mayor: ");
        for(int numero2:numero_tres){
            System.out.println(numero2 + " ");
        }
        //3 Ordenar un array de números flotantes de menor a mayor.
        float[] numeroF={7.39f,6.35f,26.05f,9.45f};
        Arrays.sort(numeroF);
        System.out.println("array ordenado de menor a mayor: ");
        for(float ordenado:numeroF){
            System.out.println(ordenado+ " ");
        }
        //4 Ordenar un array de números flotantes de mayor a menor.
        Float[] numero_float={6.03f,7.23f,5f,3f,2.2f,9.1f};
        Arrays.sort(numero_float, Collections.reverseOrder());
        System.out.println("array ordenado de menor a mayor: ");
        for(float numF:numero_float){
            System.out.println(numF + " ");
        }

        //5 Ordenar un array de cadenas de texto
        String [] array_5={"diciembre", "enero", "agosto", "abril", "noviembre"};
        Arrays.sort(array_5);
        for (String string : array_5) {
            System.out.println(string);
        }

        // 6 Ordenar un array de cadenas de texto en orden inverso.
        String [] array_6={"diciembre", "enero", "agosto", "abril", "noviembre"};
        Arrays.sort(array_6, Collections.reverseOrder());
        for (String string : array_6) {
            System.out.println(string);
        }

        //9
        int[] array = {5, 2, 9, 1, 5, 6};
        ordenamientoBurbuja(array);
        for (int num : array) {
            System.out.print(num + " ");
        }

        // Ejer 10
        int []arrayOrdenar={8,9,10,32,73,1};
        Arrays.sort(arrayOrdenar);
        for (int i : arrayOrdenar) {
            System.out.println("[ "+i+" ]");
        }
        // Ejer 11
        int [] arraySelec=new int[10];
    
        for (int i = 0; i < arraySelec.length; i++) {
            System.out.println("Ingrese el numero en el casillero "+ i);
            arraySelec[i]=src.nextInt();
        }
        ordenarArraySeleccion(arraySelec);
        System.out.println("Array Ordenado por Seleccion");
        for (int i : arraySelec) {
            System.out.println("[ "+i+" ]");
        }
        // Ejer12
        int [] arrayInser=new int[10];
        for (int i = 0; i < arrayInser.length; i++) {
            System.out.println("Ingrese el numero en el casillero "+ i);
            arrayInser[i]=src.nextInt();
        }
        ordenarArrayInsercion(arrayInser);
        System.out.println("Array Ordenado por Insercion");
        for (int i : arrayInser) {
            System.out.println("[ "+i+" ]");
        }
        
        src.close();
    }
    // 9
    public static void ordenamientoBurbuja(int[] array) {
    int n = array.length;
    boolean intercambio;

        do {
            intercambio = false;
            for (int i = 1; i < n; i++) {
                if (array[i - 1] > array[i]) {
                    // Intercambiar arr[i-1] y arr[i]
                    int temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                    intercambio = true;
                }
            }
        }while (intercambio);
    }

    // 11
        public static void ordenarArraySeleccion(int []array){
            int aux=0;
            int min=0;
            for (int i = 0; i < array.length; i++) {
                min=i;
                for (int j = i+1; j < array.length; j++) {
                    if (array[min]>array[j]){
                        min=j;
                    }
                }
                aux=array[i];
                array[i]=array[min];
                array[min]=aux;
            }
    }

    // 12
    public static void ordenarArrayInsercion(int []array){
        int aux=0;
        int pos=0;
        for (int i = 0; i < array.length; i++) {
            pos=i;
            aux=array[i];
            while(pos>0 && (array[pos-1]>aux)){
                array[pos]=array[pos-1];
                pos--;
            }
            array[pos]=aux;
        }
    }
    
}
