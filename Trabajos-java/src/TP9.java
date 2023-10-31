import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class TP9 {
    public static void main(String[] args) throws Exception {
        //Array con números enteros
        ArrayList<Integer> numerosEnteros = new ArrayList<>();
        numerosEnteros.add(1);
        numerosEnteros.add(2);
        numerosEnteros.add(3);
        numerosEnteros.add(4);
        numerosEnteros.add(5);

        //Aray con texto
        ArrayList<String> cademaTexto = new ArrayList<>();
        cademaTexto.add("Hola");
        cademaTexto.add("Ornela");
        cademaTexto.add("Sara");
        cademaTexto.add("Camila");

        //Imprimir array de números
        for(int numero: numerosEnteros){
            System.out.print(numero);
        }
        System.out.println(" ");

        //Longitud de una lista de caracteres
        ArrayList<String> caracteresLista = new ArrayList<>();
        caracteresLista.add("a");
        caracteresLista.add("e");
        caracteresLista.add("i");
        caracteresLista.add("0");
        int longitud = caracteresLista.size();
        System.out.println("La longitud del array es: "+ longitud);

        //Eliminar un elemento específico
        cademaTexto.remove(2);

        //Verifica si un array esta vacio
        boolean estaVacio = numerosEnteros.isEmpty();
        System.out.println(estaVacio);

        //Encuentra el elemento más grande
        int masGrande = 0;
        for(int numero: numerosEnteros){
            if (numero > masGrande){
                masGrande = numero;
            }
        }
        System.out.println(masGrande);
        int masGrande2 = Collections.max(numerosEnteros);
        System.out.println(masGrande2);

        //Copia todos los elementos de un ArrayList en otro
        ArrayList<Integer> numerosEnterosCopia = new ArrayList<>(numerosEnteros);
        System.out.println(numerosEnterosCopia);

        //Invertir un array
        Collections.reverse(numerosEnterosCopia);
        System.out.println(numerosEnterosCopia);

        //Combina dos 2 araysList
        for (int numero: numerosEnterosCopia){
            numerosEnteros.add(numero);
        }
        System.out.println(numerosEnteros);

        //ArrayList de números enteros y elimina todos los elementos pares
        for (int i = 0; i < numerosEnteros.size(); i++) {
            int numero = numerosEnteros.get(i);
            if (numero % 2 ==0){
                numerosEnteros.remove(i);
            }
        }
        System.out.println(numerosEnteros);

        //Busca un elemento específico en un ArrayList y devuelve su índice
        int elementoBuscar = 3;
        int posicion = numerosEnteros.indexOf(elementoBuscar);
        System.out.println("El indice de "+elementoBuscar+" es "+posicion);

        //Comprueba si dos ArrayLists son iguales
        ArrayList<Integer> numerosEnterosIgual = new ArrayList<>(numerosEnteros);
        boolean igualdad = true;
        numerosEnteros.add(1);
        if (numerosEnteros.size() != numerosEnterosIgual.size()){
            //Si tienen distintos tamaños
            igualdad = false;
        }else{
            //compara elemento por elemento
            for (int i = 0; i < numerosEnteros.size(); i++) {
                if (numerosEnteros.get(i) == numerosEnterosIgual.get(i)){
                    igualdad = true;
                }else{
                    igualdad = false;
                    break;
                }
            }
        }
        System.out.println(igualdad);

        //Elemento más pequeño en un ArrayList de números.
        int numPequeno = Collections.min(numerosEnteros);
        System.out.println(numPequeno);

        //Crea un ArrayList de números enteros y suma todos los elementos.
        ArrayList<Integer> numerosList = new ArrayList<>();
        numerosList.add(4);
        numerosList.add(9);
        numerosList.add(8);
        numerosList.add(3);
        System.out.println(numerosList);
        int suma = 0;
        for (int num : numerosList){
            suma += num;
        }
        System.out.println("La suma del array es: "+suma);

        //ArrayList de cadenas y concatena todas las cadenas en una sola
        String cadenaConcatenada = "";
        for (String cadena : cademaTexto) {
            cadenaConcatenada += cadena;
            cadenaConcatenada +=" ";
        }
        System.out.println(cadenaConcatenada);

        //Elimina todos los elementos duplicados de un ArrayList de cadenas
        ArrayList<String> listaCadenas = new ArrayList<>();
        listaCadenas.add("manzana");
        listaCadenas.add("naranja");
        listaCadenas.add("pera");
        listaCadenas.add("manzana");
        listaCadenas.add("uva");
        listaCadenas.add("naranja");
        ArrayList<String> listaCadenasUnicas = new ArrayList<>();
        // Utilizar un HashSet para eliminar duplicados
        HashSet<String> conjunto = new HashSet<>(listaCadenas);
        // Agregar los elementos al nuevo ArrayList
        listaCadenasUnicas.addAll(conjunto);
        System.out.println(listaCadenasUnicas);

        //Crea un ArrayList de enteros y encuentra la suma de los elementos en índices pares
        int sumaIndicesPares = 0;
        for (int i = 0; i < numerosEnteros.size(); i += 2) {
            sumaIndicesPares += numerosEnteros.get(i);
        }
        System.out.println("La suma de elementos en índices pares es: " + sumaIndicesPares);

        //Comprueba si un ArrayList de enteros contiene un número específico
        int numeroBuscado = 3;
        if (numerosEnteros.contains(numeroBuscado)) {
            System.out.println("El ArrayList contiene el número " + numeroBuscado);
        } else {
            System.out.println("El ArrayList no contiene el número " + numeroBuscado);
        }

        //Encuentra el elemento en un ArrayList de cadenas que tiene la longitud más larga
        String elementoMasLargo = "";
        int longitudMasLarga = 0;
        for (String cadena : listaCadenas) {
            int longitudCadena = cadena.length();
            if (longitudCadena > longitudMasLarga) {
                longitudMasLarga = longitudCadena;
                elementoMasLargo = cadena;
            }
        }
        System.out.println("El elemento con longitud más larga es: " + elementoMasLargo);

        //Encuentra el promedio de todos los elementos en un ArrayList de números enteros
        int sumaList = 0;
        for (int numero : numerosEnteros) {
            suma += numero;
        }
        double promedio = (double) sumaList / numerosEnteros.size();
        System.out.println("El promedio de los números es: " + promedio);

        //Crea un ArrayList de enteros y ordénalo de forma ascendente
        ArrayList<Integer> listaEnteros = new ArrayList<>();
        listaEnteros.add(50);
        listaEnteros.add(20);
        listaEnteros.add(40);
        listaEnteros.add(10);
        listaEnteros.add(30);
        // Ordenar el ArrayList de forma ascendente
        Collections.sort(listaEnteros);
        System.out.println("ArrayList ordenado de forma ascendente: " + listaEnteros);

        //Crea un ArrayList de números enteros y elimina todos los elementos mayores que un valor específico.
        int valorEspecifico = 35;
        for (int i = 0; i < listaEnteros.size(); i++) {
            if (listaEnteros.get(i) > valorEspecifico) {
                listaEnteros.remove(i);
                i--; // Ajustar el índice después de la eliminación
            }
        }
        System.out.println("ArrayList después de eliminar elementos mayores que " + valorEspecifico + ": " + listaEnteros);

        //Encuentra la cantidad de veces que un elemento específico aparece en un ArrayList de cadenas.
        String elementoEspecifico = "manzana";
        // Contar las apariciones del elemento
        int cantidadApariciones = Collections.frequency(listaCadenas, elementoEspecifico);
        System.out.println("El elemento '" + elementoEspecifico + "' aparece " + cantidadApariciones + " veces");

        //Crea un ArrayList de cadenas y ordena las cadenas alfabéticamente
        Collections.sort(listaCadenas);
        System.out.println("ArrayList ordenado alfabéticamente: " + listaCadenas);
    }
}

