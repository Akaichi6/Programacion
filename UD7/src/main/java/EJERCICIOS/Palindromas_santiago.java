package EJERCICIOS;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Palindromas_santiago {
    public static void main(String[] args) {
        List<String> original = new ArrayList<>(List.of("reconocer", "osa", "palabra", "radar", "sometemos", "hannah",
                "java"));

    }

    public static TreeSet<String> encontrarPalindromas(List<String> original) {
        TreeSet<String> set = new TreeSet<>();

        for (String palabra : original) {

            if (esPalindroma(palabra)) {
                set.add(palabra);
            }
        }
        return set;
    }

    public static boolean esPalindroma(String palabra) {
        List<String> palindromas = new ArrayList<>();

        for (int i = 0; i <  / 2; i++) {

                


            }
        }
        return false;
    }
}