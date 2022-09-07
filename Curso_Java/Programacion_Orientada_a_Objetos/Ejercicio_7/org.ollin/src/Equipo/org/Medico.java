package Equipo.org;

public class Medico extends Persona{

		private String titulacion;
		private int añosEsperencia;
		/**
		 * @param nombre
		 * @param apellido
		 * @param edad
		 * @param titulo
		 * @param añosEsperencia
		 */
		public Medico(String nombre, String apellido, int edad, String titulacion, int añosEsperencia) {
			super(nombre, apellido, edad);
			this.titulacion = titulacion;
			this.añosEsperencia = añosEsperencia;
		}
		/**
		 * @return the titulo
		 */
		public String getTitulo() {
			return titulacion;
		}
		/**
		 * @return the añosEsperencia
		 */
		public int getAñosEsperencia() {
			return añosEsperencia;
		}
		
		@Override
		public void entrenamiento() {
			System.out.println("Da asistencia en el entrenamiento");
		}
		
		@Override
		public void partidoFutbol() {
			System.out.println("Da asistencia en un partido de Futbol");
		}
		
		public void curaLecio() {
			System.out.println("Cura leciones");
		}

}
