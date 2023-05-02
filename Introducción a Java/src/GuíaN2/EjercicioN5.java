/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GuíaN2;

import java.util.Scanner;

/**
 *
 * @author Xecti
 */
public class EjercicioN5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Escribir un programa que lea un número entero por teclado y muestre 
        por pantalla el doble, el triple y la raíz cuadrada de ese número. 
        Nota: investigar la función Math.sqrt().
        */
        System.out.println("Ingrese un número entero");
        Scanner entrada = new Scanner (System.in);
        double numero = entrada.nextInt();
        double doble = numero * 2;
        double triple = numero * 3;
        double raizCuadrada = Math.sqrt(numero);
        System.out.println("El doble del número es: " + doble + ". El triple es: " + triple + ". La raíz cuadrada es: " + raizCuadrada);
    }
    
}
