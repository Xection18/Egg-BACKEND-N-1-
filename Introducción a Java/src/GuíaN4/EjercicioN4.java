/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GuíaN4;

import java.util.Scanner;

/**
 *
 * @author Xecti
 */
public class EjercicioN4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        4. Crea una aplicación que nos pida un número por teclado y con una
        función se lo pasamos por parámetro para que nos indique si es o
        no un número primo, debe devolver true si es primo, sino false.
        Un número primo es aquel que solo puede dividirse entre 1 y sí
        mismo. Por ejemplo: 25 no es primo, ya que 25 es divisible
        entre 5, sin embargo, 17 si es primo.

        ¿Qué son los números primos?
        Básicamente, un número primo es un número natural que tiene solo dos
        divisores o factores: 1 y el mismo número. Es decir, es primo aquel
        número que se puede dividir por uno y por el mismo número.
        El primer número primo es 2, y hay 25 números primos 
        entre 1 y 100, ellos son: 2, 3, 5, 7, 11, 13, 17,
        19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67,
        71, 73, 79, 83, 89 y 97.
 
        */
        Scanner leer = new Scanner (System.in);
        int numero = 0;
        
        while (numero <= 0) {
            System.out.println("Ingrese un número natural mayor al cero: ");
            numero = leer.nextInt();
        }
        
        boolean resultado = esPrimoElNumero_(numero);
        
        if (resultado == true) {
            System.out.println("El resultado es VERDADERO");
        }
        else {
            System.out.println("El resutlado es FALSO");
        }
    }
    
    public static boolean esPrimoElNumero_(int numero) {
        boolean esUnNumeroNaturalMayorOIgualADos = numero >= 2;
        boolean esDivisibleEntreSiMismo = numero % numero == 0;
        boolean esDivisibleEntreUno = numero / 1 == numero;
        
        int contadorDeDivisores = 0;
        for (int i = numero; i >= 1; i-- ) {
            
            if (esDivisible_PorElNumero_(numero, i)) {
                contadorDeDivisores = contadorDeDivisores + 1;
            }
        }
        
        if (esUnNumeroNaturalMayorOIgualADos) {
            if (esDivisibleEntreSiMismo && esDivisibleEntreUno) {
                if (contadorDeDivisores == 2) {
                    return true;
                }
            }
        }
       
        return false;
    }
    
    public static boolean esDivisible_PorElNumero_(int dividendo, int divisor) {
        boolean esDivisible = dividendo % divisor == 0;
        return esDivisible;
    }
}
