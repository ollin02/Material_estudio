package Carrera;

import java.util.Scanner;

public class Princioal {
	public static int indiceMenorTiempo(Atleta corredor[]) {
		float tiempo;
		int indice=0;
		
		tiempo=corredor[indice].getTiempoCarrera();
		for(int i=0; i<corredor.length;i++) {
			if(corredor[i].getTiempoCarrera()<tiempo) {
				tiempo=corredor[i].getTiempoCarrera();
				indice=i;
			}
		}
		
		return indice;
	}

	public static void main(String[] args) {	
		Scanner entrada = new Scanner(System.in);
		String nombre;
		float tiempoCarrera;
		int numeroAtleta,nAtletas,indiceGanador;
		
		System.out.print("Dijite el numero de participantes: ");
		nAtletas=entrada.nextInt();
		
		Atleta corredor[]=new Atleta[nAtletas];
		
		for(int i=0;i<corredor.length;i++) {
			entrada.nextLine();
			System.out.println("\nDijite las caracteristeicas de el Corredor "+(i+1));
			System.out.print("Dijite el nombre del corredor: ");
			nombre=entrada.nextLine();
			System.out.print("Dijite el numero de corredor: ");
			numeroAtleta=entrada.nextInt();
			System.out.print("Dijite el tiempo hecho en la carrera: ");
			tiempoCarrera=entrada.nextFloat();
			
			corredor[i]=new Atleta(numeroAtleta,nombre,tiempoCarrera);
		}
		
		indiceGanador=indiceMenorTiempo(corredor);
		System.out.println(".:El corredor ganador:.");
		System.out.println(corredor[indiceGanador].mostrarDatos()+"\n");
	}

}
