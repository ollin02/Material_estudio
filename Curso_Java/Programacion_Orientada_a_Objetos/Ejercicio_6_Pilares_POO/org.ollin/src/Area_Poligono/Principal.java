package Area_Poligono;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	static ArrayList<Poligono> poligono=new ArrayList<Poligono>();
	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		//Llenas un poligono
		llenarPoligono();
		
		//mostrar los datos y calcular el area
		mostrarResultados();
	}
	
	public static void llenarPoligono() {
		int opcion;
		char respuesta;
		
		do {
			do {
				System.out.println("Dijite que poligono desea");
				System.out.println("1.-Triangulo");
				System.out.println("2.-Rectangulo");
				System.out.print("Opcion: ");
				opcion=entrada.nextInt();
			}while(opcion<1 || opcion>2);
			
			switch(opcion) {
				case 1: llenarTriangulo();
					break;
				case 2:	llenarRectangulo();
					break;
			}
			
			System.out.print("Desea introducir otro poligono(s/n): ");
			respuesta=entrada.next().charAt(0);
			System.out.println("");
		}while(respuesta=='s' || respuesta=='S');
	}
	
	public static void llenarTriangulo() {
		double lado1,lado2,lado3;
		
		System.out.print("\nDigite el lado 1 del tiangulo: ");
		lado1=entrada.nextDouble();
		System.out.print("\nDigite el lado 2 del tiangulo: ");
		lado2=entrada.nextDouble();
		System.out.print("\nDigite el lado 3 del tiangulo: ");
		lado3=entrada.nextDouble();
		
		Triangulo triangulo = new Triangulo(lado1, lado2, lado3);
		
		//Guadamos el triangulo dentro de nuestro arreglo de poligonos
		poligono.add(triangulo);
	}
	
	public static void llenarRectangulo() {
		double lado1,lado2;
		
		System.out.print("\nDigite el lado 1 del tiangulo: ");
		lado1=entrada.nextDouble();
		System.out.print("\nDigite el lado 2 del tiangulo: ");
		lado2=entrada.nextDouble();
				
		Rectangulo rectangulo = new Rectangulo(lado1, lado2);
		
		//Guadamos el rectangulo dentro de nuestro arreglo de poligonos
		poligono.add(rectangulo);
	}
	
	public static void mostrarResultados() {
		for(Poligono poli: poligono) {
			System.out.println(poli.toString());
			System.out.println("Area= "+poli.area());
			System.out.println("");
		}
	}
}
