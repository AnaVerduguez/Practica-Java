package ejerciciosclases;

import javax.swing.JOptionPane;

public class MetodoJOptionPane {
	public static void main(String[] args) {
		
		//Inicializo mis variables para poder utilizarlas
		String nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre:");
		String apellido = JOptionPane.showInputDialog(null, "Ingrese su apellido:");
		String lugarDeResidencia = JOptionPane.showInputDialog(null, "Ingrese su lugar de residencia:");
		int edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su edad:"));
		
		//Imprimo por pantalla los resultados ingresados por el usuario
		JOptionPane.showMessageDialog(null,"Tu nombre es: " + nombre + "\nTu apellido es: " + apellido + "\nTu edad es: " + edad + "\nTu lugar de residencia es: " + lugarDeResidencia);  //Concateno y hago saltos de linea para tener los resultados ordenados
	}

}
