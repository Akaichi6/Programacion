package EJ8_ENTORNOS;

import java.util.List;

/**
 * Clase principal — demuestra el funcionamiento del sistema de biblioteca.
 */
public class Main {

    public static void main(String[] args) {

        separador("SISTEMA DE GESTIÓN DE BIBLIOTECA");

        // ── 1. Crear la biblioteca ─────────────────────────────────────────────
        Biblioteca biblio = new Biblioteca(
                "Biblioteca Central Cervantes",
                "Av. de la Constitución 12, Madrid");

        // ── 2. Registrar categorías ───────────────────────────────────────────
        separador("REGISTRO DE CATEGORÍAS");

        Categoria cienciaFiccion = new Categoria("CF", "Ciencia Ficción",
                "Novelas especulativas y futuristas");
        Categoria clasicos        = new Categoria("CL", "Clásicos",
                "Obras literarias de reconocido valor");
        Categoria programacion    = new Categoria("PR", "Programación",
                "Libros de informática y desarrollo");

        biblio.registrarCategoria(cienciaFiccion);
        biblio.registrarCategoria(clasicos);
        biblio.registrarCategoria(programacion);

        // ── 3. Registrar libros ───────────────────────────────────────────────
        separador("REGISTRO DE LIBROS");

        Libro l1 = new Libro("978-0-7432-7356-5", "Fundación",
                "Isaac Asimov", 1951, cienciaFiccion);
        Libro l2 = new Libro("978-0-441-17271-9", "Duna",
                "Frank Herbert", 1965, cienciaFiccion);
        Libro l3 = new Libro("978-0-7432-7357-2", "El Fin de la Eternidad",
                "Isaac Asimov", 1955, cienciaFiccion);
        Libro l4 = new Libro("978-0-14-028329-7", "Don Quijote de la Mancha",
                "Miguel de Cervantes", 1605, clasicos);
        Libro l5 = new Libro("978-0-14-310430-0", "Cien años de soledad",
                "Gabriel García Márquez", 1967, clasicos);
        Libro l6 = new Libro("978-0-13-468599-1", "Clean Code",
                "Robert C. Martin", 2008, programacion);
        Libro l7 = new Libro("978-0-201-63361-0", "Design Patterns",
                "Gang of Four", 1994, programacion);

        biblio.registrarLibro(l1);
        biblio.registrarLibro(l2);
        biblio.registrarLibro(l3);
        biblio.registrarLibro(l4);
        biblio.registrarLibro(l5);
        biblio.registrarLibro(l6);
        biblio.registrarLibro(l7);

        // ── 4. Mostrar información general ────────────────────────────────────
        separador("INFORMACIÓN GENERAL");
        biblio.mostrarInformacion();
        biblio.listarCategorias();
        biblio.listarLibros();

        // ── 5. Detalle de un libro individual ─────────────────────────────────
        separador("DETALLE DE UN LIBRO");
        l2.mostrarInformacion();

        // ── 6. Detalle de una categoría ───────────────────────────────────────
        separador("DETALLE DE CATEGORÍA: CIENCIA FICCIÓN");
        cienciaFiccion.mostrarInformacion();

        // ── 7. Búsqueda por título / autor ────────────────────────────────────
        separador("BÚSQUEDA: 'asimov'");
        List<Libro> resultAsimov = biblio.buscarPorTituloOAutor("asimov");
        Biblioteca.imprimirListaLibros("Resultados para 'asimov'", resultAsimov);

        separador("BÚSQUEDA: 'duna'");
        List<Libro> resultDuna = biblio.buscarPorTituloOAutor("duna");
        Biblioteca.imprimirListaLibros("Resultados para 'duna'", resultDuna);

        // ── 8. Búsqueda por categoría ─────────────────────────────────────────
        separador("BÚSQUEDA POR CATEGORÍA: Programación");
        List<Libro> librosProg = biblio.buscarPorCategoria("Programación");
        Biblioteca.imprimirListaLibros("Libros de Programación", librosProg);

        // ── 9. Préstamo y devolución ──────────────────────────────────────────
        separador("GESTIÓN DE PRÉSTAMOS");
        biblio.prestarLibro("978-0-7432-7356-5");   // Fundación → prestado
        biblio.prestarLibro("978-0-441-17271-9");   // Duna      → prestado
        biblio.prestarLibro("978-0-441-17271-9");   // Duna      → ya prestado

        // ── 10. Búsqueda de disponibles ───────────────────────────────────────
        separador("LIBROS DISPONIBLES TRAS PRÉSTAMOS");
        List<Libro> disponibles = biblio.buscarDisponibles();
        Biblioteca.imprimirListaLibros("Disponibles ahora", disponibles);

        // ── 11. Devolución ────────────────────────────────────────────────────
        separador("DEVOLUCIÓN");
        biblio.devolverLibro("978-0-7432-7356-5");  // Fundación → devuelto

        // ── 12. Búsqueda por rango de años ────────────────────────────────────
        separador("BÚSQUEDA POR RANGO DE AÑOS: 1950–1970");
        List<Libro> porAnio = biblio.buscarPorRangoAnio(1950, 1970);
        Biblioteca.imprimirListaLibros("Libros publicados entre 1950 y 1970", porAnio);

        separador("FIN DE LA DEMOSTRACIÓN");
    }

    // ── Utilidad de presentación ───────────────────────────────────────────────

    private static void separador(String titulo) {
        System.out.println("\n" + "=".repeat(52));
        System.out.println("  " + titulo);
        System.out.println("=".repeat(52));
    }
}
