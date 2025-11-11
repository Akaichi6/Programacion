package EJERCICIOS.EJ5_2.PARTE_B;

import java.util.Scanner;

public class EJ11B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Di un numero: ");
        int numero = sc.nextInt();

        int contadorfallos = 0;
        int contadornumero = 0;
        int contadorvalidos = 0;

        if (numero != 0){

            while (numero>numero) {
                System.out.println("Di un numero: ");
                numero = sc.nextInt();

            }

        }else {
            System.out.println(contadorfallos);

        }
    }


}
