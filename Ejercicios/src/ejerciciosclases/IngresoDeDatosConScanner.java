package ejerciciosclases;

//Importo el scanner desde la libreria JDK
import java.util.Scanner;

public class IngresoDeDatosConScanner {

	public static void main(String[] args) { 

		Scanner scanner = new Scanner(System.in); //Creo el objeto scanner
		
		//Inicializo la variable nombre y apellido
		String nombre = ""; 
		String apellido = "";
		
		System.out.println("Ingrese el nombre:"); //Muestro un mensaje por consola
		nombre = scanner.nextLine(); //Almaceno el nombre con el scanner
		
		System.out.println("Ingrese el apellido:"); 
		apellido = scanner.nextLine(); 
		
		
		//Salida por consola
		System.out.println("Nombre ingresado: " + nombre); 
		System.out.println("Apellido ingresado: " + apellido); 
	}
}