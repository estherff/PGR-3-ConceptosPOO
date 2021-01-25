package gal.teis.pgr.constructor;

public class Libro1 {

        //Propiedades
	private String titulo;
        private String categoría;
        private int paginas;
        private String autor;
        
	private int totalPaginas;
	private int paginaActual;
        
	
	//Setter y getter
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getTotalPaginas() {
		return totalPaginas;
	}
	
	public int getPaginaActual() {
		return paginaActual;
	}
	
	//Métodos
        public void avanzarPagina() {
		paginaActual++;
	}
	public void avanzarCapitulo() {		
		paginaActual += 20;
	}
}
