package EJERCICIOS.C.REPETIDOS;

import java.util.Scanner;

public class EJ5_REPETIDOS {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        System.out.println("Número de personas: ");
        int numero_personas=sc.nextInt();
        double [][] matriz = new double [numero_personas][2];//el 2 es la cantidad de datos que queremos guardar ahora son genero y salario
        for (int i = 0; i < numero_personas; i++) {
            System.out.println("Genero (0 para hombre y 1 para mujer) persona " + (i+1) );
            matriz[i][0]=sc.nextDouble();
            System.out.println("Sueldo: ");
            matriz[i][1]=sc.nextDouble();
        }
        System.out.println("----------------------------------------------------------");
        double salarioT_hombre = 0;
        double salarioT_mujer = 0;
        int hombres = 0;
        int mujeres = 0;

        for (int i = 0; i < numero_personas; i++) {
            if(matriz[i][0] == 0){
                System.out.println("Hombre -> " + matriz[i][1]);
                salarioT_hombre += matriz[i][1];
                hombres++;
            }else {
                System.out.println("Mujer -> " + matriz[i][1]);
                salarioT_mujer += matriz[i][1];
                mujeres++;

            }
        }
        if (hombres > 0) {
            System.out.println("Sueldo medio de los hombres es: " + salarioT_hombre / hombres + " euros");
        }else {
            System.out.println("No hay hombres registradas");
        }
        if (mujeres > 0) {
            System.out.println("El sueldo medio de las mujeres es: " + salarioT_mujer / mujeres+ " euros");
        }else {
            System.out.println("No hay mujeres registradas");
        }

    }

}
