package EJERCICIOS.DINAMICAS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EJ1 {
    public static void main(String[] args) {
        ArrayList<String> a =  new ArrayList<>(List.of("Vicente", "Mario","Elena", "Jorge", "Miguel", "Dilan" ));

        for (int i = 0; i < a.size(); i++)
        {
            System.out.println(a.get(i));
        }
        /*
         a.add("Vicente");
         a.add("Mario");
         a.add("Elena");
         a.add("Maria");
         a.add("Marta");
         a.add("Dilan");
        */

    }
}
