package EJERCICIOS.DINAMICAS.CONJUNTOS;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class EJ7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashSet<String> lhs1 = new LinkedHashSet();

        LinkedHashSet<String> lhs3 = new LinkedHashSet();

        System.out.println("Introduce una frase:");
        String frase = sc.nextLine().toLowerCase();
        frase.split(" ");

        lhs1.add(frase);
        LinkedHashSet<String> lhs2 = new LinkedHashSet(lhs1);

        System.out.println(lhs1);
        System.out.println(lhs2);






    }
}
