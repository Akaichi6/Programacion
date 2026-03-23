package EJERCICIO_4;

public abstract class Astro {
    protected String nombre;
    protected double radio;
    protected double rotacion;
    protected double masa;
    protected double temperaturaMedia;
    protected double gravedad;

    public Astro(String nombre, double radio, double rotacion, double masa, double gravedad, double temperaturaMedia) {
        if (nombre == null) {
            throw new IllegalArgumentException("El nombre es obligatorio");
        }
        if  (radio <= 0) {
            throw new IllegalArgumentException("El radio debe ser mayor o igual a 0 ");
        }
        if  (rotacion <= 0) {
            throw new IllegalArgumentException("El rotacion debe de estar entre 0 e 360 grados");
        }
        if  (masa <= 0) {
            throw new IllegalArgumentException("El masa debe ser mayor o igual a 0 ");
        }

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
