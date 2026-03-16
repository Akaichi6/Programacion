package EJERCICIOS_F_APP;

public class Cuenta {
    private String codigo;
    private String dniResponsale;
    private Departamento dpto;
    private double saldo;
    private Transaccion transacciones;

    public Cuenta(String dniResponsale, Departamento dpto) {
        this.codigo = dniResponsale;
        this.dpto = dpto;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDniResponsale() {
        return dniResponsale;
    }

    public void setDniResponsale(String dniResponsale) {
        this.dniResponsale = dniResponsale;
    }

    public Departamento getDpto() {
        return dpto;
    }

    public void setDpto(Departamento dpto) {
        this.dpto = dpto;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Transaccion getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(Transaccion transacciones) {
        this.transacciones = transacciones;
    }

    public void alta(Producto apple) {
    }

    public void baja(String hp) {
    }

    public String getDniResponsable() {

        return "";
    }

}
