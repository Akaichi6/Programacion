import java.util.InputMismatchException;
import java.util.Scanner;

public class EJ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean leidocorrectamene = false;


            try {

                System.out.println("Introduce el valor entero A: ");
                int entero_a = sc.nextInt();
                System.out.println("Introduce el valor entero B: ");
                int entero_b = sc.nextInt();

                if(entero_b != 0){

                    double division = (double) entero_a /entero_b;
                    System.out.printf("La división es: %.2f", division);

                }else {
                    throw new ArithmeticException();
                }


            }
            catch (InputMismatchException e) {
                System.out.println("Valor introducido incorrecto");

            }
            catch (ArithmeticException e) {
                System.out.println("La division no puede ser entre 0");
            }


    }
}
