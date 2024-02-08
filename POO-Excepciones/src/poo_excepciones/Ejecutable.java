package poo_excepciones;

import javax.swing.JOptionPane;

public class Ejecutable {

	public static void main(String[] args) {
		
		String valor = JOptionPane.showInputDialog("Ingrese un valor numerico");
		
		Calculadora cal = new Calculadora();	
		
		int divisor;
		
		//Utilizo un try catch que me permitira manejar errores de tiempo de ejecucion
		try {
			
			divisor = Integer.parseInt(valor);
			
			int resultado = cal.dividir(10, divisor);
			System.out.println("Resultado: " + resultado);
			
		} catch(NumberFormatException nfe) {
			
			System.out.println("No se pudo realizar la division - Error en conversion de divisor " + nfe.getMessage());
			main(args);
		}
		  catch(ArithmeticException ae) {
			
			System.out.println("No se pudo realizar la division - Error division por cero " + ae.getMessage());
			
		} catch(Exception e) {
			
			System.out.println("No se pudo realizar la division - Exception generica " + e.getMessage());
			
		} finally {
			System.out.println("Finally ejecutado");
		}
		
		System.out.println("Fuera del ambito del catch");
		
	}
}
