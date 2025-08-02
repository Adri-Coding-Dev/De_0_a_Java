package operadores_aritmeticos;

import java.util.Scanner;

public class Operadores {

	public static void main(String[] args) {
		
		/* ---------------------------------------------------------------------
		 *                        INTRODUCCIÓN AL SCANNER
		 * ---------------------------------------------------------------------
		 * El Scanner es una clase que permite leer datos introducidos 
		 * por el usuario desde el teclado.
		 * 
		 * Ejemplo de uso:
		 * Scanner s = new Scanner(System.in);
		 * int edad = s.nextInt();  // lee un número entero
		 * String nombre = s.nextLine();  // lee una cadena de texto
		 */
		Scanner s = new Scanner(System.in);
		
		/* ---------------------------------------------------------------------
		 *                    OPERADORES ARITMÉTICOS BÁSICOS
		 * ---------------------------------------------------------------------
		 * Vamos a trabajar con dos variables para realizar operaciones:
		 * - Suma
		 * - Resta
		 * - Multiplicación
		 * - División
		 * - Módulo (resto de una división)
		 */
		
		int n1 = 12;
		int n2 = 3;

		// SUMA
		System.out.println("Suma: " + (n1 + n2));
		int suma = n1 + n2;
		System.out.println("Suma guardada: " + suma);

		// RESTA
		System.out.println("\nResta: " + (n1 - n2));
		int resta = n1 - n2;
		System.out.println("Resta guardada: " + resta);

		// MULTIPLICACIÓN
		System.out.println("\nMultiplicación: " + (n1 * n2));
		int multi = n1 * n2;
		System.out.println("Multiplicación guardada: " + multi);

		// DIVISIÓN
		System.out.println("\nDivisión: " + (n1 / n2)); // Resultado entero
		double division = n1 / n2; // Resultado truncado como entero
		System.out.println("División como double (sin casteo): " + division);
		double div2 = (double) n1 / n2; // Casteo para obtener decimales reales
		System.out.println("División con casteo (real): " + div2);

		// MÓDULO
		System.out.println("\nMódulo (resto): " + (n1 % n2));
		int modulo = n1 % n2;
		System.out.println("Módulo guardado: " + modulo);
		

		/* ---------------------------------------------------------------------
		 *                        EJERCICIO GUIADO
		 * ---------------------------------------------------------------------
		 * El usuario ingresa una cantidad de centímetros y el programa 
		 * debe mostrar la cantidad equivalente en metros (con decimales).
		 */

		System.out.println("\nEJERCICIO GUIADO");
		System.out.println("-------------------------------------");

		int centimetros = 175;
		System.out.println("Centímetros: " + centimetros);

		double metros = centimetros / 100; // División entera
		int resto = centimetros % 100;
		double restoDecimal = (double) resto / 100;

		System.out.println("Conversión total en metros: " + (metros + restoDecimal));

		System.out.println("-------------------------------------");

		
		/* ---------------------------------------------------------------------
		 *                        EJERCICIOS PROPUESTOS: 1
		 * ---------------------------------------------------------------------
		 * 
		 * Realiza un programa que:
		 * - Pida al usuario introducir una cantidad de euros
		 * - Muestre en pantalla la conversion con los dolares
		 * 
		 *                    RECUERDA QUE:
		 * 1 euro es equivalente a 1.1 dolares (Para la conversion)
		 */
		
		/* ---------------------------------------------------------------------
		 *                        EJERCICIOS PROPUESTOS: 2
		 * ---------------------------------------------------------------------
		 * 
		 * Realiza un programa que:
		 * - Pida al usuario introducir una cantidad de minutos
		 * - Muestre en pantalla la conversion en horas (con sus decimales)
		 * 
		 *                     EJEMPLO
		 * 130 Minutos =2.10 Horas
		 */

		/* ---------------------------------------------------------------------
		 *                        EJERCICIOS PROPUESTOS: 3
		 * ---------------------------------------------------------------------
		 * 
		 * Realiza un programa que:
		 * - Pida al usuario introducir una base y una altura para un triangulo
		 * - Pida al usuario introducir un radio para un circulo
		 * - Pida al usuario introducir una base y una altura para un Rectangulo
		 * - Muestra por pantalla el area de las tres figuras geometricas
		 * 
		 *                    PISTA:
		 * Investiga en la libreria MATH por si acaso hay alguna funcion que te
		 * permita acceder al valor de PI
		 */

		// Cerramos el Scanner para evitar fugas de memoria
		s.close();
	}
}
