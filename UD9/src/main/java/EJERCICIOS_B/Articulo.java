package EJERCICIOS_B;

public class Articulo {
    String nombreArticulo;
    double precio;
    double iva;
    int cuantosQedan;

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
        this.cuantosQedan = cuantosQedan;
    }
}
