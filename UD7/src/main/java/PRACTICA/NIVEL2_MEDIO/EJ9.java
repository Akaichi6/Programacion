package PRACTICA.NIVEL2_MEDIO;

import java.util.Scanner;

public class EJ9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero: ");
        int numero1 = sc.nextInt();
        System.out.println("Introduce el numero: ");
        int numero2 = sc.nextInt();
        System.out.println("Introduce el numero: ");
        int numero3 = sc.nextInt();


        if (mayor(numero1,numero2)>numero3){
            System.out.println(" El numero mayor es: " + mayor(numero1,numero2));
        }else {
            System.out.println("El numero mayor es: " + numero3);
        }


    }
    public static int mayor(int a, int b){

        return Math.max(a,b);
    }
}
