package Equipo.org;

public class Entrenador extends Persona {
	private String estrategia;

	/**
	 * @param nombre
	 * @param apellido
	 * @param edad
	 * @param estrategia
	 */
	public Entrenador(String nombre, String apellido, int edad, String estrategia) {
		super(nombre, apellido, edad);
		this.estrategia = estrategia;
	}

	/**
	 * @return the estrategia
	 */
	public String getEstrategia() {
		return estrategia;
	}
	
	public void planificarEntrenamiento() {
		System.out.println("Planifica las jugadas");
	}
	
	@Override
	public void entrenamiento() {
		System.out.println("Dirige un entrenamiento");
	}
	
	@Override
	public void partidoFutbol() {
		System.out.println("Direge un partido");
	}

}
