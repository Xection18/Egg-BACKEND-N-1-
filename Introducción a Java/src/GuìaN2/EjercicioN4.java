/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GuìaN2;

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
        4. Dada una cantidad de grados centígrados se debe mostrar su equivalente
        en grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
        */
        System.out.println("Ingrese los grados centígrados a convertir: ");
        Scanner entrada = new Scanner (System.in);
        int celcius = entrada.nextInt();
        int fahrenheit = 32 + ( 9 * celcius / 5);
        System.out.println("La conversión de celcius a fahrenheit es de: " + fahrenheit);
    }
    
}
