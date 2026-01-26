package EJERCICIOS;

import java.lang.reflect.Array;
import java.util.*;

public class EJ5 {
    public static void main(String[] args) {

         ArrayList<String> empresas = new ArrayList<>(Arrays.asList("Uber","Apple","Ikea", "Oracle", "Iberdrola", "Endesa",
                 "Amazon", "Adobe" ));
        System.out.println(empresas);

        System.out.println(filtrarPorVocal(empresas));
    }

    public static Map<Character,String> filtrarPorVocal (ArrayList<String> empresas){

        Map<Character,ArrayList> map=new HashMap<>();

        char [] vocales = {'a','e','i','o','u'};


        for (char c : vocales) {
            map.put(c, new ArrayList<>());

        }
        for (String empresa : empresas) {
            char inicial = empresa.charAt(0);
            if(empresas.contains(inicial)){
                map.get(inicial).add(empresa);
            }else {
                map.put(empresa.charAt(0), new ArrayList());
            }
        }
        System.out.println(Arrays.toString(map.keySet().toArray()));








        return Map.of();
    }
}
