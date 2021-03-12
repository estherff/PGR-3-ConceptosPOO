package gal.teis.herencia;

public class Principal {

	public static void main(String[] args) {
		
		Vehiculo m = new Moto("ducati");
		Coche c = new Coche("toyota");
		Camion cm = new Camion("Scania");
		
		c.pagarImpuesto();
		acelerarVehiculo(cm);
		System.out.println(m.getMarca());

	}
	// el programador que desarrolla este c�digo 
	// no necesita conocer la jerarquia de clases
	public static void acelerarVehiculo(Vehiculo v) {
		
		v.acelerar();
	}

}
