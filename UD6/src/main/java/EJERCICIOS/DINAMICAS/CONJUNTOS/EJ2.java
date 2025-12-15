package EJERCICIOS.DINAMICAS.CONJUNTOS;

import java.util.*;


public class EJ2 {
    public static void main(String[] args) {
        HashSet<Integer> hs1 = new HashSet<>();

        Random random = new Random();

        final int TAMANYO_MAX = 11;
        final int NUM_MAX_RANDOM = 100; //

        for (int i = 0; i < TAMANYO_MAX; i++) // el TAMANYO_MAX es el tamaño del conjunto
        {
            hs1.add(random.nextInt(NUM_MAX_RANDOM)); // aqui introducimos los valores al conjunto

        }
        TreeSet<Integer> hs2 = new TreeSet<>(hs1);
        ArrayList <Integer> arrayList = new ArrayList <>(hs2); // Hay que crear una lista para poder usar el .reverseorder
        Collections.sort(arrayList,Collections.reverseOrder());

        System.out.println("Conjunto original: " + hs1);
        System.out.println("Conjunto ordenada: " + hs2);
        System.out.println("Conjunto orden invertido: " + arrayList);
    }
}
