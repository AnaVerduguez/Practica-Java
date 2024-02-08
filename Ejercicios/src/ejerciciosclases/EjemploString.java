package ejerciciosclases;

public class EjemploString {
	
	public static void main(String[] args) {
		
		String stringUno = "Curso Java";  //Cadena de caracteres
		String stringDos = new String("Curso Java"); //Clase objeto
			
		int entero = 1; 
		
		System.out.println("String stringUno = " + stringUno); //Ambos se imprimen de igual manera
		System.out.println("String stringDos = " + stringDos);
		
		
		//METODOS DE STRING
		
		//LENGTH: Cantidad de caracteres
		int largoDeCadena= stringUno.length(); //En caso de que quiera manipular el resultado lo almaceno en una variable
		System.out.println("Largo del StringUno = " + stringUno.length());//Largo del String -> formato entero
		
		//EQUALS: Compara la cadena de caracteres
		boolean sonIgualesEquals = stringUno.equals(stringDos); 
		System.out.println("Son iguales? == " + sonIgualesEquals);
		
		//EQUALS IGNORE CASE: Pasa por alto mayusculas y miniculas
		boolean sonIgualesEqualsIgnoreCase = stringUno.equalsIgnoreCase(stringDos); //Comparo la cadena de caracteres 
		System.out.println("Son iguales ahora? == " + sonIgualesEqualsIgnoreCase);
		
		//CHAR: Se obtiene el caracter de esa posicion
		char caracter = stringUno.charAt(3);
		System.out.println("Caracter en el indice 3 =" + caracter);
		
		//CONCAT: Concatena las dos cadenas de Strings
		String nombre= "Ana";
		String apellido = "Verduguez";
		System.out.println("Nombre completo = " + nombre.concat(apellido) ); 
		
		//CONTAINS: Busca si adentro de la cadena aparece cierta palabra
		boolean contiene = nombre.contains("na"); //Busca si parece la cadena "dro"
		System.out.println("Contiene la cadena na?  = " + contiene); 
		
		//STARTSWITH y ENDSWITH: Saber si comienza o si termina con cierta letra
		nombre.startsWith("A"); //Si no comienza con A devuelve false
		nombre.endsWith("o"); //Si no termina con o devuelve false
		
		
		
		//Un objeto nulo no hace referencia a nada
		String nombreSecundario= null; 
		
		//System.out.println("Concatenacion de objeto String null = " + nombreSecundario.concat(stringDos)); //Se ejecuta erroneamente y finaliza de manera brusca
		
		//Evito utilizar una variable con valor NULL. 
		if(nombreSecundario != null) { //Comparo si es nulo o no
			System.out.println("Concatenacion de objeto String null");
		}else {
			System.out.println("Es null");//Es un valor fijo. Hay codigo muerto
		}

	}

}
