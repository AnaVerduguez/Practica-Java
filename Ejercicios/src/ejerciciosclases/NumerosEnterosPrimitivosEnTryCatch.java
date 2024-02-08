package ejerciciosclases;

public class NumerosEnterosPrimitivosEnTryCatch {

	public static void main(String[] args) {
		
		String numeroStr= "";
		
		//Metodo que me permite detectar un error sin la caida del codigo entero. Se ejecuta cuando hay una excepcion y es capturada por el catch. 
		try {
			
			int numeroInt= 10;
			
		} catch(Exception excepcionCapturada) {
			System.out.println("Error al ejecutar la aplicacion:" + excepcionCapturada); //Mensaje de error 
			
		}

	}

}
