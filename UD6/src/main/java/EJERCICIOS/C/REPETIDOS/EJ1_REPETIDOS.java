package EJERCICIOS.C.REPETIDOS;

public class EJ1_REPETIDOS {
    public static void main(String[] args) {
        int [] [] matriz = new int [5][5];
        int numero = 1;

        for (int i = 0; i < 5; i++) { // Bucle externo para las filas
            for (int j = 0; j < 5; j++) { // Bucle interno para las columnas
                matriz[i][j] = numero;
                numero++;
            }
        }
        for (int i = 0; i < matriz.length; i++) { // para las filas
            for (int j = 0; j < matriz[i].length; j++) { // para las columnas
                System.out.print(matriz[i][j] + "\t"); // ponemos \t para tabular los resultados
            }
            System.out.println(" "); // esto es para que haya un salto de linea entre los resultados

        }
    }
}
