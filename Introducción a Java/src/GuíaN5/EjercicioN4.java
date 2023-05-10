/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GuíaN5;

/**
 *
 * @author Xecti
 */
public class EjercicioN4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        4. Realizar un programa que rellene un matriz de 4 x 4 de valores
        aleatorios y muestre la traspuesta de la matriz. La matriz
        traspuesta de una matriz A se denota por B y se obtiene
        cambiando sus filas por columnas (o viceversa).

        */
        int [][] matrizOriginal = new int [4][4];
        int [][] matrizTranspuesta = new int [4][4];
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizOriginal[i][j] = (int) (Math.random() * 10);
            }
        }
        
        System.out.println("MATRIZ ORIGINAL");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("[" + matrizOriginal[i][j] + "]");
            }
            System.out.println("");
        }
        
        System.out.println("MATRIZ TRANSPUESTA: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("[" + matrizOriginal[j][i] + "]");
            }
            System.out.println("");
        }
    }
    
}
