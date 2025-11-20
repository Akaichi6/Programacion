package EJERCICIOS.EJ5_2.PARTE_B;

public class EJ5 {
    public static void main(String[] args) {


        int numero = 0;
        int contador = 0;
        int suma = 0;
        while (contador<6){
           int cuadrado = numero*numero;
           suma += cuadrado;
           contador++;
           numero++;


        }
        System.out.println("La suma de los cuadrdos es: " + suma);
    }
}
