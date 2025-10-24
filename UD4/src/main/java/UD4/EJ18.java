package UD4;

import java.util.Scanner;

public class EJ18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de barras de pan del dia vendidas: ");
        double pandia = sc.nextDouble();
        System.out.println("Ingrese la cantidad de barras de pan de ayer vendidas: ");
        double panduro = sc.nextDouble();
        double preciopandia = 1.20;
        double preciopanduro = 1.20 - (preciopandia*0.5);
        double ganancias = (preciopandia * pandia) + (preciopanduro * panduro);
        System.out.println("Los ingresos obtenidos son(Println): "+ ganancias);
        System.out.printf("Los ingeresos obtenidos son(Printf): %.2f\n", ganancias);
    }
}
