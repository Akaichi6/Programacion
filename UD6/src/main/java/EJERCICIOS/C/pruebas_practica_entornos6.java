package EJERCICIOS.C;

import java.util.Scanner;

public class pruebas_practica_entornos6 {
    public static void main(String[] args) {
     int j = 2;
     int s = 0;
     int n;

     Scanner sc = new Scanner(System.in);
     System.out.println("introduce un numero: ");
     n = sc.nextInt();

     while (j < n)
     {
         n = n/2;

         if (n % j == 0)
         {
            s = s + 1; j = j + 1;
         }
         if (s == 0)
             System.out.println(n + " es primo");
         else
             System.out.println(n + " no es primo");
     }
    }
}
