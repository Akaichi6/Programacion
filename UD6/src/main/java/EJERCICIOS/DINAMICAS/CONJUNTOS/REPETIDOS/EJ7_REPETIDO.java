package EJERCICIOS.DINAMICAS.CONJUNTOS.REPETIDOS;

import java.util.*;

public class EJ7_REPETIDO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> set1 = new HashSet<>();
        HashSet<String> set2 = new HashSet<>();
        String CLAVE = "tengo TartamudEz y REPITO mucho Mucho todas lAS palabras";

        System.out.println("Introduce una frase: ");
        String frase = Arrays.toString(sc.nextLine().toLowerCase().trim().split(" "));

        for ( String palabra : set1 ){
            set1.add(palabra);
        }
        System.out.println(set1);
        System.out.println("Palabras repetidas: " );
        System.out.println("Palabras no repetidas: ");
    }
}
