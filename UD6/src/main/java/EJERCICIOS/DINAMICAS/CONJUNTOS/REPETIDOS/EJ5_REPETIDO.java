package EJERCICIOS.DINAMICAS.CONJUNTOS.REPETIDOS;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class EJ5_REPETIDO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashSet<String> set = new LinkedHashSet<>();

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
