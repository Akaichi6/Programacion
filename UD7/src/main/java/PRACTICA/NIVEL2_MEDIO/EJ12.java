package PRACTICA.NIVEL2_MEDIO;

import java.util.Scanner;

public class EJ12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce los km: ");
        int km = sc.nextInt();

        System.out.println(conversion(km));
    }
    public static double conversion(int a){
        double millas = 0.621371;

        return (millas * a);
    }

}
