package ArchivoTexto.org;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ArchivoDeTexto {
	File archivo;
	
	private void crearArchivo() {
		archivo = new File("prueba.txt");
		
		try {
			if(archivo.createNewFile()){
				System.out.println("El archivo de ha creado correctamente");
			}
		} catch (IOException e) {
			System.out.println("No se pudo cerar el archivo"+ e);
			e.printStackTrace();
		}
	}
	
	private void crearDirectorio() {
		archivo = new File("carpetaPrueba");
		
		if(archivo.mkdir()) {
			System.out.println("Se ha cerado el directorio correctamente");
		}else {
			System.out.println("Error, no se ha podido crear el directorio");
		}
	}
	
	private void escribirTexto() {
		try {
			FileWriter escribir =new FileWriter(archivo);
			escribir.write("Hola que tal?");
			escribir.write("\r\nMas Texto");
			escribir.close();
		} catch (IOException e) {
			System.err.println("Error, nos e pudo esbir sobre el archivo");
			e.printStackTrace();
		}
	}
	
	private void añadirTexto() {
		try {
			FileWriter escribir =new FileWriter(archivo,true);
			escribir.write("\r\nMucho mas texto");
			escribir.write("\r\nAhora mas");
			escribir.close();
		} catch (IOException e) {
			System.err.println("Error, nos e pudo esbir sobre el archivo");
			e.printStackTrace();
		}
	}
	
	private void leerTexto() {
		String cadena;
		
		try {
			FileReader lector = new FileReader(archivo);
			BufferedReader lectura = new BufferedReader(lector);
			cadena=lectura.readLine();
			while(cadena != null) {
				System.out.println(cadena);
				cadena=lectura.readLine();
			}
					
		} catch (FileNotFoundException e) {
			System.err.println("Error, "+e);
			e.printStackTrace();
		} catch (IOException e) {
			System.err.println("Error, "+e);
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		ArchivoDeTexto archivos = new ArchivoDeTexto();
		archivos.crearArchivo();
		archivos.leerTexto();
		//archivos.escribirTexto();
		//archivos.añadirTexto();
		//archivos.crearDirectorio();
	}

}
