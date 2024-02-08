package tarea5;

import java.util.Scanner;

public class MesesDelAnio {

	public static void main(String[] args) {

		//Le pido al usuario que ingrese un mes del año
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese un mes del año en letras minusculas:"); 
		String MesAnio = scanner.nextLine();
		
		//Sentencia switch -> Nos permite organizar bloques de codigos, de forma que se ejecuten cuando se cumple cierta condicion o caso
		
		//Utilizaremos 12 casos para todos los meses del año
		switch(MesAnio) {
		 case "enero":
			System.out.println("El mes es enero y corresponde al mes 1");
	        break; 
		 case "febrero":
			System.out.println("El mes es febrero y corresponde al mes 2");
		    break;     
		 case "marzo":
			System.out.println("El mes es marzo y corresponde al mes 3");
		    break;
		 case "abril":
			System.out.println("El mes es abril y corresponde al mes 4");
		     break; 
		 case "mayo":
			System.out.println("El mes es mayo y corresponde al mes 5");
			break;     
		 case "junio":
			System.out.println("El mes es junio y corresponde al mes 6");
			break;
		 case "julio":
			System.out.println("El mes es julio y corresponde al mes 7");
		     break; 
		 case "agosto":
			System.out.println("El mes es agosto y corresponde al mes 8");
			 break;     
		 case "septiembre":
			System.out.println("El mes es septiembre y corresponde al mes 9");
			 break;
		 case "octubre":
			System.out.println("El mes es octubre y corresponde al mes 10");
			break; 
		 case "noviembre":
			System.out.println("El mes es noviembre y corresponde al mes 11");
			break;     
		 case "diciembre":
			System.out.println("El mes es diciembre y corresponde al mes 12");
			break;
		//Si el usario ingresa un mes incorrecto se muestra un mensaje de error
		 default:
			System.out.println("Ingrese un mes correcto");
		}
		          
	}

}
