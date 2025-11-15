package _5_Clase_Switch;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		/*------------------------------------------------------------
		 * 						SWITCH
		 *------------------------------------------------------------ 
		 *
		 *Se usa para redirigir el codigo dependiendo del valor de una variable
		 * FIJA
		 * */
		
		/*----------------------SINTAXIS----------------------*/
		
		/* switch(variable){
		 * case valor1:
		 * 		Ejecutamos codigo
		 *  	break;
		 * case valor2:
		 *  	Ejecutamos codigo
		 *  	break;
		 *  default:
		 *  	Ejecutamos codigo
		 *	}
		*/
		
		Scanner s=new Scanner(System.in);
		System.out.println("Introduce una nota");
		int nota=s.nextInt();
		switch(nota) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
			System.out.println("Insuficiente");
			break;
		case 5:
			System.out.println("Aprobado (Suficiente)");
			break;
		case 6:
			System.out.println("Aprobado (Bien)");
			break;
		case 7:
			System.out.println("Aprobado (notable bajo)");
			break;
		case 8:
			System.out.println("Aprobado (notable alto)");
			break;
		case 9:
			System.out.println("Aprobado (Sobresaliente)");
			break;
		case 10:
			System.out.println("Aprobado (Matricula de Honor)");
			break;
		default:
			System.out.println("Nota fuera de parametros");
		}
		
		
		
		/* ---------------------------------------------------------------------
		 *                              EJERCICIO
		 * ---------------------------------------------------------------------
		 * Realiza un programa que:
		 * - Pida al usuario un numero
		 * - Muestre por pantalla el dia de la semana al que cooresponda el numero (1 -> Lunes)
		 */
		
		/* ---------------------------------------------------------------------
		 *                              EJERCICIO
		 * ---------------------------------------------------------------------
		 * Realiza un programa que:
		 * - Pida al usuario un caracter
		 * - Muestre por pantalla si es una vocal: a,e,i,o,u
		 */
		
		/* ---------------------------------------------------------------------
		 *                              EJERCICIO
		 * ---------------------------------------------------------------------
		 * Realiza un programa que:
		 * - Muestra una lista de System.out.println() a modo de "menu de opciones" (4)
		 * - Pida al usuario un numero (1-4)
		 * - Muestre un mensaje personalizado para cada opcion
		 */

	}

}
