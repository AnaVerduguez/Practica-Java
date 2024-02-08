package tarea6;

import java.util.Scanner;

public class DiasDelMesConAniosBisiestos {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//Le pido al usuario que ingrese un mes y un año
		System.out.println("Ingrese un mes del año del 1 al 12:"); 
		int Mes = scanner.nextInt();
		
		System.out.println("Ingrese un año:"); 
		int Anio = scanner.nextInt();
		
		//Utilizaremos 12 casos para todos los meses del año
		switch(Mes) {
		 case 1:
			System.out.println("El mes es enero, el año es " + Anio + " y tiene 31 días");
	        break; 
		 case 2:
			 //Un año es bisiesto si es divisible entre 4 y NO divisible entre 100 o 400
			 if (Anio % 4 == 0 && (Anio % 100 != 0 || Anio % 400 == 0)) {
				//En caso de que el año sea bisiesto se le agrega un dia mas a febrero
				System.out.println("El mes es febrero, el año es " + Anio + " y tiene 29 días (Año bisiesto)");
				break;
			}else{
				System.out.println("El mes es febrero, el año es " + Anio + " y tiene 28 días (Año no bisiesto)");
				break;
			}
		 case 3:
			System.out.println("El mes es marzo, el año es " + Anio + " y tiene 31 días");
		    break;
		 case 4:
			System.out.println("El mes es abril, el año es " + Anio + " y tiene 30 días");
		     break; 
		 case 5:
			System.out.println("El mes es mayo, el año es " + Anio + " y tiene 31 días");
			break;     
		 case 6:
			System.out.println("El mes es junio, el año es " + Anio + " y tiene 30 días");
			break;
		 case 7:
			System.out.println("El mes es julio, el año es " + Anio + " y tiene 31 días");
		     break; 
		 case 8:
			System.out.println("El mes es agosto, el año es " + Anio + " y tiene 31 días");
			 break;     
		 case 9:
			System.out.println("El mes es septiembre, el año es " + Anio + " y tiene 30 días");
			 break;
		 case 10:
			System.out.println("El mes es octubre, el año es " + Anio + " y tiene 31 días");
			break; 
		 case 11:
			System.out.println("El mes es noviembre, el año es " + Anio + " y tiene 30 días");
			break;     
		 case 12:
			System.out.println("El mes es diciembre, el año es " + Anio + " y tiene 31 días");
			break;
		//Si el usario ingresa un mes incorrecto se muestra un mensaje de error
		 default:
			System.out.println("Ingrese un mes correcto");
		}
		          
	}

}