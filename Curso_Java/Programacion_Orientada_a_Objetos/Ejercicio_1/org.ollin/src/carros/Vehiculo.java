package carros;

public class Vehiculo {
	private String marca;
	private String modelo;
	private float precio;
	
	
	public Vehiculo(String marca, String modelo, Float precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
	}


	public Float getPrecio() {
		return precio;
	}


	public String mostraraDatos() {
		return "Marca: "+marca+ "\nModelo: "+ modelo+"\nPrecio: $"+precio+"\n";
	}
}
