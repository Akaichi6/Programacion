package UD5;

import java.util.Scanner;

public class EJ8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int salida = 0;
        while (salida == 1) {
            System.out.print("introduce un numero: ");
            int num1 = sc.nextInt();
            System.out.print("introduce un numero: ");
            int num2 = sc.nextInt();
            if  (num1 != num2) {
                if (num1 % 1== 0 && num2 % 1 == 0) {
                    System.out.println("Los números " + num1 + "y" + num2 + " son enteros.");
                }
            }else
                System.out.println("error");

        }
    }
}
