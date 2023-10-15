import java.util.Arrays;

public class TP8 {
    public static void main(String[] args) throws Exception {
        int[][] numeros = new int[]{5, 2, 9, 1, 5, 6};

        int[] resultado = sumArray(numeros1, numeros2);
        System.out.println(Arrays.toString(resultado));
    }

    public static int[] sumArray(int[] array1, int[] array2){

        int[][] sumaArray = new int[][];
        int largoArray = Math.max(array1.length, array2.length);
        for (int i =0; i <largoArray.length; i++){
            int value1 = array1[i] ;
            int value2 = array2[i];
            sumaArray[i] = value1+ value2;
        }
        return sumaArray;

    }
}
