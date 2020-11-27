package vehiculos;

public interface Arrancable {

	void arrancar();
	
	
	
	default void parar() {
	}
}
