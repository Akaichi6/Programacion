package UD4;

import java.util.Scanner;

public class EJ11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Numero del radio es: ");
        double radio = sc.nextInt();

        double longitud =Math.PI*radio;
        double area = Math.PI * Math.pow(radio,2);
        double volmunen = 4.0/3 * Math.PI * Math.pow(radio,3);
        System.out.println(" Con print ln:");
        System.out.println("Longitud del radio: "+longitud);
        System.out.println("Area del radio: "+area);
        System.out.println("Volumen del radio: "+volmunen);
        System.out.printf("Con Printf:");
        System.out.printf("La Longitud es: %.2f\nEl area es: %.2f\nEl volumen es: %.2f",longitud,area,volmunen);
        sc.close();



    }
}
