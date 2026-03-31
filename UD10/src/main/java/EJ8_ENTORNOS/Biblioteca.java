package EJ8_ENTORNOS;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Clase principal que gestiona el catálogo de libros y categorías.
 */
public class Biblioteca {

    private String nombre;
    private String direccion;
    private List<Libro> catalogo;
    private List<Categoria> categorias;

    public Biblioteca(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.catalogo = new ArrayList<>();
        this.categorias = new ArrayList<>();
    }

    // ── Registro ───────────────────────────────────────────────────────────────

    /** Registra una nueva categoría en la biblioteca. */
    public void registrarCategoria(Categoria categoria) {
        categorias.add(categoria);
        System.out.println("✔ Categoría registrada: " + categoria.getNombre());
    }

    /**
     * Registra un libro en el catálogo general y lo asocia a su categoría.
     * Si la categoría del libro aún no está en la biblioteca, la agrega automáticamente.
     */
    public void registrarLibro(Libro libro) {
        catalogo.add(libro);
        Categoria cat = libro.getCategoria();
        if (!categorias.contains(cat)) {
            categorias.add(cat);
        }
        cat.agregarLibro(libro);
        System.out.println("✔ Libro registrado: " + libro.getTitulo());
    }

    // ── Mostrar información ────────────────────────────────────────────────────

    /** Muestra el resumen general de la biblioteca. */
    public void mostrarInformacion() {
        System.out.println("\n╔══════════════════════════════════════════════════╗");
        System.out.printf("║  BIBLIOTECA : %-34s ║%n", nombre);
        System.out.printf("║  Dirección  : %-34s ║%n", direccion);
        System.out.printf("║  Libros     : %-34d ║%n", catalogo.size());
        System.out.printf("║  Categorías : %-34d ║%n", categorias.size());
        System.out.println("╚══════════════════════════════════════════════════╝");
    }

    /** Lista todos los libros del catálogo. */
    public void listarLibros() {
        System.out.println("\n── Catálogo completo (" + catalogo.size() + " libros) ──");
        if (catalogo.isEmpty()) {
            System.out.println("  (Sin libros registrados)");
            return;
        }
        for (Libro l : catalogo) {
            System.out.println("  • " + l);
        }
    }

    /** Lista todas las categorías. */
    public void listarCategorias() {
        System.out.println("\n── Categorías (" + categorias.size() + ") ──");
        for (Categoria c : categorias) {
            System.out.println("  • " + c);
        }
    }

    // ── Búsquedas ──────────────────────────────────────────────────────────────

    /**
     * Busca libros cuyo título o autor contenga el texto indicado
     * (búsqueda insensible a mayúsculas).
     */
    public List<Libro> buscarPorTituloOAutor(String texto) {
        String t = texto.toLowerCase();
        return catalogo.stream()
                .filter(l -> l.getTitulo().toLowerCase().contains(t)
                          || l.getAutor().toLowerCase().contains(t))
                .collect(Collectors.toList());
    }

    /** Devuelve todos los libros de una categoría concreta. */
    public List<Libro> buscarPorCategoria(String nombreCategoria) {
        return catalogo.stream()
                .filter(l -> l.getCategoria().getNombre()
                              .equalsIgnoreCase(nombreCategoria))
                .collect(Collectors.toList());
    }

    /** Devuelve únicamente los libros disponibles (no prestados). */
    public List<Libro> buscarDisponibles() {
        return catalogo.stream()
                .filter(Libro::isDisponible)
                .collect(Collectors.toList());
    }

    /** Devuelve libros publicados en un rango de años (ambos inclusive). */
    public List<Libro> buscarPorRangoAnio(int desde, int hasta) {
        return catalogo.stream()
                .filter(l -> l.getAnioPublicacion() >= desde
                          && l.getAnioPublicacion() <= hasta)
                .collect(Collectors.toList());
    }

    // ── Préstamo / devolución ─────────────────────────────────────────────────

    /** Marca un libro como prestado dado su ISBN. */
    public boolean prestarLibro(String isbn) {
        for (Libro l : catalogo) {
            if (l.getIsbn().equals(isbn)) {
                if (!l.isDisponible()) {
                    System.out.println("✘ El libro ya está prestado: " + l.getTitulo());
                    return false;
                }
                l.setDisponible(false);
                System.out.println("✔ Préstamo registrado: " + l.getTitulo());
                return true;
            }
        }
        System.out.println("✘ ISBN no encontrado: " + isbn);
        return false;
    }

    /** Devuelve un libro dado su ISBN. */
    public boolean devolverLibro(String isbn) {
        for (Libro l : catalogo) {
            if (l.getIsbn().equals(isbn)) {
                if (l.isDisponible()) {
                    System.out.println("✘ El libro no estaba prestado: " + l.getTitulo());
                    return false;
                }
                l.setDisponible(true);
                System.out.println("✔ Devolución registrada: " + l.getTitulo());
                return true;
            }
        }
        System.out.println("✘ ISBN no encontrado: " + isbn);
        return false;
    }

    // ── Utilidades ─────────────────────────────────────────────────────────────

    /** Imprime una lista de libros con encabezado. */
    public static void imprimirListaLibros(String titulo, List<Libro> lista) {
        System.out.println("\n── " + titulo + " ──");
        if (lista.isEmpty()) {
            System.out.println("  (Sin resultados)");
        } else {
            for (Libro l : lista) {
                System.out.println("  • " + l);
            }
        }
    }

    // ── Getters ────────────────────────────────────────────────────────────────

    public String getNombre() { return nombre; }
    public List<Libro> getCatalogo() { return catalogo; }
    public List<Categoria> getCategorias() { return categorias; }
}
