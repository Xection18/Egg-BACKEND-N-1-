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
public class EjercicioN1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        1. Crea una aplicación que le pida dos números al usuario y este pueda
        elegir entre sumar, restar, multiplicar y dividir. La aplicación
        debe tener una función para cada operación matemática y deben
        devolver sus resultados para imprimirlos en el main. 
        */
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese el número a: ");
        int a = leer.nextInt();
        System.out.println("Ingrese el número b: ");
        int b = leer.nextInt();
        System.out.println("Perfecto, ahora debera elegir entre estas opciones: (1-4) ");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        
        int eleccion = leer.nextInt();
        
        switch (eleccion) {
            case 1: 
                int resultadoDeSuma = sumar(a, b);
                System.out.println("La suma entre a y b será de: " + resultadoDeSuma);
                break;
            case 2:
                int resultadoDeResta = restar(a, b);
                System.out.println("La resta entre a y b será de: " + resultadoDeResta);
                break;
            case 3:
                int resultadoDeMultiplicacion = multiplicar(a, b);
                System.out.println("La multiplicación entre a y b será de: " + resultadoDeMultiplicacion);
                break;
            case 4:
                double resultadoDeDivision = dividir(a, b);
                System.out.println("La división entre a y b será de: " + resultadoDeDivision);
                break;
            default:
                System.out.println("Incorrecto, ingrese un número del 1 al 4");
        }
        
    }
    
    public static int sumar(int a, int b) {
        int c = a + b;
        return c;
        
    }
    
    public static int restar(int a, int b) {
        int c = a - b;
        return c;
        
    }
    
    public static int multiplicar(int a, int b) {
        int c = a * b;
        return c;
        
    }
    
    public static double dividir(double a, double b) {
        double c = a / b;
        return c;
        
    }
    
}
