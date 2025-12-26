package EJERCICIOS.DINAMICAS.MAPAS;

import java.util.HashMap;
import java.util.Scanner;

public class EJ1 {
    public static void main(String[] args) {

        HashMap<String, Integer> palabras = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase: ");
        String frase = sc.nextLine();

        for (int i = 0; i < frase.length(); i++)
        {
             String letra = String.valueOf(frase.charAt(i));
          //System.out.println("Posicion: " + i + "Caracter: " + frase.charAt(i) );// solo para ver si va
            if (palabras.containsKey(frase))
            {
                palabras.put(letra, palabras.get(letra) + 1);
            }
            else
            {
                palabras.put(letra, 1);
            }

        }
        System.out.println("Frecuencia de caracteres: ");
        for (String letra : palabras.keySet())
            {
            System.out.println("'" + letra + "'" + ": " + palabras.get(letra));
            }


    }
}
