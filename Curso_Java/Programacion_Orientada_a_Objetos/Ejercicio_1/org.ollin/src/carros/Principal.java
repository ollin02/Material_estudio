package carros;

import java.util.Scanner;

public class Principal {
	public static int contadorCocheMBarato(Vehiculo coches[]) {
		float precio;
		int indice =0;
		
		precio=coches[0].getPrecio();
		for(int i=0;i<coches.length;i++) {
			if(coches[i].getPrecio()<precio) {
				indice=i;
			}
		}
		return indice;
	}
	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		String marca, modelo;
		float precio;
		int numeroVehiculos, indiceBarato;
		
		System.out.print("Dijite la cantidad de Vehiculos: ");
		numeroVehiculos=entrada.nextInt();
		
		//Creamos los objetos para los coches
		Vehiculo coches[]=new Vehiculo[numeroVehiculos];
		
		for(int i=0; i<coches.length; i++) {
			entrada.nextLine();
			System.out.println("\nDigite las caracteristecas del Coche numero " +(i+1));
			System.out.print("Digite la Marca: ");
			marca=entrada.nextLine();
			System.out.print("Digite el Modelo: ");
			modelo=entrada.nextLine();
			System.out.print("Introduzca el precio: ");
			precio=entrada.nextFloat();
			
			coches[i]=new Vehiculo(marca,modelo,precio);
		}
		
		indiceBarato=contadorCocheMBarato(coches);
		System.out.println("\nEl coche mas varato es");
		System.out.println(coches[indiceBarato].mostraraDatos()+"\n");
		

	}

}
