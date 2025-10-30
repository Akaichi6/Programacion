package EJREPTIDOS;

import java.util.Scanner;

public class EJ11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el rado: ");
        int radio = sc.nextInt();
        double circunferencia = 2*Math.PI*radio;
        double volumen = (4.0/3)*Math.PI*Math.pow(radio,3);
        System.out.printf("El volumen es: %.3f\n",volumen);
        System.out.printf("El circunferencia es: %.3f",circunferencia);



    }
}
