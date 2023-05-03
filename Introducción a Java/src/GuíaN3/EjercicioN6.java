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
public class EjercicioN6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        6. Realizar un programa que pida dos números enteros positivos por teclado
        y muestre por pantalla el siguiente menú:El usuario deberá elegir una
        opción y el programa deberá mostrar el resultado por pantalla y luego
        volver al menú. El programa deberá ejecutarse hasta que se elija
        la opción 5. Tener en cuenta que, si el usuario selecciona la opción
        5, en vez de salir del programa directamente, se debe mostrar el
        siguiente mensaje de confirmación: ¿Está seguro que desea salir del
        programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
        programa, caso contrario se vuelve a mostrar el menú.
        */
        Scanner entrada = new Scanner (System.in);
        int num1;
        int num2;
        int opcion;
        char eleccion = 0;
        
        do {
            System.out.println("Ingrese el primer número entero positivo");
            num1 = entrada.nextInt();
            System.out.println("Ingrese el segundo número entero positivo");
            num2 = entrada.nextInt();
            
            if (num1 < 0 || num2 <0) {
                System.out.println("Alguno de los dos números que ingreso no son enteros positivos...");
            }
            
        } while (num1 < 0 || num2 < 0);
      
        System.out.println("Correcto, deberá elegir una opción del menú: ");
        
        
       do {
            System.out.println("MENU: ");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Elija opción: ");
            opcion = entrada.nextInt();
            switch (opcion) {
            case 1:
                int suma;
                suma = num1 + num2;
                System.out.println("La suma da un total de: " + suma);
                break;
            case 2:
                int resta;
                resta = num1 - num2;
                System.out.println("La resta da un total de: " + resta);
                break;
            case 3:
                int multiplicar;
                multiplicar = num1 * num2;
                System.out.println("La multiplicación da un total de: " + multiplicar);
                break;
            case 4:
                int dividir;
                dividir = num1 / num2;
                System.out.println("La división da un total de: " + dividir);
                break;
            case 5:
                System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                eleccion = entrada.next().charAt(0);
                
                switch (eleccion) {
                    case 'S':
                        System.out.println("Saliendo del menú..."); 
                        break;
                    case 's':
                        System.out.println("Saliendo del menú...");
                        break;
                    case 'N':
                        System.out.println("Volviendo al menú...");
                        break;
                    case 'n':
                        System.out.println("Volviendo al menú...");
                        break;
                    default:
                        System.out.println("Elija una opción válida (S/N)");
                }
                        
        }
       } while (eleccion == 'n' || eleccion == 'N');
    }
 
}
