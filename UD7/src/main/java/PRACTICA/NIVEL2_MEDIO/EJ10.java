package PRACTICA.NIVEL2_MEDIO;

import java.util.Scanner;

public class EJ10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la fecha: ");
        System.out.println("Introduce el dia: ");
        int dia = sc.nextInt();
        System.out.println("Introduce la mes: ");
        int mes = sc.nextInt();
        System.out.println("Introduce el año: ");
        int anio = sc.nextInt();


        System.out.println(" El forato de la fecha " + dia + "/" + mes + "/" + anio + " es " + formatofecha(dia,mes,anio));
    }
    public  static boolean formatofecha(int dia,int mes,int anio){
        if (dia <= 30 && dia >= 1 && mes >= 1 && mes <= 12 && anio >= 1900 && anio <= 2100){
            return true;
        }else {
            return false;
        }
    }
}
