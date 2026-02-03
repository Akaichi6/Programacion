import java.util.Arrays;
import java.util.Scanner;

public class EJ4 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("introduce la cantidad de numeros que quepan en la dimension: ");
        int n = sc.nextInt();
        rellenarvector(n);

    }
    static void rellenarvector (int n){
       Scanner sc = new Scanner(System.in);
        int [] vector = new int[n];

        for (int i = 0; i < vector.length; i++) {
            System.out.print("introduce un valor: ");
            vector[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(vector));
    }
}
