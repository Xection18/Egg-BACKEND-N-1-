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
public class EjercicioN3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        3. Escribir un programa que pida una frase y la muestre toda en mayúsculas 
        y después toda en minúsculas. 
        Nota: investigar la función toUpperCase() y toLowerCase() en Java.
        */
        System.err.println("Introduca una frase: ");
        Scanner entrada = new Scanner (System.in);
        String frase = entrada.nextLine();
        frase = frase.toUpperCase();
        System.out.println("Su frase en mayúsculas es: " + frase);
        frase = frase.toLowerCase();
        System.out.println("Su frase en minúsculas es: " + frase);
    }
    
}
