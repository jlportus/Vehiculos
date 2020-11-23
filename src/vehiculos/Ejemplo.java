package vehiculos;

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
	}

}
