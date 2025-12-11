package EJERCICIOS.C;

import java.util.Arrays;

public class EJ8 {
    public static void main(String[] args) {

        String paises [] = {"España","Alemania","Japon","Rusia"};
        final int ALTURAMAX = 140;
        final int ALTURAMIN = 210;

        //int[][] suma = new int[];
        int[][] estaturas = new int[4][10];

        for (int i = 0; i < paises.length; i++) {
            //System.out.println( paises[i] );
            for (int j = 0; j < estaturas[i].length; j++) {
                estaturas[i][j] = (int) (Math.random()  * (ALTURAMAX - ALTURAMIN )) + ALTURAMIN;
                System.out.print(estaturas[i][j] + " ");



            }
            System.out.println();
        }



    }
}
