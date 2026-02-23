package EJERCICIOS_D;

import java.util.Scanner;

public class Articulo {
    private String nombreArticulo;
    private double precio;
    private double iva;
    private int cuantosQuedan;

    public Articulo(String nombreArticulo, double precio, double iva, int cuantosQedan) {
        if (nombreArticulo == null || nombreArticulo.isEmpty()) {
            throw new IllegalArgumentException("Nombre de articulo no puede estar vacío.");
        }
        if (precio < 0) {
            throw new IllegalArgumentException("Precio no puede ser negativo.");
        }
        if (iva < 0 || iva > 100) {
            throw new IllegalArgumentException("IVA no puede ser negativo ni superior al 100%.");
        }
        if (cuantosQedan < 0) {
            throw new IllegalArgumentException("Los artículos no pueden ser negativo.");
        }
        this.nombreArticulo = nombreArticulo;
        this.precio = precio;
        this.iva = iva;
        this.cuantosQuedan = cuantosQedan;
    }

    public String getNombreArticulo() {
        return nombreArticulo;
    }

    public void setNombreArticulo(String nombreArticulo) {
        this.nombreArticulo = nombreArticulo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public int getCuantosQedan() {
        return cuantosQuedan;
    }

    public void setCuantosQedan(int cuantosQedan) {
        this.cuantosQuedan = cuantosQedan;
    }

    public void imprimir (){
        System.out.print(" Nombre del articulo: " + nombreArticulo
        + "\n Precio: " + precio
        + "\n IVA: " + iva
        + "\n Cuantos Quedan: " + cuantosQuedan);
    }
    public double getPVP (){
        double precio_pvp = ((precio * iva)/100)+ precio;
        System.out.println("\n PVP: " + precio_pvp);
        return precio_pvp;
    }
    public boolean vender (){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Cuantas unidades desea: ");
        int unidades_requeridas = sc.nextInt();
        boolean resultado = true;
        int  cuantos_quedan = cuantosQuedan - unidades_requeridas;
        if (cuantosQuedan <= 0 && cuantosQuedan >= unidades_requeridas) {
            resultado = false;
        }
        return resultado;
    }
    public boolean comprar (){
        Scanner sc = new Scanner(System.in);
        boolean resultado_C = true;
        System.out.println("Unidades compradas:: ");
        int unidades_compradas = sc.nextInt();
        cuantosQuedan = cuantosQuedan + unidades_compradas;
        if (unidades_compradas <= 0) {
            resultado_C = false;
        }
        System.out.println("Las unidades que quedan son: " + cuantosQuedan);
        return  resultado_C;
    }

}
