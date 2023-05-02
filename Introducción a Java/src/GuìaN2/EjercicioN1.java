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
public class EjercicioN1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        1. Escribir un programa que pida dos números enteros por teclado y 
        calcule la suma de los dos. El programa deberá después mostrar 
        el resultado de la suma
        */
        
        int num1;
        int num2;
        int suma;
        System.out.println("Deberá introducir dos números de tipo entero para realizar una operación aritmética");
        System.out.println("Introduzca el primer número: ");
        Scanner entrada = new Scanner (System.in);
        num1 = entrada.nextInt();
        System.out.println("Ok, ahora debera introducir el segundo número");
        System.out.println("Introduzca el segundo número");
        num2 = entrada.nextInt();
        suma = num1 + num2;
        System.out.println("La suma de los dos números será de: " + suma);
    }
    
}
