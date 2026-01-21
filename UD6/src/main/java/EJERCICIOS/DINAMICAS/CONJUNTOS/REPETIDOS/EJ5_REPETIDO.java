package EJERCICIOS.DINAMICAS.CONJUNTOS.REPETIDOS;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class EJ5_REPETIDO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashSet<String> set = new LinkedHashSet<>();
        while (!set.contains("fin")){
            System.out.println("Introduce nombres (fin para finalizar): ");
            set.add(sc.nextLine().toLowerCase());
        }
        System.out.println("El conjunto de nombres no ordenados: " + set);
    }
}
