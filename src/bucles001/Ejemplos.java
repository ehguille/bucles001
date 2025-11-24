package bucles001;

import java.util.Scanner;

public abstract class Ejemplos {
	
	public static void mostrarTablaMultiplicar(int numero) {
		int multiplicador=0;
		while(multiplicador<=10) {
			multiplicador++; //multiplicador=multiplicador+1;
			System.out.println(numero*multiplicador);
		}
	}
	
	//Método que haga una resta de números enteros utilizando sumas
	//y solo con lo que sabéis hasta ahora.
	//todo: 2/2=0, y debería ser 1 (revisar)
	public static int divisionEntera(int dividendo, int divisor) {
		int cociente=0;
		int resultadoResta=dividendo;
		while(resultadoResta>0) {
			resultadoResta=resultadoResta-divisor;
			if(resultadoResta>=0)
				cociente=cociente+1; //cociente++;
		}
		return cociente;
	}
	
	//método que calcule si un número es primo o no
	public static boolean esPrimo(int numero) {
		boolean esPrimo=true;
		int contador=numero-1;
		while(contador>1) {
			if(numero%contador==0)
				esPrimo=false;
			contador--;//contador=contador-1
		}		
		return esPrimo;
	}
	
	public static int calcularPago(int capitalInicial, int duracionPrestamo, int interes) {
		return 0;
	}
	
	public static int factorial(int n) {
		int resultado=1;
		int contador=1;
		while(contador<n) {
			resultado+=contador*resultado;
			contador++;
		}
		return resultado;
	}
	
	public static void checkPassword() {
		String passwordOculta="hola";
		String password="";
		Scanner s=new Scanner(System.in);
		int contador=0;
		do {
			System.out.println("Introduce tu contraseña:");
			password=s.next();
			contador++;
		}
		while(!passwordOculta.equals(password));
		System.out.println("Has acertado al intento número "+contador);
	}
	


}
