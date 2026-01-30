import java.util.InputMismatchException;
import java.util.Scanner;

public class EJ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int entero_a ;

        int errores = 0;
        boolean leidoCorrectamente = false;

        while (errores < 3 && !leidoCorrectamente) {
            try {
                System.out.print("Introduce un valor entero A: ");
                entero_a = sc.nextInt();

                System.out.println("Valor introducido: " + entero_a);
                leidoCorrectamente = true;

            } catch (InputMismatchException e) {

                System.out.println("Valor introducido incorrecto");
                errores++;

                sc.nextLine();
            }
        }
    }
}
