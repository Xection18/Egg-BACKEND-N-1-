/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GuíaN3;

import java.util.Scanner;

/**
 *
 * @author Xecti
 */
public class EjercicioN8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
        Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá
        dibujar lo siguiente:
        
        * * * *
        *     *
        *     *
        * * * *
        
        */
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese el tamaño del cuadrado: ");
        int tamaño = leer.nextInt();
        
        for (int i = 1; i <= tamaño; i++) {
            if ( i == 1 || i == tamaño ) {
                for (int j = 1; j <= tamaño; j++) {
                    System.out.print("*  ");
                }
                System.out.println("");
            }
            else {
                System.out.print("*  ");
                for (int j = 1; j <= tamaño - 2; j++){
                    System.out.print("   ");
                }
                System.out.println("*");
            }
        }
//     Para i = 1 Hasta tamanoDelLado Con Paso 1 Hacer
//		
//		Si (i = 1) O (i = tamanoDelLado) Entonces
//			
//			Para j = 1 Hasta tamanoDelLado Con Paso 1 Hacer
//				
//				Escribir Sin Saltar "*  "
//				
//			FinPara
//			
//			Escribir ""
//			
//		SiNo
//			
//			Escribir Sin Saltar "*  "
//			
//            Para j = 1 hasta tamanoDelLado - 2 Con Paso 1 Hacer
//				
//                Escribir Sin Saltar "   "
//				
//            FinPara
//			
//            Escribir "*"
//			
//		FinSi
//		
//	FinPara
    }
    
}
