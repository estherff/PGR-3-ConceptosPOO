package gal.teis.pgr.constructor;

public class Libro {

    //Propiedades
    private String titulo;
    private int paginas;
    private String autor;

    private int totalPaginas;
    private int paginaActual;

    //Setter y getter
    public String getTitulo() {
        return titulo;
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }

    public int getPaginaActual() {
        return paginaActual;
    }

    public String getAutor() {
        return autor;
    }

    /*No hay get para páginaActual, esta propiedad se maneja mediante un 
        método específico: avanzarPagina() y avanzarCapitulo()*/

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    //Métodos
    public void avanzarPagina() {
        paginaActual++;
    }

    public void avanzarCapitulo() {
        paginaActual += 20;
    }
}
