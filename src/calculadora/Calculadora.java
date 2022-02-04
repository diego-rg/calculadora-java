/**
 * Primer ejercicio en Java
 */
package calculadora;

/**
 * Importamos clase Scanner para recibir datos del usuario por teclado
 */
import java.util.Scanner;

/**
 * @author Diego
 * Caculadora controlada por teclado
 */
public class Calculadora {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Variable opcion donde guardamos la selección del usuario
		 */
		int opcion = 0;
		Scanner sc;
		sc = new Scanner(System.in);
		
		do {

			/**
			 * Sacamos el menú en la consola
			 */
			System.out.println("\n");
			System.out.println("1. Sumar");
			System.out.println("2. Restar");
			System.out.println("3. Multiplicar");
			System.out.println("4. Dividir");
			System.out.println("5. Resto");
			System.out.println("0. Salir");
			System.out.print("Introduzca una opción válida: ");

	}

}
