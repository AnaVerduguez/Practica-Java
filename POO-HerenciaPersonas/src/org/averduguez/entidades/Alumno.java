package org.averduguez.entidades;

public class Alumno extends Persona{
	private String institucion;
	private Double notaMatematica;
	private Double notaHistoria;
	private Double notaCastellano;
	
	
	public Alumno(){
	       System.out.println("Alumno: inicializando constructor...");
	}
	
	
	public Alumno(String nombre, String apellido, int edad, String email, String institucion, Double notaMatematica,Double notaHistoria, Double notaCastellano) {
		super(nombre, apellido, edad, email);
		this.institucion = institucion;
		this.notaMatematica = notaMatematica;
		this.notaHistoria = notaHistoria;
		this.notaCastellano = notaCastellano;
	}
	
	
	public String getInstitucion() {
		return institucion;
	}
	public void setInstitucion(String institucion) {
		this.institucion = institucion;
	}
	public Double getNotaMatematica() {
		return notaMatematica;
	}
	public void setNotaMatematica(Double notaMatematica) {
		this.notaMatematica = notaMatematica;
	}
	public Double getNotaHistoria() {
		return notaHistoria;
	}
	public void setNotaHistoria(Double notaHistoria) {
		this.notaHistoria = notaHistoria;
	}
	public Double getNotaCastellano() {
		return notaCastellano;
	}
	public void setNotaCastellano(Double notaCastellano) {
		this.notaCastellano = notaCastellano;
	}


	@Override
	public String saludar() {
		String saludoPadre = super.saludar();
		return saludoPadre + "Soy el alumno de la instucion:" + this.institucion;
	}
	
	public Double calcularPromedio() {
		return (this.notaCastellano + this.notaHistoria + this.notaMatematica) / 3 ;
	}


	@Override
	public String toString() {
		return super.toString() +
				 "\ninstitucion='" + this.institucion + '\'' +
	                ", notaMatematica=" + this.notaMatematica +
	                ", notaCastellano=" + this.notaCastellano +
	                ", notaHistoria=" + this.notaHistoria +
	                ", promedio=" + this.calcularPromedio();
	}
}
