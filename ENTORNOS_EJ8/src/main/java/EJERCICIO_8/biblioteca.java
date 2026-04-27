package EJERCICIO_8;

import java.util.ArrayList;
import java.util.List;

public class biblioteca {
    private String nombre;
    private String direccion;
    private ArrayList<categoria> categoria;
    private ArrayList<libro> catalogo;

    public biblioteca(String nombre, String direccion) {
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
    public void listarLibros(){
        for (libro l : catalogo){
            System.out.println("Libro: " + l.getTitulo()  + " - " + l.getAutor() + l.getAnioPublicacion());
        }
    }
    public void listarCategorias(){
        for (categoria c : categoria){
            System.out.println("-" + c.getNombre());
        }
    }
    public ArrayList<libro> buscarPorTitulo (String texto){
       ArrayList<libro> resultado = new ArrayList<>();
        for (libro l : catalogo){
            if (l.getTitulo().toLowerCase().contains(texto.toLowerCase())){
                resultado.add(l);
            }
        }
        return resultado;
    }
public List<libro> buscarPorCategoria (String nombreCategoria) {
    List<libro> resultado = new ArrayList<>();
        for (libro l : catalogo) {
            if (l.getAutor().toLowerCase().contains(nombreCategoria.toLowerCase())) {
                resultado.add(l);
            }
        }
        return resultado;
    }
    public List<libro> buscarDisponibles(){
        List<libro> resultado = new ArrayList<>();
        for (libro l : catalogo){
            if (l.isDisponible()){
                resultado.add(l);
            }
        }
        return resultado;
    }

    public void registrarCategoria(categoria categoria) {
        categoria.add(categoria);
        System.out.println("Categoria registrada: " + categoria.getNombre());


    }
}


