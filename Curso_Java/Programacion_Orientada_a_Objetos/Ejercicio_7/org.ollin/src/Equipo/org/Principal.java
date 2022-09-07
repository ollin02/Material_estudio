package Equipo.org;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	static ArrayList<Persona>persona= new ArrayList<Persona>();
	static Scanner entrada=new Scanner(System.in);
	
	static Persona futbolista1 = new Futbolista("Higuain", "Gonzalo", 29, 9,"Delantero");
	static Persona futbolista2 = new Futbolista("Paulo", "Dibala", 23, 21, "Delantero");
	static Persona entrenador = new Entrenador("Maximiliano", "Allegri", 49, "Defensiva");
	static Persona medico =new Medico("Alex", "Apellido", 55, "Licenciado en Fisioterapia", 20);
	
	
	
	public static void main(String[] args) {
		persona.add(futbolista1);
		persona.add(futbolista2);
		persona.add(entrenador);
		persona.add(medico);
		
		menu();

	}
	
	public static void menu() {
		int opcion;
		do {
			System.out.println("\t.:Menu:.");
			System.out.println("1. Viaje de equipo");
			System.out.println("2. Entrenamiento");
			System.out.println("3. Partido de Futbol");
			System.out.println("4. Planificar entrenamiento");
			System.out.println("5. Entrevista");
			System.out.println("6. Curar lesion");
			System.out.println("7. Salir");
			System.out.print("Opcion:");
			opcion=entrada.nextInt();
			
			switch(opcion) {
				case 1: System.out.println(""); 
					viajarEquipo();
					break;
				case 2:System.out.println(""); 
					entrenarEquipo();
					break;
				case 3: System.out.println(""); 
					partidoFutbol();
					break;
				case 4: System.out.println("");
					planificarEntrenamiento();
					break;
				case 5:
					System.out.println("");
					DarEntrevista();
					break;
				case 6:
					System.out.println("");
					curarLecion();
					break;
				case 7: break;
				default: System.out.println("Error, Se equivoco de opcion de menu");
			}
			
			
		}while(opcion !=7);
	}
	
	public static void viajarEquipo() {
		for(Persona equipo: persona) {
			System.out.print(equipo.getNombre()+" "+ equipo.getApellido()+ "->");
			equipo.viajar();
		}
	}
	
	public static void entrenarEquipo() {
		for(Persona equipo: persona) {
			System.out.print(equipo.getNombre()+" "+equipo.getApellido()+ "->");
			equipo.entrenamiento();
		}
	}
	
	public static void partidoFutbol() {
		for(Persona equipo: persona) {
			System.out.print(equipo.getNombre()+" "+equipo.getApellido()+ "->");
			equipo.partidoFutbol();
		}
	}
	
	public static void planificarEntrenamiento() {
		System.out.print(entrenador.getNombre()+" "+entrenador.getApellido()+ "->");
		((Entrenador)entrenador).planificarEntrenamiento();
	}
	
	public static void DarEntrevista() {
		System.out.print(futbolista1.getNombre()+" "+futbolista1.getApellido()+ "->");
		((Futbolista)futbolista1).entrevias();
		System.out.print(futbolista2.getNombre()+" "+futbolista2.getApellido()+ "->");
		((Futbolista)futbolista2).entrevias();
	}
	
	public static void curarLecion() {
		System.out.print(medico.getNombre()+" "+medico.getApellido()+ "->");
		((Medico)medico).curaLecio();
	
	}
}
