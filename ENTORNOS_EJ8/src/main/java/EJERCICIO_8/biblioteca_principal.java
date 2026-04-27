package EJERCICIO_8;

import java.util.List;

public class biblioteca_principal {
    public static void main(String[] args) {
        // categorías
        categoria cienciaFiccion = new categoria("CF", "Ciencia Ficción", "Novelas futuristas");
        categoria clasicos       = new categoria("CL", "Clásicos",        "Literatura universal");
        categoria programacion   = new categoria("PR", "Programación",    "Informática y desarrollo");
        // biblioteca
        biblioteca biblio = new biblioteca("Biblioteca Central", "Calle Mayor 1");

        // 3. Registrar categorías
        biblio.registrarCategoria(cienciaFiccion);
        biblio.registrarCategoria(clasicos);
        biblio.registrarCategoria(programacion);
        // 4. Crear y registrar libros
        biblio.registrarLibro(new libro("001", "Duna",         "Frank Herbert",       1965, cienciaFiccion));
        biblio.registrarLibro(new libro("002", "Fundación",    "Isaac Asimov",        1951, cienciaFiccion));
        biblio.registrarLibro(new libro("003", "Don Quijote",  "Miguel de Cervantes", 1605, clasicos));
        biblio.registrarLibro(new libro("004", "Clean Code",   "Robert C. Martin",    2008, programacion));
        biblio.registrarLibro(new libro("005", "Design Patterns", "Gang of Four",     1994, programacion));

        // 5. Mostrar estado general
        System.out.println("\n=== INFORMACIÓN GENERAL ===");
        biblio.mostrarInformacion();

        // 6. Listar
        System.out.println("\n=== CATÁLOGO ===");
        biblio.listarLibros();

        System.out.println("\n=== CATEGORÍAS ===");
        biblio.listarCategorias();

        // 7. Búsquedas
        System.out.println("\n=== BUSCAR: 'asimov' ===");
        List<libro> encontrados = biblio.buscarPorTitulo("asimov");
        for (libro l : encontrados) {
            l.mostrarInformacion();
        }

        System.out.println("\n=== LIBROS DE PROGRAMACIÓN ===");
        List<libro> prog = biblio.buscarPorCategoria("Programación");
        for (libro l : prog) {
            System.out.println("  • " + l.getTitulo());
        }
    }
}
