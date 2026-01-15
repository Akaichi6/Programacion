package EJERCICIOS.B.repetidos;

import java.util.Scanner;

public class EJ10_REPETIDO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Inreoduce los productos de la cesta separados por comas: ");
        String productos = sc.nextLine();
        String [] prouctos_separados = productos.split(",");

        System.out.println("Productos en la cesta: ");

        for (int i = 0; i < prouctos_separados.length; i++) {
            System.out.println(prouctos_separados[i]);
        }
    }
}
