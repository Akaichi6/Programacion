package EJERCICIO_8;

import java.util.ArrayList;

public class categoria {
    private String id;
    private String nombre;
    private String descripcion;
    private ArrayList<libro>libros;

    public categoria(String id, String nombre, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.libros = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ArrayList<libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<libro> libros) {
        this.libros = libros;
    }
    public void mostrarInformacion(){
        System.out.println("Categoria: " + nombre);
        System.out.println("Descripcion: " + descripcion);
        System.out.println("Libros: " + libros.size());
        for (libro l : libros) {
            System.out.println("Libro: " + l.getTitulo() + " - " + l.getAutor() + l.getAnioPublicacion());
        }
    }
    public void agregarLibro(libro libro){
        libros.add(libro);
    }
    public void totalLibros(){
        System.out.println("Total libros: " + libros.size());
    }

    public void add(categoria categoria) {

    }
}
