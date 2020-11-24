package vehiculos;

public abstract class VehiculoConRuedas extends Vehiculo {

	public VehiculoConRuedas() {
		super();
	}

	public VehiculoConRuedas(String modelo, String color) {
		super(modelo, color);
	}
	
	public abstract int getNumeroDeRuedas();
	
	@Override
	public String toString() {
		return super.toString() + ", " +
								+ getNumeroDeRuedas() + " ruedas";
		
	}
	
	void arrancar() {
		System.out.println("brum burmrmmm brummmm");
	}
}