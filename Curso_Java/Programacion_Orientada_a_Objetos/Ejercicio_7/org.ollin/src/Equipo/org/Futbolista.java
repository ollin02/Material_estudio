package Equipo.org;

public class Futbolista extends Persona {
	private int dorsal;
	private String posicion;


	/**
	 * @param nombre
	 * @param apellido
	 * @param edad
	 * @param dorsal
	 * @param posicion
	 */
	public Futbolista(String nombre, String apellido, int edad, int dorsal, String posicion) {
		super(nombre, apellido, edad);
		this.dorsal = dorsal;
		this.posicion = posicion;
	}
	/**
	 * @return the dorsal
	 */
	public int getDorsal() {
		return dorsal;
	}
	/**
	 * @return the posicion
	 */
	public String getPosicion() {
		return posicion;
	}
	
	@Override
	public void entrenamiento() {
		System.out.println("Entrena");
	}
	
	@Override
	public void partidoFutbol() {
		System.out.println("Juega el partrido de Futbol");
	}
	
	public void entrevias() {
		System.out.println("Da entrevista");
	}
}
