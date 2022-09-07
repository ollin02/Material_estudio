package Aeropuertos.org;

public class Compañia {
	private String nombre;
	private Vuelo listaVuelos[]=new Vuelo[10];
	private int numVuelo=0;
	/**
	 * @param nombre
	 */
	public Compañia(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @param nombre
	 * @param listaVuelo
	 */
	public Compañia(String nombre, Vuelo v[]) {
		this.nombre = nombre;
		listaVuelos = v;
		numVuelo=v.length;
	}
	
	public void insertarVuelo(Vuelo vuelo) {
		listaVuelos[numVuelo]=vuelo;
		numVuelo++;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @return the numVuelo
	 */
	public int getNumVuelo() {
		return numVuelo;
	}
	
	public Vuelo getVuelo(int i) {
		return listaVuelos[i];
	}
	
	public Vuelo getVuelo(String id) {
		boolean encontrado =false;
		int i=0;
		Vuelo v =null;
		while((!encontrado)&&(i<listaVuelos.length)) {
			if(id.equals(listaVuelos[i].getIdentificador())) {
				encontrado=true;
				v=listaVuelos[i];
			}
			i++;
		}
		return v;
	}
	
	
}
