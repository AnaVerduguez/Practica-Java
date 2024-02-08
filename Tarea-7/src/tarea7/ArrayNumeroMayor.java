package tarea7;

import java.util.Scanner;

public class ArrayNumeroMayor {

	public static void main(String[] args) {
		
		//Declaro el arreglo que voy a utilizar
		int[] numeros;
		
		//Defino la variable max y la inicializo
		int max = 0;
		
		//Defino que el tamaño fijo del arreglo
		numeros = new int [10];
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese 10 numeros enteros: ");
		
		//Ciclo for que me permite ejecutar el codigo de forma repetitiva hasta que sea menor que el tamaño del arreglo
		for(int i = 0 ; i < numeros.length; i++) {
			numeros[i] = scanner.nextInt();
			//La variable max nos permitira comparar todos los numeros del arreglo y guardara el numero mayor ingresado
			if (numeros[i] > max) {
				max = numeros[i];
			}
		}
		
		System.out.println("El numero mas grande ingresado es: " + max);
		
	}

}
