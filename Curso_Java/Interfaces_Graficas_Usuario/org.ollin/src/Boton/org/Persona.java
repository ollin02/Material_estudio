package Boton.org;

public class Persona {
	private String nombre;
	private int Edad;
	private String nacionalidad;
	
	/**
	 * @param nombre
	 * @param edad
	 * @param nacionalidad
	 */
	public Persona(String nombre, int edad, String nacionalidad) {
		super();
		this.nombre = nombre;
		Edad = edad;
		this.nacionalidad = nacionalidad;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the edad
	 */
	public int getEdad() {
		return Edad;
	}

	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		Edad = edad;
	}

	/**
	 * @return the nacionalidad
	 */
	public String getNacionalidad() {
		return nacionalidad;
	}

	/**
	 * @param nacionalidad the nacionalidad to set
	 */
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	@Override
	public String toString() {
		return this.nombre;
	}
	
}
