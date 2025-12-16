package EJERCICIOS.DINAMICAS.CONJUNTOS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.TreeSet;

public class EJ3 {
    public static void main(String[] args) {
        Random rand = new Random();
        TreeSet <Integer> ts1 = new TreeSet<>();

        final int NUM_MAX_RANDOM = 20;
        final int TAMANYO_CONJUNTOS = 10;

        while (ts1.size() < TAMANYO_CONJUNTOS  ) {
            ts1.add(rand.nextInt(NUM_MAX_RANDOM));

        }
        System.out.println(ts1.size());
        ArrayList<Integer> lista_invertida = new ArrayList <>(ts1);
        Collections.reverse(lista_invertida);
        System.out.println("Conjunto ordenado(decreciente y no repetidos): " + lista_invertida);

    }
}
