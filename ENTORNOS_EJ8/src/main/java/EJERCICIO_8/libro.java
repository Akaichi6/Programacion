package EJERCICIO_8;

public class libro {
    private String isbn;
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private boolean disponible;
    private categoria categoria;

    public libro(String isbn, String titulo, String autor, int anioPublicacion, categoria categoria) {
        if (titulo == null || titulo.isEmpty()) {
            throw new IllegalArgumentException("El campo titulo es obligatorio");
        }
        if (autor == null || autor.isEmpty()) {
            throw new IllegalArgumentException("El campo autor es obligatorio");
        }
        if (isbn == null || isbn.isEmpty()) {
            throw new IllegalArgumentException("El campo isbn es obligatorio");
        }

        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.disponible = true;
        this.categoria = categoria;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(categoria categoria) {
        this.categoria = categoria;
    }

    //metodos
    public void mostrarInformacion (){
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de Publicación: " + anioPublicacion);
        System.out.println("Categoria: " + categoria.getNombre());
        System.out.println("Disponible: " + disponible);
        System.out.println("ISBN: " + sacarIsbn());
    }
    public String sacarIsbn() {
        long num_isbn = 1234567891011L;
        num_isbn ++;
        isbn = String.valueOf(num_isbn);
        return isbn;
    }
    public void estaDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
