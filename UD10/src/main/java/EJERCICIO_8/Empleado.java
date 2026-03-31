package EJERCICIO_8;

public abstract class Empleado {
    protected String nombre;
    protected double salarioBase;
    protected Dispositivo dispositivo;

    public Empleado(String nombre, Dispositivo dispositivo, double salarioBase) {
        if (nombre == null) {
            throw new IllegalArgumentException("El nombre es obligatorio");
        }
        if (salarioBase <= 0) {
            throw new IllegalArgumentException("La salario debe ser mayor a 0");
        }
        this.nombre = nombre;
        this.dispositivo = dispositivo;
        this.salarioBase = salarioBase;
    }

    public Empleado() {

    }


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

    public Dispositivo getDispositivo() {
        return dispositivo;
    }

    public void setDispositivo(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    public abstract double calcularSalario();



    public void mostrarIformacion (){
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario con bono: " + calcularSalario() + "€");

        if (dispositivo != null) {
            dispositivo.estadoDispositivo();
        }else  {
            System.out.println("No tiene dispositivo");
        }


    }
    @Override
    public String toString() {
        return "Empleado: "
                + "Salario Base: " + salarioBase + '€';
    }
}


