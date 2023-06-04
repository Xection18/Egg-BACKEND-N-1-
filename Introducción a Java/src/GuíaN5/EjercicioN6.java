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
public class EjercicioN6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        6. Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1
        al 9 donde la suma de sus filas, sus columnas y sus diagonales son
        idénticas. Crear un programa que permita introducir un cuadrado por
        teclado y determine si este cuadrado es mágico o no. El programa
        deberá comprobar que los números introducidos son
        correctos, es decir, están entre el 1 y el 9.

        */
        
        
        int [][] matriz = new int [3][3];
        
        LlenarMatriz_(matriz);
        VerificarSiLaMatriz_EsMágica(matriz);
    }
    
    
    public static void LlenarMatriz_(int matrizARellenar[][]) {
        Scanner scan = new Scanner (System.in);
        int numero = 0;
        
        for (int i = 0; i < matrizARellenar.length; i++) {
            for (int j = 0; j < matrizARellenar.length; j++) {
                do {
                    System.out.println("Ingrese un número del 1 al 9");
                    numero = scan.nextInt();
                    matrizARellenar[i][j] = numero;
                    if (numero < 1 || numero > 10) {
                        System.out.println("Debe ingresar números del 1 al 9");
                    }
                } while (numero < 1 || numero > 10);
            }
            System.out.println("Siguiente fila");
        }
    }
    
    public static void VerificarSiLaMatriz_EsMágica(int matrizAVerificar[][]) {
        int filaNumeroUno = matrizAVerificar[0][0] + matrizAVerificar[0][1] + matrizAVerificar[0][2];
        int filaNumeroDos = matrizAVerificar[1][0] + matrizAVerificar[1][1] + matrizAVerificar[1][2];
        int filaNumeroTres = matrizAVerificar[2][0] + matrizAVerificar[2][1] + matrizAVerificar[2][2];
        
        int columnaNumeroUno = matrizAVerificar[0][0] + matrizAVerificar[1][0] + matrizAVerificar[2][0];
        int columnaNumeroDos = matrizAVerificar[0][1] + matrizAVerificar[1][1] + matrizAVerificar[2][1];
        int columnaNumeroTres = matrizAVerificar[0][2] + matrizAVerificar[1][2] + matrizAVerificar[2][2];
        
        int sumaDePrimerDiagonal = matrizAVerificar[0][0] + matrizAVerificar[1][1] + matrizAVerificar[2][2];
        int sumaDeSegundaDiagonal = matrizAVerificar[0][2] + matrizAVerificar[1][1] + matrizAVerificar[2][0];
        
        boolean esIgualElNumeroDeFilas = filaNumeroUno == filaNumeroDos && filaNumeroDos == filaNumeroTres;
        boolean esIgualElNumeroDeColumnas = columnaNumeroUno == columnaNumeroDos && columnaNumeroDos == columnaNumeroTres;
        boolean esIgualElNumeroDeDiagonales = sumaDePrimerDiagonal == sumaDeSegundaDiagonal;
        
        if (esIgualElNumeroDeFilas && esIgualElNumeroDeColumnas && esIgualElNumeroDeDiagonales) {
            System.out.println("Es una matriz mágica");
        }
        else {
            System.out.println("No es una matriz mágica");
        }
    }
}
 