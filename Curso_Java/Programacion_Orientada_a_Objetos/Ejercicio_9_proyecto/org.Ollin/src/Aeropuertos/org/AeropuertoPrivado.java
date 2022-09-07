package Aeropuertos.org;

public class AeropuertoPrivado extends Aeropuerto{
	private String listaEmpresas[]=new String[10];
	private int numEmpresa;
	/**
	 * @param nombre
	 * @param ciudad
	 * @param pais
	 */
	public AeropuertoPrivado(String nombre, String ciudad, String pais) {
		super(nombre, ciudad, pais);
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param nombre
	 * @param ciudad
	 * @param pais
	 * @param c
	 */
	public AeropuertoPrivado(String nombre, String ciudad, String pais, Compañia[] c, String e[]) {
		super(nombre, ciudad, pais, c);
		this.listaEmpresas=e;
		numEmpresa=e.length;
	}
	
	public void insertarEmpresas(String e[]) {
		this.listaEmpresas=e;
		this.numEmpresa=e.length;
	}

	public void insertarEmpresa(String e) {
		this.listaEmpresas[numEmpresa]=e;
		this.numEmpresa++;
	}
	/**
	 * @return the listaEmpresas
	 */
	public String[] getListaEmpresas() {
		return listaEmpresas;
	}
	/**
	 * @return the numEmpresa
	 */
	public int getNumEmpresa() {
		return numEmpresa;
	}
	
	
}
