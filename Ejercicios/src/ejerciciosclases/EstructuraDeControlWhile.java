package ejerciciosclases;

public class EstructuraDeControlWhile {

	public static void main(String[] args) {
		
		int i = 0;
		
		//Creo un bucle que me permitira ejecutar el codigo mientras se cumpla cierta condicion
		while(i<5) {
			
			if (i%2==0) {
				System.out.println("Valor de la variable i: " + " " + i + " que es par");
			} else {
				System.out.println("Valor de la variable i: " + " " + i + " que es impar");
			}
			//Se incrementa la variable i dentro del bucle y finaliza cuanto valga 4
			i++;
		}

	}

}
