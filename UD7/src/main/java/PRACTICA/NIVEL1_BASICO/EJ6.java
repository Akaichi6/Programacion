package PRACTICA.NIVEL1_BASICO;

import java.util.Scanner;

public class EJ6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int CANTIDAD_PRECIOS = 5;
        int numero_de_precio = 1;
        for (int i = 0; i<CANTIDAD_PRECIOS; i++){
            System.out.println("Introduce un precio: ");
            double precio = sc.nextDouble();
            System.out.println("el precio " + numero_de_precio + " con iva es: " + precioConIVA(precio));
            numero_de_precio++;
        }

    }
    public static double precioConIVA(double precio){
        int IVA = 21;
        return ((precio * IVA) / 100 + precio);
    }
}
