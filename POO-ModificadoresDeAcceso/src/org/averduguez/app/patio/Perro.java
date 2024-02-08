package org.averduguez.app.patio;

import org.averduguez.app.hogar.Persona;

public class Perro {
	
	private String nombre;
	private String raza;
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	
	 String jugar(Persona p) {
		return ("El perro esta jugando con la persona : " + p.getNombre() +" "+  p.getApellido() +" - "+ p.arrojarPelota()); 
		
	}

}
