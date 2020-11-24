package vehiculos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Ejemplo {

	public static void main(String[] args) {
		
		String colorPorDefecto = "Rojo";
		Vehiculo miCoche = new Coche("Verde");//.modelo("Mercedes Benz");;
		Vehiculo miCoche2 = new Coche("Azul");
		miCoche.setModelo("Ford Fiesta");
		miCoche.setColor(colorPorDefecto);
		
		
//		miCoche.setColor(colorPorDefecto);
		System.out.println(miCoche);
		
//		miCoche2 = Coche.crearConModelo("Seat Ibiza");
		
		miCoche = miCoche2;
		miCoche2.setModelo("Opel Astra");
		miCoche2.setColor("Azul");
		
//		miCoche2.color = colorPorDefecto;
		
		System.out.println(miCoche);
		System.out.println(miCoche2);
		
		
		System.out.println(new Moto("Honda", "CB-125F"));
		Moto xADVMoto = new Moto("honda", "X-adv");
		System.out.println(xADVMoto);
		
		String matricula = "1234ABC";
		Coche coche = new Coche("Ford Fiesta", "Rojo"); // ¿por que no usar variable Vehiculo?
		coche.setMatricula(matricula);
		Vehiculo moto = new Moto("Suzuki", "Verde");
		
		Collection<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
		vehiculos.add(coche);
		vehiculos.add(moto);
		
//		vehiculos = Arrays.asList(coche, moto);
		
		System.out.println(vehiculos);
		//forma compacta
		vehiculos.forEach(System.out::println);
		
//		String[] arrayDeStrings = new String[] {"pepe", "Paco"};
//		System.out.println(Arrays.toString(arrayDeStrings));
		
		
	}

}
