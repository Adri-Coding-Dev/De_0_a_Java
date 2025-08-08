package condicionales;

public class Condicionales {

	public static void main(String[] args) {
		/*------------------------------------------------------------
		 * 						CONDICIONALES
		 *------------------------------------------------------------ 
		 *
		 *Son flujos de codigo que hacen que se realiza cierta accion 
		 *dependiendo de la condicion que se cumpla
		 * */
		
		
		// Sentecia if: Se utuliza para realizar algo si se cumple una condicion
		
		/*----------------------SINTAXIS----------------------*/
		
		/* if(condicion) {
			ejecuta codigo
		}*/
		boolean suscribirse=true;
		if(suscribirse=true) {
			System.out.println("Gracias por estar suscrito");
		}
		
		// Sentencia if-else: Se utiliza para realizar algo si se cumple una 
		//condicion. y otra accion en caso de que no se cumpla
		
		/*----------------------SINTAXIS----------------------*/
		/*if(condicion){
		 	Ejecutamos codigo
		 }else{
		 	//Ejectuamos codigo
		 }*/
		
		if(suscribirse=true) {
			System.out.println("Gracias por estar suscrito");
		}else {
			System.out.println("Suscribete a mi canal, que no lo estas");
		}
		
		//Sentencia if-elseif: Es una anidacion de condiciones en caso de que 
		//una variable no cumpla la condicion anterior
		
		/*----------------------SINTAXIS----------------------*/
		/*if(condicion){
		 	Ejecutamos codigo
		 }else if(condicion){
		 	Ejecutamos codigo
		 }else{
		 	Ejecutamos codigo
		 }*/
		
		int edad=10;
		if(edad==3) {
			System.out.println("La edad es 3");
		}else if(edad==6) {
			System.out.println("La edad es 6");
		}else if(edad==10) {
			System.out.println("La edad es 10");
		}
		
		/*------------------------------------------------------------
		 * 				OPERADORES DE COMPARACION
		 *------------------------------------------------------------ 
		 *
		 *Son signos de operacion que usamos para comparar variables
		 * */
		
		// TIPOS
		/*
		 * ==  IGUALACION: Verificamos si el valor de una variables es igual a otro
		 * 
		 * !=  NO IGUALACION: Verificamos si el valor de una varibales es diferente 
		 *     a otro
		 * >   MAYOR QUE: Verificamos si el valor de una variable es mayor a otro
		 * 
		 * <   MENOR QUE: Verificamos si el valor de una variable es menor a otro
		 * 
		 * >=  MAYOR O IGUAL: Verificamos si el valor de una variable es mayor o 
		 *     igual a otro
		 *     
		 * <=  MENOR O IGUAL: Verificamos si el valor de una variable es menor o 
		 *     igual a otro
		 * */
		
		// EJEMPLOS
		
		//Verificamos si un numero es positivo o negativo
		int numero=6;
		
		if(numero>=0) {
			System.out.println("Numero Positivo");
		}else {
			System.out.println("Numero Negativo");
		}
		
				
		//Verificar la nota que tiene un alumno/a
		
		int nota=8;
		if(nota>=9) {
			System.out.println("Sobresaliente");
		}else if(nota>=7) {
			System.out.println("Notable");
		}else if(nota>=5) {
			System.out.println("Aprobado");
		}else {
			System.out.println("Suspenso");
		}
		
		
		/*------------------------------------------------------------
		 * 				OPERADORES DE COMPARACION
		 *------------------------------------------------------------ 
		 *
		 *Son signos que usamos cuando queremos verificar mas de una condicion
		 * */
		
		// TIPOS
		
		/*
		 * &&  AND: La usamos cuando queremos verificar si se cumple mas de una 
		 *          condicion, todas las condiciones puestas con este signo se deben
		 *          cumplir
		 *          
		 * ||  OR: La usamos cuando queremos verificar si se cumple una u otra 
		 *         condicion, con que alguna de las condiciones se cumpla, entraremos
		 *         a la condicion
		 * /
		
	    /* ---------------------------------------------------------------------
		 *                              EJERCICIO
		 * ---------------------------------------------------------------------
		 * Realiza un programa que:
		 * - Pida al usuario un numero
		 * - Muestre por pantalla si el numero es multiplo de 3
		 */
		
		/* ---------------------------------------------------------------------
		 *                              EJERCICIO
		 * ---------------------------------------------------------------------
		 * Realiza un ejercicio que:
		 * - Pida al usuario dos numeros
		 * - Muestre por pantalla cual de los dos numeros es mayor
		 */
		
		/* ---------------------------------------------------------------------
		 *                              EJERCICIO
		 * ---------------------------------------------------------------------
		 * Realiza un ejericio que:
		 * - Pida al usuario tres numeros:
		 * - Muestre por pantalla el numero mas grande de los tres
		 */
	}
}
