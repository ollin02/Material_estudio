package Carrera;

public class Atleta {
	private int numeroAtleta;
	private String nombre;
	private float tiempoCarrera;
	
	public Atleta(int nuemroAtleta, String nombre, float tiempoCarrera) {
		this.numeroAtleta = nuemroAtleta;
		this.nombre= nombre;
		this.tiempoCarrera = tiempoCarrera;
	}
	
	
	public Float getTiempoCarrera() {
		return tiempoCarrera;
	}
	
	public String mostrarDatos() {
		return "Numero de atleta: "+numeroAtleta+"\nNombre: "+nombre+"\nTiempo de carerra: "+tiempoCarrera+"\n";
	}
	
	

}
