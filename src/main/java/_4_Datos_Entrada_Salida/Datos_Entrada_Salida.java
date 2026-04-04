package _4_Datos_Entrada_Salida;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Datos_Entrada_Salida {
    public static void main(String[] args){
        //Entrada
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero: ");
        int numero1 = sc.nextInt();

        System.out.println("Introduce otro numero: ");
        int numero2 = sc.nextInt();

        int suma = numero1 + numero2;

        int resta = numero1 - numero2;

        //Salida
        System.out.println("La suma de los dos numeros es: " + suma);
        System.out.println("La resta de los dos numeros es: " + resta);
    }
}
