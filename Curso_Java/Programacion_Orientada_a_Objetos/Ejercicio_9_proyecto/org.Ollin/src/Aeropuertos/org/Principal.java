package Aeropuertos.org;

import java.util.Scanner;

public class Principal {
	static Scanner entrada=new Scanner(System.in);
	final static int num=4;//Numero de aeropuertos
	static Aeropuerto aeropuertos[] = new Aeropuerto[num];

	public static void main(String[] args) {
		//insertamos datos de los aeropuerto
		insertarDatosAeropuerto(aeropuertos);
		menu();
		

	}
	
	public static void insertarDatosAeropuerto(Aeropuerto aero[]) {
		aero[0]=new AeropuertoPublico("Jorge Chavez", "Lima", "Peru", 80000000);
		aero[0].insertarCompañia(new Compañia("AeroPeru"));
		aero[0].insertarCompañia(new Compañia("LATAM"));
		aero[0].getCompañia("AeroPeru").insertarVuelo(new Vuelo("IB20", "Lima", "Mexico", 150.90, 150));
		aero[0].getCompañia("AeroPeru").insertarVuelo(new Vuelo("IB21", "Lima", "Buenos Aires", 180.99, 120));
		aero[0].getCompañia("LATAM").insertarVuelo(new Vuelo("FC12", "Lima", "Londres", 500.90, 180));
		aero[0].getCompañia("AeroPeru").getVuelo("IB20").insertarPasajero(new Pasajero("Alejandro", "20BGHP", "Peruana"));
		aero[0].getCompañia("AeroPeru").getVuelo("IB20").insertarPasajero(new Pasajero("Maria", "PJKL20", "Mexicana"));
		aero[0].getCompañia("LATAM").getVuelo("FC12").insertarPasajero(new Pasajero("Raul", "JH21KL", "Peruana"));
		
		aero[1]=new AeropuertoPrivado("Central Ciudad Real", "Ciudad Real", "España");
		aero[1].insertarCompañia(new Compañia("AirEuropa"));
		String empresas[]= {"Cobresol","Anguila34"};
		((AeropuertoPrivado)aero[1]).insertarEmpresas(empresas);
		aero[1].getCompañia("AirEuropa").insertarVuelo(new Vuelo("AE025", "Madrid", "Buenos Aires", 150.50, 120));
		aero[1].getCompañia("AirEuropa").getVuelo("AE025").insertarPasajero(new Pasajero("Pedro", "JG23Sk", "Italiano"));
		
		aero[2]=new AeropuertoPublico("Aeropuerto Bogota", "Bogota", "Colombia", 20000000);
		aero[2].insertarCompañia(new Compañia("AirAmerica"));
		aero[2].insertarCompañia(new Compañia("VuelaBogota"));
		aero[2].getCompañia("AirAmerica").insertarVuelo(new Vuelo("AE030", "Bogota", "Lima", 130.90, 110));
		aero[2].getCompañia("AirAmerica").insertarVuelo(new Vuelo("AE031", "Bogota", "Lima", 180.99, 80));
		aero[2].getCompañia("AirAmerica").getVuelo("AE030").insertarPasajero(new Pasajero("Juan", "23VGHP", "Venezolano"));
		aero[2].getCompañia("AirAmerica").getVuelo("AE030").insertarPasajero(new Pasajero("Mario", "HJKL20", "Colomviano"));

		aero[3]=new AeropuertoPublico("Aeropuerto Mexico", "Mexico", "Mexico", 40000000);
		aero[3].insertarCompañia(new Compañia("AeroMexico"));
		aero[3].getCompañia("AeroMexico").insertarVuelo(new Vuelo("IB2040", "Mexico", "NuevaYork", 130.90, 140));
		aero[3].getCompañia("AeroMexico").insertarVuelo(new Vuelo("IB2042", "Mexico", "Lima", 100.99, 150));
		aero[3].getCompañia("AeroMexico").getVuelo("IB2040").insertarPasajero(new Pasajero("Pedro", "23RBHP", "Estadounidence"));
		
	}
	
