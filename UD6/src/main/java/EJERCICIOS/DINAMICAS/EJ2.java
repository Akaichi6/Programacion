package EJERCICIOS.DINAMICAS;

import java.util.*;

public class EJ2 {

    public static void main(String[] args) {
        ArrayList <Integer> dimension = new ArrayList();
        Random rand = new Random();
         final int TAMANYO_MIN = 10;
        final int TAMANYO_MAX = 20;
        final int NUM_MAX_RANDOM = 100;
        int suma = 0;
        int media = 0;
        int minimo = 0;
        int maximo = 0;

        int tamanyolista = rand.nextInt(TAMANYO_MAX-TAMANYO_MIN+1)+TAMANYO_MIN;

        for (int i = 0; i < tamanyolista;i++){
            dimension.add(rand.nextInt(NUM_MAX_RANDOM));

            suma  += dimension.get(i);
            media = suma/tamanyolista;
            minimo = Collections.min(dimension);
            maximo = Collections.max(dimension);

        }

        System.out.println( "La lista genereada es: " + dimension);
        System.out.println( "La suma total es: " + suma);
        System.out.println( "La media es: " + media);
        System.out.println( "El minimo es: " + minimo );
        System.out.println( "El maximo es: " + maximo );


    }
}
