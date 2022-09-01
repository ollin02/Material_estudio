package marcoMatriz;

import javax.swing.JOptionPane;

public class marco {
	public static void main(String[] args) {
		int M[][],nFilas,nCol,marco;
		
		nFilas=Integer.parseInt(JOptionPane.showInputDialog("Inserte el número de filas: "));
		nCol=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de columnas: "));
		marco=Integer.parseInt(JOptionPane.showInputDialog("Digita el numero que quieres de marco"));
		
		System.out.println("Matriz con marco de numeros");
		M=new int[nFilas][nCol];
		for(int i=0;i<nFilas;i++) {
			for(int j=0;j<nCol;j++){
				
				if(i==0||i==nFilas-1) {
					M[i][j]=marco;
				}if(j==0||j==nCol-1) {
					M[i][j]=marco;
				}
				
				System.out.print(M[i][j]+"  ");
			}
			System.out.println("");
		}
	}
}
