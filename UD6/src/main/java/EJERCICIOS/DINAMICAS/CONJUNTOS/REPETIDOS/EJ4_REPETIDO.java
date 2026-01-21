package EJERCICIOS.DINAMICAS.CONJUNTOS.REPETIDOS;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class EJ4_REPETIDO {
    public static void main(String[] args) {
        Random rand = new Random();
        HashSet<Integer> set = new HashSet<>();
        int max = -1;
        int min = 100;
        while (set.size() < 10) {
            set.add(rand.nextInt(50));
        }
        for ( int numero : set) {
            if (numero > max) {
                max = numero;
            }
            if (numero < min) {
                min = numero;
            }
        }
        System.out.println(set);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
