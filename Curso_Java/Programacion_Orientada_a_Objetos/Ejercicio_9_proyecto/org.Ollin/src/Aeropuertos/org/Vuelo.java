package Aeropuertos.org;

public class Vuelo {
	private String identificador;
	private String ciudadOrigen;
	private String ciudadDestino;
	private double precio;
	private int numMaxPasajeros;
	private int numActualPasajero;
	private Pasajero listaPasajeros[];
	/**
	 * @param identificador
	 * @param ciudadOrigen
	 * @param ciudadDestino
	 * @param precio
	 * @param numMaxPasajeros
	 * @param numActualPasajero
	 * @param listaPasajeros
	 */
	public Vuelo(String identificador, String ciudadOrigen, String ciudadDestino, double precio, int numMaxPasajeros) {
		super();
		this.identificador = identificador;
		this.ciudadOrigen = ciudadOrigen;
		this.ciudadDestino = ciudadDestino;
		this.precio = precio;
		this.numMaxPasajeros = numMaxPasajeros;
		this.numActualPasajero = 0;
		this.listaPasajeros = new Pasajero[numMaxPasajeros];
	}
	
	public void insertarPasajero(Pasajero pasajero) {
		listaPasajeros[numActualPasajero]=pasajero;
		numActualPasajero++;
	}
	
	/**
	 * @return the identificador
	 */
	public String getIdentificador() {
		return identificador;
	}
	/**
	 * @return the ciudadOrigen
	 */
	public String getCiudadOrigen() {
		return ciudadOrigen;
	}
	/**
	 * @return the ciudadDestino
	 */
	public String getCiudadDestino() {
		return ciudadDestino;
	}
	/**
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}
	/**
	 * @return the numMaxPasajeros
	 */
	public int getNumMaxPasajeros() {
		return numMaxPasajeros;
	}
	/**
	 * @return the numActualPasajero
	 */
	public int getNumActualPasajero() {
		return numActualPasajero;
	}

	public Pasajero getPasajero(int i) {
		return listaPasajeros[i];
	}
	
	public Pasajero getPasaporte(String pasaporte) {
		boolean encontrado=false;
		int i=0;
		Pasajero pas=null;
		while((!encontrado)&&(i<listaPasajeros.length)) {
			if(pasaporte.equals(listaPasajeros[i].getPasaporte())) {
				encontrado = true;
				pas=listaPasajeros[i];
				
			}
			i++;
		}
		return pas;
	
	}
	
}
