package EJERCICIOS.DINAMICAS.CONJUNTOS.REPETIDOS;

import java.util.*;

public class EJ2_REPETIDO {
    public static void main(String[] args) {
        HashSet<Integer> hs1 = new HashSet<>();

        Random rand = new Random();

        while (hs1.size() < 10) {
            hs1.add(rand.nextInt(100));
        }

        TreeSet<Integer> ts1 = new TreeSet<>(hs1);
        ArrayList<Integer> arrayList = new ArrayList<>(ts1);
        Collections.sort(arrayList,Collections.reverseOrder());


        System.out.println("El conjunto original: " + hs1);
        System.out.println("El conjunto ordenado: " + ts1);
        System.out.println("El conjunto invertido: " + arrayList);

    }

}
