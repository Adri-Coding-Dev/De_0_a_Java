package variables;

public class Variables {

	public static void main(String[] args) {
		
		/* ---------------------------------------------------------------------
		 *                        VARIABLES PRIMITIVAS
		 * ---------------------------------------------------------------------
		 * 
		 * Tipos de datos simples que almacenan valores directamente en memoria.
		 * Incluyen números, caracteres y booleanos.
		 */
		
		// Entero (int): Almacena números enteros, positivos o negativos
		System.out.println("Número Entero:");
		int numUsuario = 12;
		System.out.println(numUsuario);

		// Doble (double): Almacena números decimales (mayor precisión que float)
		System.out.println("Número Doble:");
		double numDoble = -2.0;
		System.out.println(numDoble);

		// Flotante (float): Almacena números decimales (menos preciso que double)
		System.out.println("Número Flotante:");
		float PI = 3.14f; // Nota: se recomienda usar 'f' al final
		System.out.println(PI);

		// Booleano (boolean): Solo puede ser true o false
		System.out.println("Variable Booleana:");
		boolean salirDelPrograma = false;
		System.out.println(salirDelPrograma);

		// Largo (long): Enteros muy grandes (más capacidad que int)
		System.out.println("Número Largo:");
		long numeroLargo = 999_999_999L; // se recomienda usar 'L' al final
		System.out.println(numeroLargo);

		// Carácter (char): Almacena un solo carácter
		System.out.println("Carácter:");
		char letra = 'b';
		System.out.println(letra);

		
		/* ---------------------------------------------------------------------
		 *                        VARIABLES COMPLEJAS
		 * ---------------------------------------------------------------------
		 * Tipos de datos que pueden almacenar colecciones o estructuras
		 * más complejas, como textos o listas.
		 */

		// Cadena de texto (String)
		System.out.println("Cadena de Texto:");
		String saludo = "Hello World";
		System.out.println(saludo);
		
		// Otras variables complejas que veremos más adelante:
		/*
		 * - Arrays (unidimensionales y bidimensionales)
		 * - Listas (ArrayList, LinkedList)
		 * - HashMap / Mapas
		 * - Objetos personalizados (clases)
		 */
		
		
		/* ---------------------------------------------------------------------
		 *                              EJERCICIO
		 * ---------------------------------------------------------------------
		 * Declara una variable para:
		 * - Edad del usuario (entero)
		 * - Altura del usuario (decimal)
		 * - Nombre del usuario (cadena de texto)
		 * Luego, muestra todos los valores por pantalla.
		 */
	}
}
