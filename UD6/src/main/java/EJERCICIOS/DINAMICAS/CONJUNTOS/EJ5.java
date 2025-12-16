package EJERCICIOS.DINAMICAS.CONJUNTOS;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class EJ5 {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        HashSet<String> t1 = new HashSet<>();
        
        final String clave  = "fin";
        System.out.println("Introduce nombres (escribe 'fin' para terminar): ");
        String nombre =  st.nextLine();
        
        
        
        int intentos = 0;
        while ( intentos == 0)
        {
            if (nombre.equals("fin"))
            {
                System.out.println("El programa acaba");
                intentos++;
            } else if (!nombre.equals("fin"))
            {
                t1.add(nombre);
                nombre = st.nextLine();
            }
                
        }
        System.out.println("El conjunto de nombres no ordenados: " + t1);
    }


}

