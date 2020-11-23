package vehiculos;

public class Moto extends VehiculoConRuedas{

	@Override
	public int getNumeroDeRuedas() {
		return 2;
	}

	public Moto() {
		super();
	}

	public Moto(String modelo, String color) {
		super(modelo, color);
	}

	@Override
	public String toString() {
		return "Moto: " + super.toString();
	}
	
	

}
