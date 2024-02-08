package tarea8;

import java.util.Scanner;

public class mayorOcurrencia {
	
	public static void main(String[] args) {	
		
		//Declaro mis variables y el tamaño de mi arreglo
		int[] numeros;
		numeros = new int [10];
		
		//Defino las variables que utilizare en el ciclo for
		int  numRepetido = 0;
		int cont = 0;
		int max = 0;

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese 10 numeros enteros: ");
		
		//Ciclo for que me permite ejecutar el codigo de forma repetitiva hasta que sea menor que el tamaño del arreglo
		for(int i=0; i < numeros.length; i++) {
			numeros[i] = scanner.nextInt();
		}
		
		//Ciclo for que me permite comparar y saber que numero es que se repite mas veces y cuantas veces
		for (int i=0; i < numeros.length; i++) {
				cont = 0;				
			for (int j = 0; j < numeros.length; j++) {
				if (numeros[i] == numeros[j]) {
					cont++;
				}
				if (cont > max) {
					max = cont;
					numRepetido = numeros[i];
				}
			}
		}
		
		System.out.println("El numero con mayor ocurrencia es: " + numRepetido + " y se repite " + max + " veces");
	}
}