	public static void menu() {
		String nombreAeropuerto,nombreCompañia,origen,destino;
		int opcion;
		Aeropuerto aeropuerto;
		Compañia compañia;
		
		do {
			System.out.println("\t.:MENU:.");
			System.out.println("1. Ver Aeropuertos gestionados (Publicos o privados)");
			System.out.println("2. Ver empresas (Privado) o subvenvion(Publico)");
			System.out.println("3. Lista compañias de un Aeropuerto");
			System.out.println("4. Lista de vuelos por compañia");
			System.out.println("5. Listar posibles vuelos de Origen a Destino");
			System.out.println("6. Salir");
			System.out.print("Opcion: ");
			opcion=entrada.nextInt();
			
			
			switch(opcion) {
				case 1://Ver aeropurtos gesytionados (Publicos o Privados)
						System.out.println("");
						mostrarDatosAeropuertos(aeropuertos);
						break;
				case 2://Ver empresas(Privado) o subvencion(Publico)
						System.out.println("");
						mostrarPatocinio(aeropuertos);
						break;
				case 3: //Listas compañias de un Aeropuerto
						entrada.nextLine();
						System.out.println("Digite el nombre del Aeropuerto: ");
						nombreAeropuerto=entrada.nextLine();
						aeropuerto=bucarAeropuerto(nombreAeropuerto, aeropuertos);
						if(aeropuerto==null) {
							System.out.println("El aeropuerto no existe");
						}else {
							mostrarCompañias(aeropuerto);
						}
						break;
				case 4://Lista de vuelos por compañias
						entrada.nextLine();
						System.out.print("\nDigite el nombre del Aeropuerto: ");
						nombreAeropuerto=entrada.nextLine();
						aeropuerto=bucarAeropuerto(nombreAeropuerto, aeropuertos);
						if(aeropuerto==null) {
							System.out.println("El aeropuerto no existe");
						}else {
							System.out.print("Digite el nombre de la compañia: ");
							nombreCompañia=entrada.nextLine();
							compañia=aeropuerto.getCompañia(nombreCompañia);
							mostrarVuelos(compañia);
							
						}
						break;
				case 5://Listar posibles vuelos de Origen a Destino
						entrada.nextLine();
						System.out.println("\nDigite la ciudad Origen: ");
						origen=entrada.nextLine();
						System.out.println("Digite la ciudad Destino: ");
						destino=entrada.nextLine();
						mostaraVueloOrigenDestino(origen,destino,aeropuertos);
						break;
				case 6:
						break;
				default: System.out.println("Error, Se equivoco de opcion de menu");break;
			}
		
			
		}while(opcion!=6);
	}
	
	public static void mostrarDatosAeropuertos(Aeropuerto aeropuertos[]) {
		for(int i=0; i<aeropuertos.length; i++) {
			if(aeropuertos[i] instanceof AeropuertoPrivado) {
				System.out.println("Aeropurto Privado");
				System.out.println("Nombre: "+aeropuertos[i].getNombre());
				System.out.println("Ciudad: "+aeropuertos[i].getCiudad());
				System.out.println("Pais: "+aeropuertos[i].getPais());
			}
			else {
				System.out.println("Aeropurto Publico");
				System.out.println("Nombre: "+aeropuertos[i].getNombre());
				System.out.println("Ciudad: "+aeropuertos[i].getCiudad());
				System.out.println("Pais: "+aeropuertos[i].getPais());
			}
			System.out.println("");
		}

	}
	
	public static void mostrarPatocinio(Aeropuerto aeropuertos[]) {
		String empresas[];
		for(int i=0;i<aeropuertos.length; i++) {
			if(aeropuertos[i] instanceof AeropuertoPrivado) {
				System.out.println("Aeropuerto Privado: "+aeropuertos[i].getNombre());
				empresas=((AeropuertoPrivado)aeropuertos[i]).getListaEmpresas();
				System.out.println("Empresas: ");
				for(int j=0;j<empresas.length;j++) {
					System.out.println(empresas[j]);
				}
			}else {
				System.out.println("Aeropuerto Publico: "+aeropuertos[i].getNombre());
				System.out.println("Subvencion: "+((AeropuertoPublico)aeropuertos[i]).getSubvencion());
			}
			System.out.println("");
		}
	}
	
