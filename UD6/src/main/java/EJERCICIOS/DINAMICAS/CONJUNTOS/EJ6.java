package EJERCICIOS.DINAMICAS.CONJUNTOS;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class EJ6 {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        TreeSet<String> t1 = new TreeSet<>();

        final String clave  = "fin";
        System.out.println("Introduce nombres (escribe 'fin' para terminar): ");
        String nombre =  st.nextLine();
        nombre = nombre.toUpperCase();


        while(!nombre.equalsIgnoreCase("fin"))
        {
            t1.add(nombre);
            nombre = st.nextLine();
            nombre = nombre.toUpperCase();
        }
        System.out.println("El conjunto de nombres no ordenados: " + t1);
    }
}
