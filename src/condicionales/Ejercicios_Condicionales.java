package condicionales;

import java.util.*;

public class Ejercicios_Condicionales {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		/* ---------------------------------------------------------------------
		 *                              EJERCICIO
		 * ---------------------------------------------------------------------
		 * Realiza un programa que:
		 * - Pida al usuario un numero
		 * - Muestre por pantalla si el numero es multiplo de 3
		 */
		System.out.println("Introduce un número:");
		int numMulti3=s.nextInt();
		if(numMulti3%3==0) {
			System.out.println("Tu número es Multiplo de 3");
		}else {
			System.out.println("No es un Múltipplo de 3");
		}
		
		/* ---------------------------------------------------------------------
		 *                              EJERCICIO
		 * ---------------------------------------------------------------------
		 * Realiza un ejercicio que:
		 * - Pida al usuario dos numeros
		 * - Muestre por pantalla cual de los dos numeros es mayor
		 */
		System.out.println("Introduce un número:");
		int num1=s.nextInt();
		System.out.println("Introduce otro número:");
		int num2=s.nextInt();
		if(num1>num2) {
			System.out.println("El numero mayor es el primer numero: "+num1);
		}else if(num2>num1){
			System.out.println("El numero mayor es el segundo numero: "+num2);
		}else {
			System.out.println("Ambos numeros son iguales");
		}
		
		/* ---------------------------------------------------------------------
		 *                              EJERCICIO
		 * ---------------------------------------------------------------------
		 * Realiza un ejericio que:
		 * - Pida al usuario tres numeros:
		 * - Muestre por pantalla el numero mas grande de los tres
		 */
		System.out.println("Introduce un número:");
		int num1Usuario=s.nextInt();
		System.out.println("Introduce otro número:");
		int num2Usuario=s.nextInt();
		System.out.println("Introduce otro número:");
		int num3Usuario=s.nextInt();
		
		if(num1Usuario>num2Usuario && num1Usuario>num3Usuario) {
			System.out.println("Numero mas grande es el primer numero: "+num1Usuario);
		}else if(num2Usuario>num1Usuario && num2Usuario>num3Usuario) {
			System.out.println("Numero mas grande es el segundo numero: "+num2Usuario);
		}else if(num3Usuario>num1Usuario && num3Usuario>num2Usuario) {
			System.out.println("Numero mas grande es el tercer numero: "+num3Usuario);
		}else {
			System.out.println("Algunos de los tres numeros son iguales");
		}
		
	}

}
