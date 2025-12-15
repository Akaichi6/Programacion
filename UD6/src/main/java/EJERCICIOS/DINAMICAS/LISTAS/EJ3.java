package EJERCICIOS.DINAMICAS.LISTAS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EJ3 {
    public static void main(String[] args) {
        ArrayList<Integer> dimension1 = new ArrayList <>(List.of(15,10,25,33,10,15,18,19,14,17));
        ArrayList<Integer> dimension2 = new ArrayList <>(dimension1);
        ArrayList<Integer> dimension3 = new ArrayList <>(dimension1);
        Collections.sort(dimension2);
        Collections.sort(dimension3, Collections.reverseOrder());

        System.out.println("Lista original: " + dimension1);
        System.out.println("Lista ordenada de menor a mayor: " + dimension2);
        System.out.println("Lista ordenada de mayor a menor:" + dimension3);


    }
}
