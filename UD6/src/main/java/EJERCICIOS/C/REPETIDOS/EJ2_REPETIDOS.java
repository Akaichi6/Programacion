package EJERCICIOS.C.REPETIDOS;

public class EJ2_REPETIDOS {
    public static void main(String[] args) {
        int [][] matriz = new int [10][10];


        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matriz[i][j] = (i + 1) * (j + 1);
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
