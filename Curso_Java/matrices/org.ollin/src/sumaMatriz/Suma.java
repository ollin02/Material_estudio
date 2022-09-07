package sumaMatriz;

import java.util.Scanner;

public class Suma {
	public static void main(String [] args) {
		Scanner entrada= new Scanner(System.in);
		int M[][],N[][],mFilas=3,mCol=3,nFilas=3,nCol=3;
		
		M=new int[mFilas][mCol];
		N=new int[nFilas][nCol];
		
		System.out.println("Digite los elementos de la matriz 1: ");
		for (int i=0;i<mFilas;i++) {
			for(int j=0;j<mCol;j++) {
				System.out.print("Matriz 1 ["+i+"]["+j+"]: ");
				M[i][j]=entrada.nextInt();
			}
		}
		System.out.println("");
		
		System.out.println("Digite los elemtos de la matriz 2: ");
		for(int i=0;i<nFilas;i++) {
			for(int j=0;j<nCol;j++) {
				System.out.print("Matriz 2 ["+i+"]["+j+"]: ");
				N[i][j]=entrada.nextInt();
			}
		}
		
		System.out.println("El resultado de la suma de Matrices es: ");
		for(int i=0;i<nFilas;i++) {
			for(int j=0;j<nCol;j++){
				N[i][j]=N[i][j]+M[i][j];
				System.out.print(N[i][j]+ " ");
			}
			System.out.println("");
		}
	
	}

}
