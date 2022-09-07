package Triangulo;

import java.util.Scanner;

public class Principal {
	public static double mayorArea(Triangulo_Isosceles triangulo[]) {
		double area;
		int indice=0;
		
		area=triangulo[indice].ObArea();
		for(int i=0;i<triangulo.length; i++) {
			if(triangulo[i].ObArea()>area) {
				area=triangulo[i].ObArea();
			}
		}
		return area;
	}

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		double base,lado;
		int nTriangulos;
		
		System.out.print("Digite el numero de triangulos a ingresar: ");
		nTriangulos=entrada.nextInt();
		
		Triangulo_Isosceles triangulo[]= new Triangulo_Isosceles[nTriangulos];
		
		for(int i=0;i<triangulo.length;i++) {
			entrada.nextLine();
			System.out.println("\nDijite las caracteristicas del tinagulo "+(i+1));
			System.out.print("Dijite el lado del Triangulo: ");
			lado=entrada.nextDouble();
			System.out.print("Dijite la base del Triangulo: ");
			base=entrada.nextDouble();
			
			triangulo[i]=new Triangulo_Isosceles(base, lado);
			
			System.out.println("\nEl perimetro del triangulo es: "+triangulo[i].ObPerimetro());
			System.out.println("El Area del Triangulo es: "+triangulo[i].ObArea());
		}
		System.out.println("\nEL area mayor es: "+mayorArea(triangulo));
	}

}
