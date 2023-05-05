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
public class EjercicioN3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        3. Crea una aplicación que a través de una función nos convierta una
        cantidad de euros introducida por teclado a otra moneda, estas
        pueden ser a dólares, yenes o libras. La función tendrá como
        parámetros, la cantidad de euros y la moneda a convertir que
        será una cadena, este no devolverá ningún valor y mostrará
        un mensaje indicando el cambio (void).
        El cambio de divisas es:
        
        * 0.86 libras es un 1 €
        * 1.28611 $ es un 1 €
        * 129.852 yenes es un 1 €

        */
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese la cantidad de euros que quiere convertir: ");
        int cantidadDeEuros = leer.nextInt();
        System.out.println("Ingrese el tipo de moneda a convertir: (Libra/Dolar/Yenes)");
        String monedaAConvertir = leer.next();
        
        Convertir_EurosEn_(cantidadDeEuros, monedaAConvertir);
        
        
    }
    
    public static void Convertir_EurosEn_(int cantidad, String moneda) {
        if ("Libra".equals(moneda)) {
            double conversion = cantidad * 0.86;
            System.out.println("Su dinero en libras es: " + conversion + " libras");
        }
        else if ("Dolar".equals(moneda)) {
            double conversion = cantidad * 1.28611;
            System.out.println("Su dinero en dolares es: " + conversion + " dolares");
        }
        else if ("Yenes".equals(moneda)) {
            double conversion = cantidad * 129.852;
            System.out.println("Su dinero en yenes es: " + conversion + " yenes");
        }
        else {
            System.out.println("Ingrese una moneda válida");
        }
    }  
}
