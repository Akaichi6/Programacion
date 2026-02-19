package EJERCICIOS_C;


    public class Articulo {
        private String nombreArticulo;
        private double precio;
        private double iva;
        private int cuantosQedan;

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
            return cuantosQedan;
        }

        public void setCuantosQedan(int cuantosQedan) {
            this.cuantosQedan = cuantosQedan;
        }
    }

