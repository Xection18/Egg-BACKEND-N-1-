/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GuíaN5;

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
        2. Realizar un algoritmo que llene un vector de tamaño N con valores 
        aleatorios y le pida al usuario un número a buscar en el vector.
        El programa mostrará dónde se encuentra el numero y si se
        encuentra repetido.s

        */
        Scanner read = new Scanner (System.in);
        System.out.println("Ingrese el número a buscar dentro del arreglo de una dimensión: ");
        int numero = read.nextInt();
        int [] vector;
        vector = new int[10];
        
        int contador = 0;
        int posicion = 0;
        
        for (int i = 0; i < 10; i++) {
            vector[i] = (int) (Math.random() * 10);
            if (vector[i] == numero) {
                if (contador == 0) {
                    posicion = i;
                }
                contador = contador + 1;
            }
        }
        
        if (contador == 0) {
            System.out.println("No fue posible encontrar su número dentro del arreglo, intente de nuevo más tarde.");
        }
        else {
            System.out.println("La posición del número que usted elegió dentro del arreglo de una dimensión es " + posicion + " y el numero se encontro repetido un total de " + contador );
        }
    }
    
}
