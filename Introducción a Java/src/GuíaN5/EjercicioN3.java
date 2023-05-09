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
public class EjercicioN3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        3. Recorrer un vector de N enteros contabilizando cuántos números
        son de 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).

        */
        Scanner read = new Scanner (System.in);
        
        int contadorDeUnDigitos = 0;
        int contadorDeDosDigitos = 0;
        int contadorDeTresDigitos = 0;
        int contadorDeCuatroDigitos = 0;
        int contadorDeCincoDigitos = 0;
      
        
        System.out.println("Ingrese el largo del arreglo unidimensional: ");
        int tamaño = read.nextInt();
        
        int [] vector = new int [tamaño];
        
        
        for (int i = 0; i < tamaño; i++) {
             vector[i] = (int) (Math.random() * 10000);
             String elemento = String.valueOf(vector[i]);
             int digitos = elemento.length();
            switch (digitos) {
                case 1:
                    contadorDeUnDigitos = contadorDeUnDigitos + 1;
                    break;
                case 2:
                    contadorDeDosDigitos = contadorDeDosDigitos + 1;
                    break;
                case 3:
                    contadorDeTresDigitos = contadorDeTresDigitos + 1;
                    break;
                case 4:
                    contadorDeCuatroDigitos = contadorDeCuatroDigitos + 1;
                    break;
                default:
                    contadorDeCincoDigitos = contadorDeCincoDigitos + 1;
                    break;
            }
             
        }
        
        System.out.println("La cantidad de números con un digitos es de: " + contadorDeUnDigitos);
        System.out.println("La cantidad de números con dos digitos es de: " + contadorDeDosDigitos);
        System.out.println("La cantidad de números con tres digitos es de: " + contadorDeTresDigitos);
        System.out.println("La cantidad de números con cuatro digitos es de: " + contadorDeCuatroDigitos);
        System.out.println("La cantidad de números con cinco digitos es de: " + contadorDeCincoDigitos);
    }
    
}
