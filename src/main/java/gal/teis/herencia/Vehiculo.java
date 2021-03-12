package gal.teis.herencia;

public abstract class Vehiculo {

	
	private String marca;

	// todas las clases hijas lo deben implementar
	// salvo que ellas sean tambien abstractas
	public abstract void acelerar();
	
	
	
	public Vehiculo(String marca) {
		super();
		this.marca = marca;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}



	public void pagarImpuesto() {
	
		System.out.println("impuesto pagado");
	}
	
	
}
