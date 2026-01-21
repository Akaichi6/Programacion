package EJERCICIOS.DINAMICAS.CONJUNTOS.REPETIDOS;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class EJ1_REPETIDO {
    public static void main(String[] args) {
        HashSet<Integer> hs1 = new HashSet<>();

        Random rand = new Random();

      while (hs1.size() < 10) {
          hs1.add(rand.nextInt(100));
      }

      TreeSet<Integer> ts1 = new TreeSet<>(hs1);
        System.out.println("El conjunto original: " + hs1);
        System.out.println("El conjunto ordenado: " + ts1);
    }
}
