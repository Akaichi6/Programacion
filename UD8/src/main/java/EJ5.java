import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EJ5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        try{
            int numeros[] = {4, 5, 6, 7, 8, 9, 10};

            System.out.println(Arrays.toString(numeros));
            System.out.println("Introduce la posición del número que quieres: ");
            int posicion1 = sc.nextInt();

            System.out.println("Introduce la posición del número que quieres: ");
            int posicion2 = sc.nextInt();

            posiciones(numeros, posicion1, posicion2);
        }
        catch (InputMismatchException e){
            System.out.println("Valor introducido debe ser numérico");
        }
        catch (ArithmeticException e){
            System.out.println("La division no puede realizarse entre 0");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Indice fuera de su límite.");
        }

    }


    public static void posiciones(int [] numeros, int posicion1, int posicion2){

        int numero1 = 0;
        int numero2 = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (posicion1 == i) {
                numero1 = numeros[i]-1;
                System.out.println("Dividendo: " + numero1);
            }
            if (posicion2 == i) {
                numero2 = numeros[i]-1;
                System.out.println("Divisor: " + numero2);
            }

        }

        double division = (double) numero1 / numero2;
        System.out.println(division);
    }

}
