package Equipo.org;

public abstract class Persona {
	protected String nombre;
	protected String apellido;
	protected int edad;
	
	/**
	 * @param nombre
	 * @param apellido
	 * @param edad
	 */
	public Persona(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}
	
	public void viajar() {
		System.out.println("Se va de viaje");
	}
	
	public abstract void entrenamiento(); 
	
	public abstract void partidoFutbol();
	
	
}
