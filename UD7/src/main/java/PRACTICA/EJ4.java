package PRACTICA;

import java.util.Scanner;

public class EJ4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero: ");
        int numero1 = sc.nextInt();

       if (dimeSigno(numero1) == 0) {
           System.out.println("El numero es igual a 0");
       } else if (dimeSigno(numero1) == -1) {
           System.out.println("El numero es negativo");
       }else if (dimeSigno(numero1) == 1) {
           System.out.println("El numero es positivo");
       }


    }
    public static int dimeSigno(int a){
        if (a < 0)
        {
            return -1;
        }
        else if (a == 0)
        {
          return 0;
        }
        else
        {
            return 1;
        }
    }
}

