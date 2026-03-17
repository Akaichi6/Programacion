package EJERCICIO_2;

public abstract class Empleado {
    //ATRIBUTOS
    protected String nombre;
    protected double salarioBase;
    //CONSTRUCTORES
    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }
    //GETTERS SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    //METODOS Y FUNCICONES
    public abstract double calcularSalario ();

    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario Base: " + salarioBase);
        System.out.println("Salario: " + calcularSalario());
    }


}
