package EJERCICIOS.DINAMICAS.MAPAS;

import com.sun.jdi.Value;

import java.util.*;

public class EJ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<String, List<Integer>> palabras_totales = new LinkedHashMap<>();

        System.out.println("Introduce una frase: ");
        String frase = sc.nextLine().toLowerCase();
        String [] palabras_separadas = frase.split(" ");



            while (frase.isEmpty())
            {
                    System.out.println("La Frase no puede estar en blanco, vuelve a introducirla: ");
                    frase = sc.nextLine().toLowerCase();

            }
        for (int i = 0; i < palabras_separadas.length; i++) {
            String palabra = palabras_separadas[i];

            if (!palabras_totales.containsKey(palabra)) {
                palabras_totales.put(palabra, new ArrayList<>());
            }

            palabras_totales.get(palabra).add(i + 1);
        }

        System.out.println("Posiciones de las palabras:");
        for (String palabra : palabras_totales.keySet()) {
            System.out.println(palabra + "=" + palabras_totales.get(palabra));
        }



    }
}
