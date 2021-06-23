package Javabasico2;

import java.util.Scanner;

public class EntradaySalidaDatos {

	public static void main(String[] args) {

		/*String mensaje = "Legionario";
		System.out.println("mensaje: "+mensaje);
		System.err.println("mensaje: "+mensaje);*/
		
		/*Scanner teclado = new Scanner(System.in);
		
	
		String cadena;
		int numeroEntero=0;
		double numeroReal=0.0;
		
		System.out.println("introduce una cadena:");
		cadena = teclado.nextLine();

		System.out.println("introduce un nro. entero: ");
		numeroEntero = teclado.nextInt();
		
		System.out.println("introduce un nro. real");
		numeroReal= teclado.nextDouble();
		
		System.out.println("La cadena que ingresaste fue: "+cadena);
		System.out.println("El número entero fue: "+numeroEntero);
		System.out.println("El número double fue: "+numeroReal);*/
		
		
		// print, printl, printf
		
		String mensajeDos = "Esto es un mensaje";
		
		System.out.print(mensajeDos);
		System.out.println(mensajeDos);
	
		//Printf
		//50.32568 -> 50.32
		
		double pago = 50.32568;
		System.out.printf("%4.2f", pago);
		
		System.out.println();
		
		System.out.printf("Cadena: %s, Entero: %d, Real: %4.2f", "Hola", 245,78.2589);
				
				
		
		
		
	}
}
