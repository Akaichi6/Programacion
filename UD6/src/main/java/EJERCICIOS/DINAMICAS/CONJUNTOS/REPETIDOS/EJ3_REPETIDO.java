package EJERCICIOS.DINAMICAS.CONJUNTOS.REPETIDOS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.TreeSet;

public class EJ3_REPETIDO {
    public static void main(String[] args) {
        TreeSet<Integer> ts1 = new TreeSet<>();
        Random rand = new Random();
        while (ts1.size() < 10) {
            ts1.add(rand.nextInt(20));
        }
        ArrayList<Integer> arrayList = new ArrayList <>(ts1);
        Collections.sort(arrayList,Collections.reverseOrder());
        System.out.println("Conjunto ordenado (decreciente y no repetidos: " + arrayList);
    }
}
