package ejerciciosclases;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		
		//SUMA
		int i, j ,suma;
		
		i=2;
		j=5;
		
		suma= i + j;
		
		System.out.println("Suma = " + (i + j)); //Prioridad al parentesis. Resuelve la suma y despues concateno con el String

		
		//RESTO
		int resto= j % i;
		
		System.out.println("Resto = " + resto);
		
		
		//DIVISION
		int div = j/i;
		
		//Casteo de valores: Se convierten en dobles antes de la divisón.  double div = (double)j/ (double)i;
		
		System.out.println("Division = " + div);
		
		//INCREMENTO
		System.out.println("Incremento i en 1 = " + (++i)); //Incrementa i en 1 y luego devuelve i. Es lo mismo que -> i = i +1
		
		
		//DECREMENTO
		System.out.println("Decremento i en 1 = " + (--i)); //Decrementa i en 1 y luego devuelve i. Es lo mismo que -> i = i -1
		
		
		
		
		
		
		
	}

}
