package transpuesta;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class MatrizTranspuesta {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int N[][],nFilas,nCol,M[][];
		
		nFilas=Integer.parseInt(JOptionPane.showInputDialog("Digite el número de filas: "));
		nCol=Integer.parseInt(JOptionPane.showInputDialog("Digite el número de columnas: "));
		
		N=new int [nFilas][nCol];
		M=new int [nCol][nFilas];
		
		System.out.println("Dijite los elementos de  la matriz: ");
		for(int i=0;i<nFilas;i++) {
			for(int j=0;j<nCol;j++) {
				System.out.print("Matriz ["+i+"]["+j+"]: ");
				N[i][j]=entrada.nextInt();
			}
		}
		
		System.out.println("La matriz original es: ");
		for(int i=0;i<nFilas;i++) {
			for(int j=0;j<nCol;j++) {
				System.out.print(N[i][j]+" ");;
			}
			System.out.println("");
		}
		
	//Se transpone la matriz
//		int aux;
//		for(int i=0;i<nFilas;i++) {
//			for(int j=0;j<i;j++) {
//				aux=N[i][j];
//				N[i][j]=N[j][i];
//				N[j][i]=aux;	
//			}
//		}
		
		for(int i=0;i<nFilas;i++) {
			for(int j=0;j<nCol;j++) {
				M[j][i]=N[i][j];
			}
		}
		
		System.out.println("La matriz transpuesta es: ");
		for(int i=0;i<nCol;i++) {
			for(int j=0;j<nFilas;j++) {
				System.out.print(M[i][j]+" ");
			}
			System.out.println("");
		}
	}

}
