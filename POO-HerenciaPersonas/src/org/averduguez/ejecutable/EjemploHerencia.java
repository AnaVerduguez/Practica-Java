package org.averduguez.ejecutable;

import org.averduguez.entidades.Alumno;
import org.averduguez.entidades.AlumnoInternacional;
import org.averduguez.entidades.Persona;
import org.averduguez.entidades.Profesor;

public class EjemploHerencia {

	public static void main(String[] args) {

		//Creo la instancia de la clase Alumno
		Alumno alumno = new Alumno();
		
		alumno.setApellido("Verduguez");
		alumno.setEdad(22);
		alumno.setEmail("anaverduguez@hotmail.com");
		alumno.setNombre("Ana");
		alumno.setNotaCastellano(8.5);
		alumno.setNotaHistoria(7.0);
		alumno.setNotaMatematica(9.3);
		alumno.setInstitucion("Instituto UMET");
		
		
		//Creo la instancia de la clase AlumnoInternacional 
        AlumnoInternacional alumnoInt = new AlumnoInternacional();
        alumnoInt.setNombre("Javier");
        alumnoInt.setApellido("Garcia");
        alumnoInt.setPais("Canada");
        alumnoInt.setEdad(25);
        alumnoInt.setInstitucion("Instituto UMET");
        alumnoInt.setNotaIdiomas(6.8);
        alumnoInt.setNotaCastellano(6.2);
        alumnoInt.setNotaHistoria(5.8);
        alumnoInt.setNotaMatematica(6.5);
		
        
        //Creo la instancia de la clase de Profesor
        Profesor profesor = new Profesor();
        profesor.setNombre("Lucia");
        profesor.setApellido("Pérez");
        profesor.setAsignatura("Matemáticas");
		
        //Imprimo todos los valores de cada alumno,alumno internacional y profesor
		imprimir(alumno);
		imprimir(alumnoInt);
		imprimir(profesor);

	}
	
	
	public static void imprimir(Persona persona) {
		System.out.println("---------------------------------------");
		System.out.println(persona);
	}
	
	

}
