import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class EJ4 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("introduce la cantidad de numeros que quepan en la dimension: ");
        int n = sc.nextInt();

        int[] numeros = rellenarVector(n);

        convertirImprimirVector(numeros);
    }
    static int[] rellenarVector (int n){
       Scanner sc = new Scanner(System.in);
        int [] vector = new int[n];
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>(n);

        /*
        while (lhs.size() < n){

        }
         */
        try {
            for (int i = 0; i < n; i++) {
                System.out.print("Introduce un número:");
                int num = sc.nextInt();
                if (lhs.contains(num)) {
                    System.out.print("El numero ya existe, no pueden repetirse");
                    i--;
                    System.out.println();

                } else {
                    lhs.add(num);
                    vector[i] = num;
                }

            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return vector ;


    }
    static void convertirImprimirVector  (int[] vector){
        System.out.println(vector);

    }

}
