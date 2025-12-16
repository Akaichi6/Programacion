package EJERCICIOS.DINAMICAS.CONJUNTOS;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class EJ5 {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        LinkedHashSet<String> t1 = new LinkedHashSet<>();
        
        final String CLAVE  = "fin";
        System.out.println("Introduce nombres (escribe 'fin' para terminar): ");
        String nombre =  st.nextLine();
        
        

            while(!nombre.equalsIgnoreCase(CLAVE))
            {
                t1.add(nombre);
                nombre = st.nextLine();
            }
         System.out.println("El conjunto de nombres no ordenados: " + t1);
        }


    }




