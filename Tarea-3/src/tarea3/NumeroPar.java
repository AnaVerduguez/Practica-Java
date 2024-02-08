package tarea3;

import javax.swing.JOptionPane;

public class NumeroPar {

	public static void main(String[] args) {
		//Inicializamos nuestra variable que mostrara un mensaje y almecenara el numero que ingrese el usuario por teclado. 
		int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero para saber si es par o impar:"));
		
		//Condicional ue me permite saber si el numero es par o impar. Si al dividir un número entre 2 y residuo es 0, se dice que el número es par.
		if (numero % 2 == 0) {
			JOptionPane.showMessageDialog(null, "El numero es par");
	    } else {
	    	JOptionPane.showMessageDialog(null, "El numero es impar");   
	    }
	}

}