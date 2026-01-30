import java.util.Scanner;

public class EJ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce un número:");
        int p   = sc.nextInt();
        System.out.println("introduce un numero:");
        int n  = sc.nextInt();
        try {
            imprimeNegativo(n);
            imprimePositivo(p);
        }
        catch (ArithmeticException e) {
            System.out.println("");
        }

    }
    public static void imprimePositivo(int p){
        if(p<0){
            System.out.println(p);
        }
    }
    public static void imprimeNegativo(int n){
        if(n>=0){
            System.out.println(n);
        }
    }
}
