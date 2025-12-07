package EJERCICIOS.C;

import java.util.Arrays;

public class EJ8 {
    public static void main(String[] args) {

        String paises [] = {"España", "Alemania", "Japon", "Rusia"};
        final int ALTURAMAX = 210;
        final int ALTURAMIN = 140;

        int[][] estaturas = new int[4][10];
        System.out.println("\n                                                        MED MIN MAX");

        for (int i = 0; i < paises.length; i++) {
            for (int j = 0; j < estaturas[i].length; j++) {
                estaturas[i][j] = (int) (Math.random()  * (ALTURAMAX - ALTURAMIN )) + ALTURAMIN;
            }

        }
        for (int i = 0; i < paises.length; i++) {

            System.out.printf("%-10s: ", paises[i]);


            int[] ordenado = Arrays.copyOf(estaturas[i], estaturas[i].length);

            Arrays.sort(ordenado);


            int min = ordenado[0];
            int max = ordenado[ordenado.length - 1];

            int suma = 0;
            for (int v : estaturas[i]) suma += v;
            int media = suma / estaturas[i].length;

            // Imprimir estaturas sin ordenar (como en el ejemplo)
            for (int j = 0; j < estaturas[i].length; j++) {

                System.out.print(estaturas[i][j] + " ");

            }

            System.out.printf(" |  %3d %3d %3d%n", media, min, max);

        }
    }
}
