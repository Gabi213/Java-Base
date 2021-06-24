package Javabasico3;

public class Variables {
/**
 * @author Gabriel Albarracin
 */
	public static void main(String[] args) {
		
		int legionarios = 30;
		
		//Identificadores Válidos:
		int primeraEdad;
		int ulimaEdad;
		int primera_edad;
		int primeraedad;
		int $edad;
		int val1;
		int valAge;
		
		//Identificadores No Válidos:
//		int 1age;
//	int primera Edad;
//		int test#;
//		int final;
//		int int;
//		int double;
//		int break;
		
		
		//Diferencia entre un dato primitivo y un dato de clase. int - integer
		int numeroInt=5;
		Integer numeroInteger = new Integer(3);
		
		System.out.println("Número int: "+numeroInt);
		System.out.println("Número Integer: "+ numeroInteger);
		System.out.println("Suma int + Integer: "+(numeroInt+numeroInteger));
	
//		numeroInt.
		
//		numeroInteger. 
		
//		int resultado = int.parseInt(3);
		int resultado = Integer.parseInt("1");
		System.out.println("El texto transformado a entero: "+resultado);
		
		
		System.out.println("Suma de numroInt + resultado: "+ (numeroInt + resultado));
		
		
		//datos
		int edad = 18;
		double peso = 60.5;
		char letra = 'e';
		boolean legionario = true;
		
		String str3= "No tieneSntido";
		String str4= "Tiene Sentido";
		
		String str = " ";
		String str2 = new String();
		
//		Esto es un comentario de una sola línea 
		
		/*Esto
		Es un
		comentario
		multilínea*/
		
		
		System.out.println("Cantidad de legionarios actuales: "+legionarios);
		
		int primerNumero = 2;  //32 bits
		double segundoNumero=9.0; //64 bits 
		float tercerNumero= (float) (2000*primerNumero/segundoNumero +7); //32 bits
		
		System.out.println("**************");
		System.out.println("Float: "+tercerNumero);
		System.out.println("double:"+(double)tercerNumero);
		System.out.println("Int: "+(int)tercerNumero);
		System.out.println("**************");
		
		
		//Separadores
		//()
		System.out.println("Tenemos "+legionarios+" legionarios en el curso");
		System.out.println("Dentro de 30 días tendremos: "+(legionarios*15)+" legionarios");
			
		//{}
		//[]
		
		String[] javaLegion= {"Juan", "José", "Pedro", "Raúl", "Jimena"};
		//;
		
		
		
		
		
	}

}
