package EJ8_ENTORNOS;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa una categoría literaria dentro de la biblioteca.
 */
public class Categoria {

    private String id;
    private String nombre;
    private String descripcion;
    private List<Libro> libros;

    public Categoria(String id, String nombre, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.libros = new ArrayList<>();
    }

    // ── Getters ────────────────────────────────────────────────────────────────

    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public String getDescripcion() { return descripcion; }
    public List<Libro> getLibros() { return libros; }

    // ── Métodos ────────────────────────────────────────────────────────────────

    /** Registra un libro en esta categoría. */
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    /** Devuelve cuántos libros pertenecen a esta categoría. */
    public int totalLibros() {
        return libros.size();
    }

    /** Muestra los detalles de la categoría y sus libros. */
    public void mostrarInformacion() {
        System.out.println("╔═════════════════════════════════════════════╗");
        System.out.printf("║  ID          : %-28s ║%n", id);
        System.out.printf("║  Categoría   : %-28s ║%n", nombre);
        System.out.printf("║  Descripción : %-28s ║%n", descripcion);
        System.out.printf("║  Libros      : %-28d ║%n", libros.size());
        System.out.println("╚═════════════════════════════════════════════╝");
        if (!libros.isEmpty()) {
            System.out.println("  Libros en esta categoría:");
            for (Libro l : libros) {
                System.out.println("    • " + l);
            }
        }
    }

    @Override
    public String toString() {
        return String.format("[%s] %s (%d libros)", id, nombre, libros.size());
    }
}
