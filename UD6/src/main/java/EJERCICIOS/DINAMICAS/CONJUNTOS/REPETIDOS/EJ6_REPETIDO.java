package EJERCICIOS.DINAMICAS.CONJUNTOS.REPETIDOS;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class EJ6_REPETIDO {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TreeSet<String> set = new TreeSet<>();

        String CLAVE = "fin";

        System.out.println("Introduce nombres (fin para finalizar): ");
        String nombres = sc.nextLine().toLowerCase();

        while (!nombres.equals(CLAVE)) {
            set.add(nombres);
            nombres = sc.nextLine();
        }
        System.out.println("El conjunto de nombres no ordenados: " + set);

    }
}
