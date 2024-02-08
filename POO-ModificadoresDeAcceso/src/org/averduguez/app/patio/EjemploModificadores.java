package org.averduguez.app.patio;

import org.averduguez.app.hogar.Persona;

public class EjemploModificadores {

	public static void main(String[] args) {
		
	    //Creo el objeto perro con su nombre y raza
		Perro perro = new Perro();
		perro.setNombre("Theo");
		perro.setRaza("Mestizo");
		System.out.println("Nombre:" + perro.getNombre() + " " + perro.getRaza());
		
		//Creo el objeto persona con su nombre y apellido, junta al metodo jugar
		Persona p = new Persona("Ana","Verduguez");
		System.out.println(perro.jugar(p));
	
	}
}
