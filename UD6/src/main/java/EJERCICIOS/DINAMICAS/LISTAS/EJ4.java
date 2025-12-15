package EJERCICIOS.DINAMICAS.LISTAS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EJ4 {
    public static void main(String[] args) {
        ArrayList dimension1 = new ArrayList(List.of("manzanas","peras", "melones", "melocotones"));
        ArrayList dimension2 = new ArrayList(dimension1);

        Collections.sort(dimension2);

        System.out.println("La lsita original: " + dimension1);
        System.out.println("Lista ordenada: " + dimension2);
    }
}
