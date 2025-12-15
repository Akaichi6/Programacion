package EJERCICIOS.DINAMICAS.CONJUNTOS;

import java.util.*;

public class EJ1 {
    public static void main(String[] args) {
        HashSet<Integer> hs1 = new HashSet<>();

        Random random = new Random();

        final int TAMANYO_MAX = 10;
        final int NUM_MAX_RANDOM = 100;




        for (int i = 0; i < TAMANYO_MAX; i++)
        {
            hs1.add(random.nextInt(NUM_MAX_RANDOM));

        }
        TreeSet<Integer> hs2 = new TreeSet<>(hs1);
        System.out.println("Conjunto original: " + hs1);
        System.out.println("Conjunto ordenada: " + hs2);

    }
}
