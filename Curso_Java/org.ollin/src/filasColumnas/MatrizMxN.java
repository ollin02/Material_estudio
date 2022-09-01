package filasColumnas;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class MatrizMxN {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int M[][],nFilas,nCol,sumaF[],sumaC[];
		
		nFilas=Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de filas: "));
		nCol=Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de Columnas: "));
		
		M=new int [nFilas][nCol];
		sumaF=new int [nFilas];
		sumaC=new int [nCol];
		System.out.println("Digite los valores de la Matriz");
		for(int i=0;i<nFilas;i++) {
			for(int j=0;j<nCol;j++) {
				System.out.print("Matriz ["+i+"]["+j+"]: ");
				M[i][j]=entrada.nextInt();
			}
		}
		
		System.out.println("Matriz que introdujo es: ");
		for(int i=0;i<nFilas;i++) {
			for(int j=0;j<nCol;j++) {
				System.out.print(M[i][j]+" ");
			}
			System.out.println("");
		}
		
		System.out.println("la suma de cada fila es: ");
		for(int i=0;i<nFilas;i++) {
			for(int j=0;j<nCol;j++) {
				sumaF[i]+=M[i][j];
				
			}
			System.out.print(sumaF[i]);
			System.out.println("");
		}
		
		System.out.println("la suma de cada columna es: ");
		for(int i=0;i<nCol;i++) {
			for(int j=0;j<nFilas;j++) {
				sumaC[i]+=M[j][i];
				
			}
			System.out.print(sumaC[i]+" ");
			
		}
	}

}
