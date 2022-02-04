/**
 * Primer ejercicio en Java
 */
package calculadora;

/**
 * Importamos clase Scanner para recibir datos del usuario por teclado
 */
import java.util.Scanner;

/**
 * @author Diego Caculadora controlada por teclado
 */
/**
 * @author Diego
 *
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

			/**
			 * Recogemos el input del usuario (String) y lo transformamos en integer
			 */
			opcion = Integer.parseInt(sc.nextLine());

			/**
			 * Comprobamos el valor de opcion: si es menor a 0 o mayor a 5 no será válida.
			 * Si está dentro de nuestros valores (0 a 5), solicitamos los siguientes datos
			 */
			if (opcion < 0 || opcion > 5) {
				System.out.println("Opción no válida. Inténtelo de nuevo");
			} else if (opcion != 0) {
				System.out.println("\n");

				float operando1, operando2;

				System.out.print("Introduzca el primer operando: ");
				operando1 = Float.parseFloat(sc.nextLine());

				System.out.print("Introduzca el segundo operando: ");
				operando2 = Float.parseFloat(sc.nextLine());

				System.out.println("\n");
				switch (opcion) {

				case 1: // Suma
					System.out.println("El resultado de la suma es " + (operando1 + operando2));
					break;
				case 2: // Resta
					System.out.println("El resultado de la resta es " + (operando1 - operando2));
					break;
				case 3: // Multiplicación
					System.out.println("El resultado de la multiplicación es " + (operando1 * operando2));
					break;
				case 4: // División
					System.out.println("El resultado de la división es " + (operando1 / operando2));
					break;
				case 5: // Resto
					System.out.println("El resto de dividir " + operando1 + " entre " + operando2 + " es " + (operando1 % operando2));
					break;
				}
			}

		} while (opcion != 0);
		
		sc.close();

		System.out.println("Finalizando la ejecución de la calculadora");
	}
}