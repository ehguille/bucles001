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
	
	public static void mostrarTablaMultiplicarFor(int numero) {
		//situación inicial=multiplicador=0
		//condición de ejecución=multiplicador<=10
		//modificador de la situación multiplicador++
		//for(situación inicial; condición; modificador){}
		//for(int multiplicador=0;multiplicador<=10;multiplicador++) {
		//	System.out.println(numero*multiplicador);
		//}
		for(int i=0;i<=10;i++) {
			System.out.println(numero*i);
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
	
	public static int divisionEnteraFor(int dividendo, int divisor) {
		int cociente=0;
		for(int i=0;i<dividendo;i++) {
			dividendo=dividendo-divisor;
			cociente++;
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
	
	public static boolean esPrimoFor(int n) {
		boolean esPrimo=true;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				esPrimo=false;
				break;
			}
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
	
	public static int factorialFor(int n) {
		int resultado=1;
		for(int i=1;i<=n;i++) {
			resultado=resultado*i;
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
	
	public static void ejemploBreak(int parar) {
		int contador=0;
		while(true) {
			System.out.println(contador);
			if(contador==parar)
				break;
			contador++;
		}
	}
	
	public static void ejemploContinue(int saltar) {
		int contador=0;
		while(contador<10) {
			contador++; //contador=contador+1;
			if(contador==saltar)
				continue;
			System.out.println(contador);		
		}
	}
	
	public static void imprimirPatron01(int contador) {
		String resultado="";
		for(int i=0;i<contador;i++) {
			if(i%3==0)
				resultado+="-"; //resultado=resultado+"-";
			else
				resultado+="*";
		}
		System.out.println(resultado);
	}
	
	public static void imprimirPatron02(int contador) {
		String resultado="";
		for(int i=1;i<=contador;i++) {
			if(i%3==0)
				resultado+="*";
			else if((i-1)%3==0)
				resultado+="_"; //resultado=resultado+"-";
			else if((i-2)%3==0)
				resultado+="/"; //resultado=resultado+"-";
			else
				resultado+="??";
		}
		System.out.println(resultado);
	}
	
	public static void imprimirPatron03(int columnas, int filas) {
		for(int j=0;j<filas;j++) {
			for(int i=0;i<columnas;i++) {
				if(i==1&&j==1)
					System.out.print("?");
				else
					System.out.print("*");
			}   System.out.println("");
		}
	}
	
	public static void imprimirPatron04(int columnas, int filas) {
		for(int j=0;j<filas;j++) {
			for(int i=0;i<columnas;i++) {
				if(i==j)
					System.out.print("*");
				else
					System.out.print("·");
			}   System.out.println("");
		}
	}
	

	public static void imprimirPatron05(int columnas, int filas) {
		for(int j=0;j<filas;j++) {
			for(int i=0;i<columnas;i++) {
				if((i+j)==filas-1||i==j)
					System.out.print("*");
				else
					System.out.print("·");
			}   System.out.println("");
		}
	}

	public static void imprimirPatron06(int columnas, int filas) {
		for(int j=0;j<filas;j++) {
			for(int i=0;i<columnas;i++) {
				if((i+j)%2==0)
					System.out.print("*");
				else
					System.out.print("·");
			}   System.out.println("");
		}
	}
	

	public static void imprimirPatron07(int columnas, int filas) {
		for(int j=0;j<filas;j++) {
			for(int i=0;i<columnas;i++) {
				if((i+j)==filas-1)
					System.out.print("*");
				else
					System.out.print("·");
			}   System.out.println("");
		}
	}

	public static void imprimirPatron08(int columnas, int filas) {
		for(int j=0;j<filas;j++) {
			for(int i=0;i<columnas;i++) {
				if(i==0||j==0||j==filas-1||i==columnas-1)
					System.out.print("*");
				else
					System.out.print("·");
			}   System.out.println("");
		}
	}
		

}
