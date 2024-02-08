package org.averduguez.pooclasesabstractas.felinos;

import org.averduguez.pooclasesabstractas.mamiferos.Mamifero;

public abstract class Felino extends Mamifero{
	
	public Felino(String habitat, Float altura, Float largo, Float peso, String nombreCientifico) {
		super(habitat, altura, largo, peso, nombreCientifico);
	}
	
	
	public Felino(String habitat, Float altura, Float largo, Float peso, String nombreCientifico, Float tamanioGarras,int velocidad) {
		super(habitat, altura, largo, peso, nombreCientifico);
		this.tamanioGarras = tamanioGarras;
		this.velocidad = velocidad;
	}


	protected Float tamanioGarras;
	protected int velocidad;
	
	public Float getTamanioGarras() {
		return tamanioGarras;
	}

	public int getVelocidad() {
		return velocidad;
	}

}
