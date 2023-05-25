/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GuíaN5;

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
        5. Realice un programa que compruebe si una matriz dada es antisimétrica.
        Se dice que una matriz A es antisimétrica cuando ésta es igual a su
        propia traspuesta, pero cambiada de signo. Es decir, A es antisimétrica
        si A = -AT. La matriz traspuesta de una matriz A se denota por AT y se
        obtiene cambiando sus filas por columnas (o viceversa).

        */
        Scanner read = new Scanner (System.in);
     
        int [][] matriz = {{0, -2, 4}, {2, 0, 2}, {-4, -2, 0}};
        System.out.println(esAntisimetricaLaMatriz_(matriz));
    }
    
    public static boolean esAntisimetricaLaMatriz_(int [][] matrizAVerificar) {
        boolean bandera = true;
        for (int i = 0; i < matrizAVerificar.length; i++) {
            for (int j = 0; j < matrizAVerificar.length; j++) {
                if (matrizAVerificar[i][j] != -matrizAVerificar[j][i]) {
                    bandera = false;
                    break;
                }
            }
            if (!bandera) break;
           
        }
        return bandera;
        
    }
}
