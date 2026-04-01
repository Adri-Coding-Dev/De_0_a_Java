package _3_Operadores;

public class Operadores {
    public static void main(String[] args){
        // Operadores Aritmeticos
        /*
         *  > < == !=
         *
         *  variable1 > variable2
         *  variable1 < variable2
         *  variable1 == variable2
         *  variable1 != variable2
         */

        String cadena = "Hola";

        boolean longitudPalabraMayorCinco = cadena.length() > 5;

        boolean unoMayorDos = 1 > 2; //false
        boolean dosMayorUno = 2 > 1; //true

        System.out.println(unoMayorDos);
        System.out.println(dosMayorUno);

        /*
         * || -> OR (condicion1 ||(OR) condicion2)
         * && -> AND (condicion1 &&(AND) condicion2)
         */
    }
}
