package EJERCICIOS;

import java.util.*;

public class EJ5_santiago {
    public static void main(String[] args) {

         ArrayList<String> empresas = new ArrayList<>(Arrays.asList("Uber","Apple","Ikea", "Oracle", "Iberdrola", "Endesa",
                 "Amazon", "Adobe" ));

        System.out.println("Empresas agrupadas por vocal inicial y ordenadas alfabticamente: " );
        filtrarPorVocal(empresas);

    }

    public static Map<Character, ArrayList> filtrarPorVocal (ArrayList<String> empresas){

        Map<Character,ArrayList> map=new HashMap<>();

        char [] vocales = {'a','e','i','o','u'};

        for (char c : vocales) {
            map.put(c, new ArrayList<>());

        }
        for (String empresa : empresas) {
            char inicial = Character.toLowerCase(empresa.charAt(0));

            if(map.containsKey(inicial)){
                map.get(inicial).add(empresa);
            }else {
                map.put(empresa.charAt(0), new ArrayList());
            }
        }

        for (List<String> lista : map.values()) {
            Collections.sort(lista);
        }

        for (char v : new char[]{'a','e','i','o','u'}) {
            System.out.println(v + ": " + map.get(v));
        }
        return map;
    }
}
