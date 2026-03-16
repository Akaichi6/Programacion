package EJERCICIO_1;

public class Barco extends Vehiculo{
    private double metrosEslora;

    public Barco(String marca, String modelo, double velocidadActual, double metrosEslora) {
        super(marca, modelo, velocidadActual);
        this.metrosEslora = metrosEslora;
    }
    public boolean permisoSpecial (double metros) {
        boolean permiso = false;
       if (metrosEslora > 30){
           permiso = true;
       }else {
           permiso = false;
       }
        return permiso;
    }
    public void acelerar(double velocidad) {
        super.acelerar(velocidad);
    }
    @Override
    public String mostrarInfo(){
        return super.mostrarInfo() +
                "\nEslora:" + metrosEslora + " m";
    }

    public double getMetrosEslora() {
        return metrosEslora;
    }

    public void setMetrosEslora(double metrosEslora) {
        this.metrosEslora = metrosEslora;
    }
}
