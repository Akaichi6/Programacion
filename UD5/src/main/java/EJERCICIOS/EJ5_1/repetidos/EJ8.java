package EJERCICIOS.EJ5_1.repetidos;

import java.util.Scanner;

public class EJ8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        double numero1 = sc.nextDouble();
        System.out.println("Introduce un numero: ");
        double numero2 = sc.nextDouble();

        if (numero1 !=numero2 && numero2!=numero1)
        {
          if (numero1 % 1==0  && numero2 % 1==0)
          {
              if (numero1 % 1==0)
              {
                  System.out.println("EL numero " + numero1 + " es entero");
              }
              if (numero2 % 1==0)
              {
                  System.out.println("EL numero " + numero2 + " es entero");
              }
          } else if (numero1 % 1==0)
          {
              int numero_1 = (int)numero1;
              System.out.println("EL numero " + numero_1 + " es entero");
          } else if (numero2 % 1==0)
          {
              int numero_2 = (int)numero2;
              System.out.println("EL numero " + numero2 + " es entero");
          }else
          {
              System.out.println("Ningun numero es entero");
          }
        }else
        {
            System.out.println(" Fin del programa ");
        }


    }
}
