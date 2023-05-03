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
public class EjercicioN5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        5. Escriba un programa en el cual se ingrese un valor límite 
        positivo, y a continuación solicite números al usuario hasta
        que la suma de los números introducidos supere el límite inicial.
        */
        Scanner entrada = new Scanner (System.in);
        System.out.println("Ingrese un valor limite para la suma: ");
        int valor = entrada.nextInt();
        int suma = 0;
        int numero;
        
        do {
            System.out.println("Ingrese un número: ");
            numero = entrada.nextInt();
            suma = suma + numero;
        } while (suma != valor);
        
        System.out.println("El valor de la suma es: " + suma);
    }
    
}
