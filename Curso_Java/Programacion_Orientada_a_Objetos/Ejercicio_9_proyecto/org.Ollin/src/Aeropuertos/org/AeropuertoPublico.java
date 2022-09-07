package Aeropuertos.org;

public class AeropuertoPublico extends Aeropuerto{
	private double subvencion;

	/**
	 * @param nombre
	 * @param ciudad
	 * @param pais
	 */
	public AeropuertoPublico(String nombre, String ciudad, String pais) {
		super(nombre, ciudad, pais);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param nombre
	 * @param ciudad
	 * @param pais
	 * @param c
	 */
	public AeropuertoPublico(String nombre, String ciudad, String pais, Compañia[] c, double subvencion) {
		super(nombre, ciudad, pais, c);
		this.subvencion=subvencion;
	}
	
	public AeropuertoPublico(String nombre, String ciudad, String pais, double subvencion) {
		super(nombre, ciudad, pais);
		this.subvencion=subvencion;
	}

	/**
	 * @return the subvencion
	 */
	public double getSubvencion() {
		return subvencion;
	}
	
	
	
}
