package ejercicio7;

public class Libro {
    private String ISBN;
    private String titulo;
    private String autor;
    private int añoPublicacion;
    private String editorial;
    private int numeroPaginas;
    private String[] categorias;

    public Libro(String ISBN, String titulo, String autor, int añoPublicacion, String editorial, int numeroPaginas, String[] categorias) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
        this.editorial = editorial;
        this.numeroPaginas = numeroPaginas;
        this.categorias = categorias;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
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

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public String[] getCategorias() {
        return categorias;
    }

    public void setCategorias(String[] categorias) {
        this.categorias = categorias;
    }

    @Override
    public String toString() {
        return "Libro [ISBN=" + ISBN + ", Título=" + titulo + ", Autor=" + autor +
                ", Año de publicación=" + añoPublicacion + ", Editorial=" + editorial +
                ", Número de páginas=" + numeroPaginas + ", Categorías=" + String.join(", ", categorias) + "]";
    }
}

