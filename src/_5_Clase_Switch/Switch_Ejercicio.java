package _5_Clase_Switch;
import java.util.*;
public class Switch_Ejercicio {

	public static void main(String[] args) {
		/* ---------------------------------------------------------------------
		 *                              EJERCICIO
		 * ---------------------------------------------------------------------
		 * Realiza un programa que:
		 * - Pida al usuario un numero
		 * - Muestre por pantalla el dia de la semana al que corresponda el numero
		 * (1 -> Lunes)
		 */
		Scanner s=new Scanner(System.in);
		System.out.println("Introduce un numero del 1 al 7");
		int numUsuario=s.nextInt();
		switch(numUsuario) {
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miercoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		case 6:
			System.out.println("Sabado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
		default:
			System.out.println("Numero no valido");
		}
		
		/* ---------------------------------------------------------------------
		 *                              EJERCICIO
		 * ---------------------------------------------------------------------
		 * Realiza un programa que:
		 * - Pida al usuario un caracter
		 * - Muestre por pantalla si es una vocal: a,e,i,o,u
		 */
		System.out.println("Introduce un caracter");
		String palabra=s.next();
		char caracter=palabra.charAt(0);
		switch(caracter) {
		case 'a','e','i','o','u':
			System.out.println("Este caracter es una vocal");
		break;
		default:
			System.out.println("Este caracter NO es una vocal");
		}
		
		/* ---------------------------------------------------------------------
		 *                              EJERCICIO
		 * ---------------------------------------------------------------------
		 * Realiza un programa que:
		 * - Muestre una lista de System.out.println() a modo de "Menu de opciones"
		 * - Pida al usuario un numero (1-4)
		 * - Muestre un mensaje personalizado para cada opcion
		 */
		mostrarOpciones();
		int opcion=s.nextInt();
		switch(opcion) {
		case 1:
			System.out.println("Saludo.... Muy Buenas");
			break;
		case 2:
			System.out.println("Despedida... Hasta luego");
			break;
		case 3:
			System.out.println("Saliendo... Hasta Pronto");
			break;
		case 4:
			System.out.println("Estoy saltando...");
			break;
		default:
			System.out.println("Numero no valido");
		}
		
	}

	private static void mostrarOpciones() {
		System.out.println("1.- Saludo");
		System.out.println("2.- Despedida");
		System.out.println("3.- Salida");
		System.out.println("4.- Salto");
	}

}
