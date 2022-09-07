package identidad;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class MatrizIdentica {
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int N[][],nFilas,nCol;
		
		nFilas=Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de filas: "));
		nCol=Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de Columnas: "));
		
		N= new int[nFilas][nCol];
		
		System.out.println("Matriz Identidad: ");
		for(int i=0;i<nFilas;i++) {
			for(int j=0;j<nCol;j++) {
				if(i==j) {
					N[i][j]=1;
				}else {
					N[i][j]=0;
				}
				System.out.print(N[i][j]+" ");
			}
			System.out.println("");
		}
	
	}

}
