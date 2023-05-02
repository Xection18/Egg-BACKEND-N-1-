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
public class EjercicioN2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        2. Escribir un programa que pida tu nombre, lo guarde en una variable y 
        lo muestre por pantalla.
        */
        System.out.println("Introduzca su nombre: ");
        Scanner entrada = new Scanner (System.in);
        String nombre = entrada.nextLine();
        System.out.println("Su nombre es: " + nombre);
    }
    
}
