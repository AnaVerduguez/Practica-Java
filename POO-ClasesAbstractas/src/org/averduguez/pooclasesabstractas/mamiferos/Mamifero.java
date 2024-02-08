package org.averduguez.pooclasesabstractas.mamiferos;

public abstract class Mamifero {
	protected String habitat;
	protected Float altura;
	protected Float largo;
	protected Float peso;
	protected String nombreCientifico;
	
	abstract protected String comer();
	abstract protected String dormir();
	abstract protected String correr();
	abstract protected String comunicarse();
	
	public Mamifero(String habitat, Float altura, Float largo, Float peso, String nombreCientifico) {
		super();
		this.habitat = habitat;
		this.altura = altura;
		this.largo = largo;
		this.peso = peso;
		this.nombreCientifico = nombreCientifico;
	}
	public String getHabitat() {
		return habitat;
	}
	public Float getAltura() {
		return altura;
	}
	public Float getLargo() {
		return largo;
	}
	public Float getPeso() {
		return peso;
	}
	public String getNombreCientifico() {
		return nombreCientifico;
	}

}
