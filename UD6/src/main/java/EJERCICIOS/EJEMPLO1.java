package EJERCICIOS;

public class EJEMPLO1 {
    public static void main(String[] args) {


    double[] notas = new double[] {7, 3, 9, 6, 5};
    double suma = 0;
    double media;

    int i = 0;

    for ( i = 0; i < notas.length; i++) {
        suma += notas[i]; // Equivale a: suma = suma + notas[i]
    }
    media = suma / notas.length;
    System.out.println("La nota media es:"  + media);
}


}