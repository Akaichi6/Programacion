package EJERCICIOS.DINAMICAS.CONJUNTOS;

import java.util.Collections;
import java.util.HashSet;
import java.util.Random;

public class EJ4 {
    public static void main(String[] args) {
        Random random = new Random();
        HashSet <Integer> hs1 = new HashSet<>();

        final int NUM_MAX_RANDOM = 50;
        final int TAMANYO_CONJUNTOS = 10;
         int max = 0;
         int min = 0;

        while (hs1.size() < TAMANYO_CONJUNTOS)
        {
            hs1.add(random.nextInt(NUM_MAX_RANDOM));
            max = Collections.max(hs1);
            min = Collections.min(hs1);
        }

        System.out.println("Conjunto Hashset: " + hs1);
        System.out.println("Maximo: " + max);
        System.out.println("Minimo: " + min);
    }
}
