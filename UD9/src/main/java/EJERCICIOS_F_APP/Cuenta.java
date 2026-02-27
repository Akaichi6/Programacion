package EJERCICIOS_F_APP;

public class Cuenta {
    private String codigo;
    private String dniResponsale;
    private Departamento dpto;
    private double saldo;
    private Transaccion transacciones;

    public Cuenta(String codigo, Departamento dpto) {
        this.codigo = codigo;
        this.dpto = dpto;
    }


    public void alta(Producto apple) {
    }

    public void baja(String hp) {
    }
}
