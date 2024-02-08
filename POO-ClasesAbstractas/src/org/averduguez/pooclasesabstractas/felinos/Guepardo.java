package org.averduguez.pooclasesabstractas.felinos;

public class Guepardo extends Felino {


    public Guepardo(String habitat, Float altura, Float largo, Float peso, String nombreCientifico, Float tamanioGarras,int velocidad) {
		super(habitat, altura, largo, peso, nombreCientifico, tamanioGarras, velocidad);
	}

	@Override
    public String comer() {
        return "El Guepardo caza junto a su grupo en las llanuras africanas pero con un mordida mucho inferior a los demas felinos grandes.";
    }

    @Override
    public String dormir() {
        return "El Guepardo duerme en las estepas africanas";
    }

    @Override
    public String correr() {
        return "El Guepardo es el felino mas rapido del mundo, corre a " + velocidad + " km/hr";
    }

    @Override
    public String comunicarse() {
        return "El Guepardo ruge pero no tan fuerte como el Leon";
    }
}
