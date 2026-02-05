import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EJ5 {
    public static void main(String[] args) {


        int numeros[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        division(numeros);

    }

    public static double division(int [] numeros){

        Scanner sc = new Scanner(System.in);

        double division = 0 ;

        try{
            System.out.println(Arrays.toString(numeros));
            System.out.println("Introduce la posición del número que quieres: ");
            int dividendo = sc.nextInt();

            System.out.println("Introduce la posición del número que quieres: ");
            int divisor = sc.nextInt();

            dividendo = numeros[dividendo -1];
            System.out.println("Dividendo: " + dividendo);

            divisor = numeros[divisor -1];
            System.out.println("Divisor: " + divisor);

            if (divisor != 0){
                division = (double) dividendo / divisor;

            } else  {
                throw new ArithmeticException("La division no puede realizarse entre 0");
            }

        }
        catch (InputMismatchException e){
            System.out.println("Valor introducido debe ser numérico");
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Indice fuera de su límite.");
        }

        return division;

    }

}
