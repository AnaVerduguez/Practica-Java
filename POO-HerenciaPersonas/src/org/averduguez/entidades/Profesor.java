package org.averduguez.entidades;

public class Profesor extends Persona{
	private String asignatura;

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	public Profesor(String asignatura) {
		super();
		this.asignatura = asignatura;
		System.out.println("Creando el profesor");
	}

	public Profesor() {
		System.out.println("Creando el profesor");
	}

	@Override
	public String saludar() {
		return super.saludar() + "Soy el profesor de la asignatura:" + this.asignatura;
	}	
	
	
	
	

}
