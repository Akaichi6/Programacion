import java.util.InputMismatchException;
import java.util.Scanner;

public class EJ3 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);


        try {
            System.out.println("introduce un numero negativo: ");
            int n  = sc.nextInt();

            imprimeNegativo(n);

        }
        catch (InputMismatchException e) {
            System.out.println("Valor introducido incorrecto");
        }
        catch (excepcionNegativos e){
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("introduce un numero positivo: ");
            int p  = sc.nextInt();

            imprimePositivo(p);

        }

        catch (InputMismatchException e) {
            System.out.println("Valor introducido incorrecto");
        }
        catch (excepcionPositivos e){
            System.out.println(e.getMessage());
        }
    }
    public static void imprimePositivo(int p) throws excepcionPositivos{
        if(p>=0){
            System.out.println( "El número positivo es:" + p);

        }else {
            throw  new excepcionPositivos(p);
        }
    }
    public static void imprimeNegativo( int n) throws excepcionNegativos{
        if(n < 0){
            System.out.println("EL número negativo es: " + n);

        }
        else {
            throw new excepcionNegativos (n);
        }
    }

}

class  excepcionNegativos extends Exception {
    public excepcionNegativos(int mensaje) {
        super("El número introducido no puede ser positivo");
    }
}
class  excepcionPositivos extends Exception {
    public  excepcionPositivos(int mensaje){
        super("El número introducido no puede ser negativo" );
    }
}




