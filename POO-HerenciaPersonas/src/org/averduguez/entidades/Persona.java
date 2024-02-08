package org.averduguez.entidades;

public class Persona {
	private String nombre;
	private String apellido;
	private int edad;
	private String email;
	
	
	public Persona() {
		super();
		System.out.println("Ejecutando el constructor de la clase persona sin parametros....");
	}

	public Persona(String nombre, String apellido, int edad, String email) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.email = email;
		System.out.println("Ejecutando el constructor de la clase persona con todos los parametros....");
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", email=" + email + "]";
	}
	
	public String saludar() {
		return "Hola!";
	}
	
	
	
	

}
