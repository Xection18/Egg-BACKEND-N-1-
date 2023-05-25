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
        }
    }
    
    public static void VerificarSiLaMatriz_EsMágica(int matrizAVerificar[][]) {
        int primerFila = 0;
        int segundaFila= 0;
        int tercerFila = 0;
        
        int primerColumna = 0;
        int segundaColumna = 0;
        int tercerColumna = 0;
        
        int primerDiagonal = 0;
        int segundaDiagonal = 0;
        
        
        int sumaDeFilas = primerFila + segundaFila + tercerFila;
        int sumaDeColumnas = primerColumna + segundaColumna + tercerColumna;
        int sumaDeDiagonales = primerDiagonal + segundaDiagonal;
        
        for (int i = 0; i < matrizAVerificar.length; i++) {
            for (int j = 0; j < matrizAVerificar.length; j++) {
                
                ////////////////////////SUMA DE FILAS//////////////////////////
                if (i == 0 && j == 0) {
                    primerFila = primerFila + matrizAVerificar[i][j];
                }
                
                if (i == 0 && j == 1) {
                    primerFila = primerFila + matrizAVerificar[i][j];
                }
                
                if (i == 0 && j == 2) {
                    primerFila = primerFila + matrizAVerificar[i][j];
                }
                
                if (i == 1 && j == 0) {
                    segundaFila = segundaFila + matrizAVerificar[i][j];
                }
                
                if (i == 1 && j == 1) {
                    segundaFila = segundaFila + matrizAVerificar[i][j];
                }
                
                if (i == 1 && j == 2) {
                    segundaFila = segundaFila + matrizAVerificar[i][j];
                }
                
                if (i == 2 && j == 0) {
                    tercerFila = tercerFila + matrizAVerificar[i][j];
                }
                
                if (i == 2 && j == 1) {
                    tercerFila = tercerFila + matrizAVerificar[i][j];
                }
                
                if (i == 2 && j == 2) {
                    tercerFila = tercerFila + matrizAVerificar[i][j];
                }
                
                ////////////////////////SUMA DE COLUMNAS///////////////////////
                
                if (i == 0 && j == 0) {
                    primerColumna = primerColumna + matrizAVerificar[i][j];
                }
                
                if (i == 1 && j == 0) {
                    primerColumna = primerColumna + matrizAVerificar[i][j];
                }
                
                if (i == 2 && j == 0) {
                    primerColumna = primerColumna + matrizAVerificar[i][j];
                }
                
                if (i == 0 && j == 1) {
                    segundaColumna = segundaColumna + matrizAVerificar[i][j];
                }
                
                if (i == 1 && j == 1) {
                    segundaColumna = segundaColumna + matrizAVerificar[i][j];
                }
                
                if (i == 2 && j == 1) {
                    segundaColumna = segundaColumna + matrizAVerificar[i][j];
                }
                
                if (i == 0 & j == 2) {
                    tercerColumna = tercerColumna + matrizAVerificar[i][j];
                }
                
                if (i == 1 && j == 2) {
                    tercerColumna = tercerColumna + matrizAVerificar[i][j];
                }
                
                if (i == 2 && j == 2) {
                    tercerColumna = tercerColumna + matrizAVerificar[i][j];
                }
                
                ////////////////////////SUMA DE DIAGONALES/////////////////////
                
                if (i == 0 && j == 0) {
                    primerDiagonal = primerDiagonal + matrizAVerificar[i][j];
                }
                
                if (i == 1 && j == 1) {
                    primerDiagonal = primerDiagonal + matrizAVerificar[i][j];
                }
                
                if (i == 2 && j == 2) {
                    primerDiagonal = primerDiagonal + matrizAVerificar[i][j];
                }
                
                if (i == 2 && j == 0) {
                    segundaDiagonal = segundaDiagonal + matrizAVerificar[i][j];
                }
                
                if (i == 1 && j == 1) {
                    segundaDiagonal = segundaDiagonal + matrizAVerificar[i][j];
                }
                
                if (i == 0 && j == 2) {
                    segundaDiagonal = segundaDiagonal + matrizAVerificar[i][j];
                }
            }
        }
        
        System.out.println(sumaDeColumnas);
        System.out.println(sumaDeDiagonales);
        System.out.println(sumaDeFilas);
        
        if (sumaDeColumnas == sumaDeDiagonales && sumaDeColumnas == sumaDeFilas) {
            System.out.println("Es una matriz mágica");
        }
        else {
            System.out.println("No es una matriz mágica");
        }
    }
}
 