package Banco;

import java.util.Scanner;

public class Principal {
	public static int buscarNumeroCUenta(Cuenta cuenta[], int n) {
		int i=0,indice=0;
		boolean encontrado=false;
		
		while((i<cuenta.length)&& (encontrado==false)) {
			if(cuenta[i].getNumeroCuenta()==n) {
				encontrado=true;
				indice =i;
			}
			i++;
		}
		if(encontrado==false) {
			indice=-1;
		}
		return indice;
	}

	public static void main(String[] args) {
		Scanner ingresa = new Scanner(System.in);
		String nombre,apellido,dni;
		int numeroCuenta,nCuentas,opcion,indiceCuenta;
		double saldo,cantidad;
		Cuenta cuentas[];
		Cliente cliente;
		
		System.out.print("Ingrese el nombre de cliente: ");
		nombre=ingresa.nextLine();
		System.out.print("Ingrese el apellido de cliente: ");
		apellido=ingresa.nextLine();
		System.out.print("Ingresa el DNI de cliente: ");
		dni=ingresa.nextLine();
		System.out.print("Digite cuantas cuentas tiene: ");
		nCuentas=ingresa.nextInt();
		
		cuentas=new Cuenta[nCuentas];
		
		for(int i=0;i<cuentas.length;i++) {
			System.out.println("\nDigite los datos para la cuenta "+(i+1)+": ");
			System.out.print("Digite el numero de cuenta: ");
			numeroCuenta=ingresa.nextInt();
			System.out.print("Digite el saldo de la cuenta: ");
			saldo=ingresa.nextDouble();
			
			cuentas[i]=new Cuenta(numeroCuenta, saldo);
		}
		
		cliente=new Cliente(nombre, apellido, dni, cuentas);
		
		do{
			System.out.println("\t.:Menu:.");
			System.out.println("1. Ingresa dinero en la cuenta");
			System.out.println("2. Retira dinero de la cuenta");
			System.out.println("3. Consultar saldo de la cuenta");
			System.out.println("4. Salir");
			System.out.print("Digite la opcion de menu: ");
			opcion=ingresa.nextInt();
			
			switch(opcion) {
				case 1: System.out.print("\nDigite el numero de cuenta: ");
						numeroCuenta=ingresa.nextInt();
						indiceCuenta=buscarNumeroCUenta(cuentas, numeroCuenta);
						if(indiceCuenta==-1) {
							System.out.println("\nEl numero de cuenta ingresado no existe");
						}else {
							System.out.print("Digite la cantidad de dinero a ingresar en la cuenta: ");
							cantidad=ingresa.nextDouble();
							cliente.ingresaDinero(indiceCuenta, cantidad);
							System.out.println("\n Ingreso realizado correctamente ");
							System.out.println("Saldo disponible: "+cliente.consultarSaldo(indiceCuenta));
							
						}
						break;
				case 2: System.out.print("\nDigite el numero de cuenta: ");	
						numeroCuenta=ingresa.nextInt();
						indiceCuenta=buscarNumeroCUenta(cuentas, numeroCuenta);
						if(indiceCuenta==-1) {
							System.out.println("\nEl numero de cuenta ingresado no existe");
						}else {
							System.out.println("Digite la cantidad de dinero a retirar en la cuenta: ");
							cantidad=ingresa.nextDouble();
							if(cantidad>cliente.consultarSaldo(indiceCuenta)) {
								System.out.println("Saldo insuficiente");
							}else {
								cliente.retirarDinero(indiceCuenta, cantidad);
								System.out.println("\n Retiro realizado correctamente ");
								System.out.println("Saldo disponible: "+cliente.consultarSaldo(indiceCuenta));
							}
							
						}
						break;
				case 3: System.out.println("\nDigite el numero de cuenta: ");	
						numeroCuenta=ingresa.nextInt();
						indiceCuenta=buscarNumeroCUenta(cuentas, numeroCuenta);
						if(indiceCuenta==-1) {
							System.out.println("\nEl numero de cuenta ingresado no existe");
						}else {
							System.out.println("Saldo disponible: "+cliente.consultarSaldo(indiceCuenta));
						}
						break;
				case 4: break;
				default:System.out.println("Error,se confudio de opcion de menu");
						
			}
			System.out.println("");
			
		}while(opcion !=4);
	}

}
