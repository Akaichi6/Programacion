package EJERCICIOS;

import java.util.Scanner;

//Escribe un programa que solicite dos números diferentes por teclado. De no serlo, el programa finalizará, y si son diferentes el programa debe visualizarlos por pantalla SOLO si son enteros. Si ninguno es entero, se mostrará un mensaje indicándolo, y si alguno de los dos o los dos lo son,deben ser mostrados por pantalla.
public class EJ8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        double num1 = sc.nextDouble();
        System.out.println("Introduce un numero: ");
        double num2 = sc.nextDouble();
        if (num1 != num2) {
           if (num1 % 1==0 && num2 % 1==0){
               System.out.println(num1);
               System.out.println(num2);
           }

        } else { num1 = num2;
            System.err.println("error");
        }

    }
}
