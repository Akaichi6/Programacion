package EJERCICIOS.DINAMICAS.CONJUNTOS;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class EJ8 {
    public static void main(String[] args) {
        TreeSet<Integer> original1 = new TreeSet<>();
        TreeSet<Integer> original2 = new TreeSet<>();


        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un conjunto numeros separados por comas: ");
        String original_dentro = sc.nextLine();
        String[] original_separados = original_dentro.split(",");

        System.out.println("Introduce un conjunto numeros separados por comas:");
        String original_dentro2 = sc.nextLine();
        String[] original_separados2 = original_dentro2.split(",");


        for (String s : original_separados) {
            original1.add(Integer.parseInt(s));
        }
        for (String s : original_separados2) {
            original2.add(Integer.parseInt(s));
        }

        TreeSet<Integer> combinado = new TreeSet<>(original1);
        combinado.addAll(original2);
        TreeSet<Integer> interseccion =  new TreeSet<>(original1);
        interseccion.retainAll(original2);


        System.out.println("Original 1 " + original1);
        System.out.println("Original 2 " + original2);
        System.out.println("Interseccion: " + interseccion);
        System.out.println("union: "+ combinado);

    }
}
