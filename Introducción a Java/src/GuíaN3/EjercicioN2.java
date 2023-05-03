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
public class EjercicioN2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        2. Crear un programa que pida una frase y si esa frase es igual a “eureka” 
        el programa pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. 
        Nota: investigar la función equals() en Java.
        */
        System.out.println("Ingrese una frase");
        String frase;
        Scanner entrada = new Scanner (System.in);
        frase = entrada.nextLine();
        
        if (frase.equals("Eureka")) {
            System.out.println("Correcto");
        }
        else {
            System.out.println("Incorrecto");
        }
    }
    
}
