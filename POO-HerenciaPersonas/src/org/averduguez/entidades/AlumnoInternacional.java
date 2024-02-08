package org.averduguez.entidades;

public class AlumnoInternacional extends Alumno {
	private String pais;
	private Double notaIdiomas;
	

	public AlumnoInternacional(String nombre, String apellido, int edad, String email, String institucion,Double notaMatematica, Double notaHistoria, Double notaCastellano, String pais, Double notaIdiomas) {
		super(nombre, apellido, edad, email, institucion, notaMatematica, notaHistoria, notaCastellano);
		this.pais = pais;
		this.notaIdiomas = notaIdiomas;
	}
	
	
	public AlumnoInternacional() {
		System.out.println("Creando alumno internacional....");
	}


	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public Double getNotaIdiomas() {
		return notaIdiomas;
	}
	public void setNotaIdiomas(Double notaIdiomas) {
		this.notaIdiomas = notaIdiomas;
	}


	@Override
	public String saludar() {
		return super.saludar();
	}


	@Override
	public Double calcularPromedio() {
		return (this.getNotaCastellano() + this.getNotaHistoria() + this.getNotaMatematica() + this.notaIdiomas) / 4;
	}
	
}
