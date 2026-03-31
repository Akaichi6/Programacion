package EJ8_ENTORNOS;

/**
 * Clase que representa un libro en el sistema de biblioteca.
 */
public class Libro {

    private String isbn;
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private boolean disponible;
    private Categoria categoria;

    public Libro(String isbn, String titulo, String autor, int anioPublicacion, Categoria categoria) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.categoria = categoria;
        this.disponible = true;
    }

    // ── Getters y Setters ──────────────────────────────────────────────────────

    public String getIsbn() { return isbn; }
    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public int getAnioPublicacion() { return anioPublicacion; }
    public boolean isDisponible() { return disponible; }
    public Categoria getCategoria() { return categoria; }

    public void setDisponible(boolean disponible) { this.disponible = disponible; }

    // ── Métodos ────────────────────────────────────────────────────────────────

    /** Muestra los detalles completos del libro. */
    public void mostrarInformacion() {
        System.out.println("┌─────────────────────────────────────────────┐");
        System.out.printf("│  ISBN      : %-30s │%n", isbn);
        System.out.printf("│  Título    : %-30s │%n", titulo);
        System.out.printf("│  Autor     : %-30s │%n", autor);
        System.out.printf("│  Año       : %-30d │%n", anioPublicacion);
        System.out.printf("│  Categoría : %-30s │%n", categoria.getNombre());
        System.out.printf("│  Estado    : %-30s │%n", disponible ? "Disponible" : "Prestado");
        System.out.println("└─────────────────────────────────────────────┘");
    }

    @Override
    public String toString() {
        return String.format("[%s] %s — %s (%d) | %s",
                isbn, titulo, autor, anioPublicacion,
                disponible ? "Disponible" : "Prestado");
    }
}
