package operadores_aritmeticos;

import java.util.Scanner;

public class Ejercicios_Operadores {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
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
		
		System.out.println("Introduce la cantidad de euros:");
		int euros = s.nextInt();
		System.out.println("Euros introducidos: " + euros);
		double dolares = euros * 1.1;
		System.out.println("Cambio a dólares (1€ = 1.1$): " + dolares);
		
		/* ---------------------------------------------------------------------
		 *                        EJERCICIOS PROPUESTOS: 2
		 * ---------------------------------------------------------------------
		 * 
		 * Realiza un programa que:
		 * - Pida al usuario introducir una cantidad de minutos
		 * - Muestre en pantalla la conversion en horas (con sus decimales)
		 * 
		 *                     EJEMPLO
		 * 130 Minutos =2.17 Horas
		 */

		System.out.println("Introduce la cantidad de minutos totales:");
		int minutos = s.nextInt();

		double horas = minutos / 60; // División entera
		int minutosRestantes = minutos % 60;
		double conversionFinal = horas + ((double) minutosRestantes / 60);

		System.out.println("Conversión a horas: " + conversionFinal);
		
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
		
		// Triángulo
				System.out.println("\nIntroduce la base del triángulo:");
				double baseTri = s.nextDouble();
				System.out.println("Introduce la altura del triángulo:");
				double altTri = s.nextDouble();
				double areaTri = (baseTri * altTri) / 2;
				System.out.println("Área del triángulo: " + areaTri);

				// Círculo
				System.out.println("\nIntroduce el radio del círculo:");
				double radioCirc = s.nextDouble();
				double PI = Math.PI;
				double areaCirc = (PI * Math.pow(radioCirc, 2)) / 2; // dividimos entre 2 como ejemplo
				System.out.println("Área del círculo: " + areaCirc);

				// Rectángulo
				System.out.println("\nIntroduce la base del rectángulo:");
				double baseRect = s.nextDouble();
				System.out.println("Introduce la altura del rectángulo:");
				double altRect = s.nextDouble();
				double areaRect = baseRect * altRect;
				System.out.println("Área del rectángulo: " + areaRect);
		s.close();
	}

}