	public static Aeropuerto bucarAeropuerto(String nombre, Aeropuerto aeropuertos[]) {
		boolean encontrado=false;
		int i=0;
		Aeropuerto aero=null;
		while((!encontrado)&&(i<aeropuertos.length)) {
			if(nombre.equals(aeropuertos[i].getNombre())) {
				encontrado = true;
				aero=aeropuertos[i];
			}
			i++;
		}
		return aero;
	}
	
	public static void mostrarCompañias(Aeropuerto aeropuerto) {
		System.out.println("Las compañias del aeropuerto: "+aeropuerto.getNombre());
		for(int i=0;i<aeropuerto.getNumCompañia();i++) {
			System.out.println(aeropuerto.getCompañia(i).getNombre());
		}
		
	}
	
	public static void mostrarVuelos(Compañia compañia) {
		Vuelo vuelo;
		System.out.println("Los Vuelos de la compañia: "+compañia.getNombre());
		for(int i=0;i<compañia.getNumVuelo();i++){
			vuelo =compañia.getVuelo(i);
			System.out.println("Identificador: "+vuelo.getIdentificador());
			System.out.println("Ciudad Origen: "+vuelo.getCiudadOrigen());
			System.out.println("Ciedad Destino: "+vuelo.getCiudadDestino());
			System.out.println("Precio: $"+vuelo.getPrecio());
			System.out.println("");
		}
	}
	
	public static Vuelo[] buscarVuelosOrigenDestino(String origen, String destino, Aeropuerto aeropuertos[]){
		Vuelo vuelo;
		int contador=0;
		Vuelo listaVuelos[];
		
		for(int i=0; i<aeropuertos.length;i++) {//recorremos los aeropuertos
			for(int j=0;j<aeropuertos[i].getNumCompañia();j++) {//recorremos las compañias
				for(int k=0;k<aeropuertos[i].getCompañia(j).getNumVuelo();k++) {//recorremos los vuelos
					vuelo=aeropuertos[i].getCompañia(j).getVuelo(k);
					if((origen.equals(vuelo.getCiudadOrigen()))&&(destino.equals(vuelo.getCiudadDestino()))) {
						contador++;
					}
				}
			}
		}
		listaVuelos = new Vuelo[contador];
		int q=0;
		
		for(int i=0; i<aeropuertos.length;i++) {//recorremos los aeropuertos
			for(int j=0;j<aeropuertos[i].getNumCompañia();j++) {//recorremos las compañias
				for(int k=0;k<aeropuertos[i].getCompañia(j).getNumVuelo();k++) {//recorremos los vuelos
					vuelo=aeropuertos[i].getCompañia(j).getVuelo(k);
					if((origen.equals(vuelo.getCiudadOrigen()))&&(destino.equals(vuelo.getCiudadDestino()))) {
						listaVuelos[q] = vuelo;
						q++;
					}
				}
			}
		}
		return listaVuelos;
	}
	
	public static void mostaraVueloOrigenDestino(String origen, String destino, Aeropuerto aeropuertos[]) {
		Vuelo vuelos[];
		vuelos=buscarVuelosOrigenDestino(origen, destino, aeropuertos);
		if(vuelos.length==0){
			System.out.println("No existen vuelos de esa ciudad origen a destino");
		}else {
			System.out.println("\nVuelos Encontrados: \n");
			for(int i=0;i<vuelos.length;i++) {
				System.out.println("Identificador: "+vuelos[i].getIdentificador());
				System.out.println("Ciudad Origen: "+vuelos[i].getCiudadOrigen());
				System.out.println("Ciudad Destino: "+vuelos[i].getCiudadDestino());
				System.out.println("Precio: $"+vuelos[i].getPrecio());
				System.out.println("");
			}
		}
	}
}
