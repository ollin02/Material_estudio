package Aeropuertos.org;

public class Aeropuerto {
	private String nombre;
	private String ciudad;
	private String pais;
	private Compañia listaCompañias[] = new Compañia[10];
	private int numCompañia;
	/**
	 * @param nombre
	 * @param ciudad
	 * @param pais
	 */
	public Aeropuerto(String nombre, String ciudad, String pais) {
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.pais = pais;
		this.numCompañia=0;
	}
	
	public Aeropuerto(String nombre, String ciudad, String pais, Compañia c[]) {
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.pais = pais;
		listaCompañias=c;
		this.numCompañia=c.length;
	}
	
	public void insertarCompañia(Compañia compañia) {
		listaCompañias[numCompañia]=compañia;
		numCompañia++;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @return the ciudad
	 */
	public String getCiudad() {
		return ciudad;
	}

	/**
	 * @return the pais
	 */
	public String getPais() {
		return pais;
	}

	/**
	 * @return the listaCompañias
	 */
	public Compañia[] getListaCompañias() {
		return listaCompañias;
	}

	/**
	 * @return the numCompañia
	 */
	public int getNumCompañia() {
		return numCompañia;
	}
	
	public Compañia getCompañia(int i) {
		return listaCompañias[i];
	}
	
	public Compañia getCompañia(String nombre) {
		boolean encontrado =false;
		int i=0;
		Compañia c =null;
		while((!encontrado)&&(i<listaCompañias.length)) {
			if(nombre.equals(listaCompañias[i].getNombre())) {
				encontrado=true;
				c=listaCompañias[i];
			}
			i++;
		}
		return c;
	}
	
	
}
