package ejerciciosclases;

import java.util.Scanner;

public class EjemploArregloNotasAlumnos {
	
	public static void main(String[] args) {
		//Declaro los array. Se reconocen con []
		double[] claseMatematicas, claseHistoria, claseLengua;
		
		//Declaro las variables double y las inicializo en 0
		double sumNotasMatematicas = 0, sumNotasHistoria = 0, sumNotasLengua = 0;
		
		//Defino que el tamaño fijo del array es 7. El array deja de ser null 
		claseMatematicas = new double [7];
		claseHistoria = new double [7];
		claseLengua = new double [7];
		
		//Instancia de Scanner
		Scanner scanner = new Scanner(System.in);
		
		//Posicion: 0 | 1 | 2 | 3 | 4 | 5 | 6
		//Nota:    10 | 9 | 8 | 7 | 5 | 3 | 2
		
		
		System.out.println("Ingrese 7 notas de estudiantes para Matematicas");
		//Para recorrerlo hay que saber el tamaño de 0 a 6
		for(int i = 0 ; i < claseMatematicas.length; i++) {
			claseMatematicas[i] = scanner.nextDouble();
		}
				
		System.out.println("Ingrese 7 notas de estudiantes para Historia");
		for(int i = 0 ; i < claseHistoria.length; i++) {
			claseHistoria[i] = scanner.nextDouble();	
		}
		
		System.out.println("Ingrese 7 notas de estudiantes para Lengua");
		for(int i = 0 ; i < claseLengua.length; i++) {
			claseLengua[i] = scanner.nextDouble();
		}
		
		
		//Sumatoria de todas las notas y calcular el promedio
		for(int i = 0; i <7 ; i++){
			sumNotasMatematicas += claseMatematicas[i];
			sumNotasHistoria += claseHistoria[i];
			sumNotasLengua += claseLengua[i];
		}
		
		//Sumatoria de notas + cantidad de notas y promedio de cada una de las materias y del curso
		double promedioMatematica = (sumNotasMatematicas/claseMatematicas.length);
		double promedioHistoria = (sumNotasHistoria/claseHistoria.length);
		double promedioLengua = (sumNotasLengua/claseLengua.length);
		System.out.println("Promedio clase Matematicas: " + promedioMatematica);
		System.out.println("Promedio clase historia: " + promedioHistoria);
        System.out.println("Promedio clase lenguaje: " + promedioLengua);
        System.out.println("Promedio total del curso: " + (promedioMatematica + promedioHistoria + promedioLengua)/3);
 
		//Promedio de un alumno es especifico
        System.out.println("Ingrese el identificador del alumno (de 0 - 6):");
        int id = scanner.nextInt();
        double promedioAlumno = (claseHistoria[id] + claseLengua[id] + claseMatematicas[id])/3;
        System.out.println("Promedio alumno Nro " + id + " : " + promedioAlumno);
			
	}

}