package EJERCICIO_4;

public abstract class Astro {
    protected String nombre;
    protected double radio;
    protected double rotacion;
    protected double masa;
    protected double temperaturaMedia;
    protected double gravedad;

    public Astro(String nombre, double raio, double rotacion, double masa, double gravedad, double temperaturaMedia) {
        this.nombre = nombre;
        this.radio = radio;
        this.rotacion = rotacion;
        this.masa = masa;
        this.gravedad = gravedad;
        this.temperaturaMedia = temperaturaMedia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRotacion() {
        return rotacion;
    }

    public void setRotacion(double rotacion) {
        this.rotacion = rotacion;
    }

    public double getMasa() {
        return masa;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public double getTemperaturaMedia() {
        return temperaturaMedia;
    }

    public void setTemperaturaMedia(double temperaturaMedia) {
        this.temperaturaMedia = temperaturaMedia;
    }

    public double getGravedad() {
        return gravedad;
    }

    public void setGravedad(double gravedad) {
        this.gravedad = gravedad;
    }

    // metodo abstracto
    public abstract void muestra();
}
