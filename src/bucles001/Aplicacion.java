package bucles001;

import java.util.Scanner;

public class Aplicacion {
	
	public Aplicacion() {
		mostrarMenu();
	}

	public void mostrarMenu() {
		int opcion;
		do {
			//Declaro variables
			Scanner s=new Scanner(System.in);
			//Muestro menú
			System.out.println("Introduce un número del 1 al 3:");
			System.out.println("1) Mostrar tabla de multiplicar.");
			System.out.println("2) División de enteros.");
			System.out.println("3) Comprobar si un entero es primo.");
			System.out.println("4) Factorial de un número.");
			//Pido por teclado la opción
			opcion=s.nextInt();
			//Evalúo la opción
			switch(opcion) {
			case 1:
				System.out.println("Introduce un número:");
				int numero=s.nextInt();
				Ejemplos.mostrarTablaMultiplicar(numero);
				break;
			case 2:
				System.out.println("Introduce el dividendo:");
				int dividendo=s.nextInt();
				System.out.println("Introduce el divisor");
				int divisor=s.nextInt();
				int resultado=Ejemplos.divisionEntera(dividendo, divisor);
				System.out.println(resultado);
				break;
			case 3:
				System.out.println("Introduce el número:");
				int numeroPrimo=s.nextInt();
				boolean esPrimo=Ejemplos.esPrimo(numeroPrimo);
				System.out.println(esPrimo);
				break;
			case 4:
				System.out.println("Introduce el número:");
				int factorial=s.nextInt();
				System.out.println(Ejemplos.factorial(factorial));
			case 5:
				Ejemplos.checkPassword();
			default:
				System.out.println("Opción incorrecta.");
			}
		} while(opcion>=1 && opcion <=5);

		
	}
	
	public static void main(String[] args) {
		Aplicacion a=new Aplicacion();

	}

}
