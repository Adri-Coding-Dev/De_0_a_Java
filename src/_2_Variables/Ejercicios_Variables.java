package _2_Variables;

public class Ejercicios_Variables {

	public static void main(String[] args) {


		/* ---------------------------------------------------------------------
		 *                              EJERCICIO
		 * ---------------------------------------------------------------------
		 * Declara una variable para:
		 * - Edad del usuario (entero)
		 * - Altura del usuario (decimal)
		 * - Nombre del usuario (cadena de texto)
		 * Luego, muestra todos los valores por pantalla.
		 */

		System.out.println("------------------------------------");
		System.out.println("EJERCICIO");
		System.out.println("------------------------------------");

		int edad = 18;
		double altura = 1.75;
		String nombre = "Adrián";

		// Método 1: Mostrar valores individualmente
		System.out.println(edad);
		System.out.println(altura);
		System.out.println(nombre);

		// Método 2: Mostrar todo en una sola línea
		System.out.println("Edad: " + edad + " | Altura: " + altura + " | Nombre: " + nombre);

		System.out.println("------------------------------------");
	}

}
