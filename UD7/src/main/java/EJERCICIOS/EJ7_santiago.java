package EJERCICIOS;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class EJ7_santiago {
    public static void main(String[] args) {

        Map<String, Integer> inventario1 = new LinkedHashMap<>();
        Map<String, Integer> inventario2 = new LinkedHashMap<>();

        //ENTRADA 1
        inventario1.put("SSD", 50);
        inventario1.put("Tarjeta gráfica", -10);
        inventario1.put("Memoria RAM", 30);
        inventario1.put("Procesador", 0);
        inventario1.put("Pantalla", 101);
        inventario1.put("", 15);

        //ENTRADA2
        inventario2.put("SSD", -50);
        inventario2.put("Tarjeta gráfica", 10);
        inventario2.put("Memoria RAM", 101);
        inventario2.put("", 100);
        inventario2.put("", -5);
        inventario2.put("", 101);
        inventario2.put("Procesador", 15);


        List<String> listaErrores1 = validarInventario(inventario1);
        System.out.println("");
        System.out.println("Entrada 1:");
        if (listaErrores1.isEmpty()) {
            System.out.println("El inventario es válido.");
        } else {
            System.out.println("El inventario contiene los siguientes errores:");
            for (String error : listaErrores1) {
                System.out.println("- " + error);
            }
        }
        List<String> listaErrores2 = validarInventario(inventario2);
        System.out.println("");
        System.out.println("Entrada 2:");
        if (listaErrores2.isEmpty()) {
            System.out.println("El inventario es válido.");
        } else {
            System.out.println("El inventario contiene los siguientes errores:");
            for (String error : listaErrores2) {
                System.out.println("- " + error);
            }
        }

    }


    public static List<String> validarInventario(Map<String, Integer> inventario) {
        List<String> errores = new ArrayList<>();


        for (Map.Entry<String, Integer> entrada : inventario.entrySet()) {
            String nombre = entrada.getKey();
            Integer cantidad = entrada.getValue();


            if (nombre == null || nombre.trim().isEmpty()) {
                errores.add("Nombre inválido para un producto con cantidad: " + cantidad);
            }


            if (cantidad < 0) {
                errores.add("Cantidad inválida para el producto: '" + nombre + "'");
            } else if (cantidad > 100) {
                errores.add("Cantidad inválida para el producto: '" + nombre + "'" );
            }
        }

        return errores;
    }
}
