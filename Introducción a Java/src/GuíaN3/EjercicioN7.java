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
public class EjercicioN7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Realizar un programa que simule el funcionamiento de un dispositivo
        RS232, este tipo de dispositivo lee cadenas enviadas por el usuario.
        Las cadenas deben llegar con un formato fijo: tienen que ser de un 
        máximo de 5 caracteres de largo, el primer carácter tiene que ser 
        X y el último tiene que ser una O.
        Las secuencias leídas que respeten el formato se consideran 
        correctas, la secuencia especial “&&&&&” marca el final de los envíos
        (llamémosla FDE), y toda secuencia distinta de FDE, que no respete el
        formato se considera incorrecta.
        Al finalizar el proceso, se imprime un informe indicando la cantidad
        de lecturas correctas e incorrectas recibidas. Para resolver el
        ejercicio deberá investigar cómo se utilizan las siguientes funciones
        de Java Substring(), Length(), equals().
        */
        Scanner leer = new Scanner (System.in);
        String cadena;
        int contador = 0;
        
        do {
            System.out.println("Ingrese una cadena de formato fijo 5, comenzada con X y terminada en O. Ingrese &&&&& para terminar");
            cadena = leer.nextLine();
                
            if (cadena.length() == 5 && cadena.equals("&&&&&")) {
                System.out.println("Finalizando...");
                contador = contador + 1;
            }       
            else if (cadena.length() != 5 && ! cadena.startsWith("X") || ! cadena.endsWith("O")) {
                System.out.println("Incorrecto, ingreso una cadena inválida");
            }
            else if (cadena.length() == 5 && ! cadena.startsWith("X") || ! cadena.endsWith("O")) {
                System.out.println("Incorrecto, ingreso una cadena inválida");
            }
            else if (cadena.length() == 5 && cadena.startsWith("X") && cadena.endsWith("O")) {
                System.out.println("Correcto, ingreso una cadena válida");
                contador = contador + 1;
            }
            
        } while (! cadena.equals("&&&&&"));
        
        System.out.println("La cantidad de cadenas leídas es de: " + contador);
    }
    
}
