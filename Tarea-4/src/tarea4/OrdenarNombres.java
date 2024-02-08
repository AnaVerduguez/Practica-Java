package tarea4;

import java.util.Scanner;

public class OrdenarNombres {

	public static void main(String[] args) {
		
		String nombre1= "";
		String nombre2= "";
		String nombre3= "";
		
		Scanner scanner = new Scanner(System.in);
				
		System.out.println("Ingrese el primer nombre: "); 
		nombre1 = scanner.nextLine();
		
		System.out.println("Ingrese el segundo nombre: "); 
		nombre2 = scanner.nextLine();
		
		System.out.println("Ingrese el tercer nombre: "); 
		nombre3 = scanner.nextLine();
		
		//Metodo LENGTH me permite saber la cantidad de caracteres
		if(nombre1.length() > nombre2.length() & nombre1.length() > nombre3.length()){
			System.out.print("El nombre mas largo es " + nombre1 + " y tiene " + nombre1.length() + " caracteres");
			
		}else if (nombre2.length() > nombre1.length() & nombre2.length() > nombre3.length()){
			System.out.print("El nombre mas largo es " + nombre2 + " y tiene " + nombre2.length() + " caracteres");
			
		}else if (nombre3.length() > nombre1.length() & nombre3.length() > nombre2.length()){
			System.out.print("El nombre mas largo es " + nombre3 + " y tiene " + nombre3.length() + " caracteres");
		}
		
	}

}
