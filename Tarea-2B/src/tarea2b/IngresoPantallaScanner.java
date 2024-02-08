package tarea2b;

//Importo el scanner que me permitira ingresar datos por teclado
import java.util.Scanner;

public class IngresoPantallaScanner {

	public static void main(String[] args) {
		
		//Inicialiazo mis variables para poder utilizarlas
		String nombre, apellido, lugarDeResidencia;
		int edad;
		
		Scanner scanner = new Scanner(System.in); //Creo el objeto scanner
		
		System.out.println("Ingrese su nombre: "); //Muestro un mensaje por consola
		nombre= scanner.nextLine(); //Guardo lo ingresado por teclado en la variable
		
		System.out.println("Ingrese su apellido: ");
		apellido= scanner.nextLine();
		
		System.out.println("Ingrese su lugar de residencia: ");
		lugarDeResidencia= scanner.nextLine();
		
		System.out.println("Ingrese su edad: ");
		edad= scanner.nextInt();
		
		//Imprimo por consola los resultados
		System.out.println("Tu nombre es: " + nombre);
		System.out.println("Tu apellido es: " + apellido); 
		System.out.println("Tu edad es: " + edad); 
		System.out.println("Tu lugar de residencia es: " + lugarDeResidencia); 

	}

}
