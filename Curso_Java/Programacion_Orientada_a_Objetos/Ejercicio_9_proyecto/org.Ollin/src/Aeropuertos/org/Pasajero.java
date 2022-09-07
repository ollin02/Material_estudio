package Aeropuertos.org;

public class Pasajero {
	private String nombre;
	private String pasaporte;
	private String nacionalidad;
	/**
	 * @param nombre
	 * @param pasaporte
	 * @param nacionalidad
	 */
	public Pasajero(String nombre, String pasaporte, String nacionalidad) {
		this.nombre = nombre;
		this.pasaporte = pasaporte;
		this.nacionalidad = nacionalidad;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @return the pasaporte
	 */
	public String getPasaporte() {
		return pasaporte;
	}
	/**
	 * @return the nacionalidad
	 */
	public String getNacionalidad() {
		return nacionalidad;
	}
	
	
	
	
}
