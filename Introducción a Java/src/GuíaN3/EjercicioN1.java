/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GuíaN3;

import java.util.Scanner;

/**
 *
 * @author Xection
 */
public class EjercicioN1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        1. Crear un programa que dado un número determine si es par o impar
        */
        System.out.println("Ingrese un número");
        Scanner entrada = new Scanner (System.in);
        int numero;
        numero = entrada.nextInt();
        if (numero % 2 == 0) {
            System.out.println("Su número es par");
        }
        else {
            System.out.println("Su número es impar");
        }
    }
    
}
