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
public class EjercicioN2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        2. Diseñe una función que pida el nombre y la edad de N personas e imprima
        los datos de las personas ingresadas por teclado e indique si son
        mayores o menores de edad. Después de cada persona, el programa
        debe preguntarle al usuario si quiere seguir mostrando personas
        y frenar cuando el usuario ingrese la palabra “No”.
        */
       pedirDatosDePersonas();
    }
    
    public static void pedirDatosDePersonas() {
         Scanner leer = new Scanner (System.in);
        String nombre;
        int edad;
        String respuesta;
        
        do {            
            System.out.println("Ingrese el nombre de una persona: ");
            nombre = leer.nextLine();
            System.out.println("Ingrese la edad de esa persona: ");
            edad = leer.nextInt();
            
            if (edad > 18) {
                System.out.println("La persona con nombre " + nombre + " es mayor de 18 años, tiene " + edad);
            }
            else {
                System.out.println("La persona con nombre " + nombre + " no es mayor de 18 años, tiene " + edad);
            }
            
            System.out.println("¿Desea seguir ingresando datos de personas? (Si/No)");
            respuesta = leer.next();
            
        } while (respuesta.equals("Si"));
    }
}
