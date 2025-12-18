package EJERCICIOS.DINAMICAS.CONJUNTOS;

import java.util.*;

import java.util.Collections;


public class EJ7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<String> no_repetidos = new TreeSet<>();
        TreeSet<String> repetidos = new TreeSet<>();
        Set<String> vistos = new TreeSet<>();

        System.out.println("Introduce una frase:");
        String frase = sc.nextLine().toLowerCase();
        String[] palabras = frase.split(" ");

        List <String> miLista = new ArrayList<String>(vistos);

        for (String palabra : palabras)
        {

        }

        int repeticiones = Collections.frequency(miLista,palabras);


    /*
        for (String palabra : palabras) {

            if (!vistos.add(palabra)) {
                repetidos.add(palabra);
                no_repetidos.remove(palabra);
            } else {
                no_repetidos.add(palabra);
                repetidos.remove(palabra);
            }
        }

        System.out.println("Palabras repetidas: " + repetidos);
        System.out.println("Palabras no repetidas: " + no_repetidos);
    */

    }

}

