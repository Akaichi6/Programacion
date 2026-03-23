package EJERCICIO_8;

import java.awt.*;
import java.util.ArrayList;

public class biblioteca {
    private String nombre;
    private String direccion;
    private ArrayList<categoria> categoria;
    private ArrayList<libro> catalogo;

    public biblioteca(String nombre, String direccion, ArrayList<categoria> categoria) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.categoria = new ArrayList<>();
        this.catalogo = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<categoria> getCategoria() {
        return categoria;
    }

    public void setCategoria(ArrayList<categoria> categoria) {
        this.categoria = categoria;
    }
    //metodos
    public void mostrarInformacion(){
        System.out.println("Biblioteca: " + nombre);
        System.out.println("Direccion: " + direccion);
        System.out.println("Categoria: " + categoria.size());
        System.out.println("Catalogo: " + catalogo.size());;
    }
    public void registrarLibro(libro libro){
        catalogo.add(libro);
        libro.getCategoria().agregarLibro(libro);
        System.out.println("Libro registrado: " + libro.getTitulo());
    }
}
