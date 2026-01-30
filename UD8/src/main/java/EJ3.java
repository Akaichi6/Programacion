import java.util.InputMismatchException;
import java.util.Scanner;

public class EJ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
        System.out.println("introduce un número positivo: ");
        int p   = sc.nextInt();

        System.out.println("introduce un numero negativo: ");
        int n  = sc.nextInt();

            imprimeNegativo(n);
            imprimePositivo(p);
        }

        catch (InputMismatchException e) {
            System.out.println("Valor introducido incorrecto");
        }
        catch (excepcion_negativos){
            System.out.println();

        }



    }
    public static void imprimePositivo(int p){
        if(p>0){
            System.out.println( "El numero positivo es:" + p);
        }
    }
    public static void imprimeNegativo(int n) throws excepcion_negativos{
        if(n<0){
            System.out.println("EL numero negativo es: " + n);
        } else
        {
            throw new excepcion_negativos()
        }
    }



}
class  excepcion_negativos extends Exception {
    public excepcion_negativos(String mensaje){
        super("El numero no puede ser positivo" + mensaje);
    }

}
