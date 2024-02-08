package ejerciciosclases;

public class EstructuraDeControlFOR {
	
	public static void main(String[] args) {
		
		//Defino un array de tamaño 10. Un arreglo con 10 posiciones donde cada una guarda un String
		//String[] nombres = new String[10];
		String[] nombres = {"Alejandro" , "Francisco", "Ana" , "Lautaro"};
		
		//Si no se la cantidad de String que tiene mi Array. Uso el metodo count me devuelve la longitud del array
		int count = nombres.length;
		System.out.println("Count: " + count);
		
		//inicializacion ; condicion ; incremento
		for(int i = 0 ; i<count ; i++) {
			
			System.out.println("Nombre: " + nombres[i].toString()); //toString

		}
		
	}
}
