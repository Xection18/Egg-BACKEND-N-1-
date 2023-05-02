/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GuíaN1;

import java.util.Scanner;

/**
 *
 * @author Xecti
 */
public class IntroJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String palabraOculta;
        char caracterMagico;
        boolean esDeColorVerde;
        String palabraEncontrada = "Argentina";
        boolean esDeColorNegro = false;
        palabraOculta = "Tesouro";
        caracterMagico = 'a';
        esDeColorVerde = true;
        int suma = 1 + 4;
        int numero1 = 5;
        int numero3 = 4;
        int numero2 = 10;
        int sumaDeNumeros = numero1 + numero2;
        boolean esColorVerdeYNegro = esDeColorVerde && esDeColorNegro;
        String primerNombre = "Johann ";
        String segundoNombre = "Gustavo ";
        String apellido = "Adam";
        System.out.println("La suma de los numeros es de: " + sumaDeNumeros);
        System.out.print("Hola, mundo. ");
        System.out.print("¿Cómo están? ");
        System.out.println("Mi nombre completo es: " + primerNombre + segundoNombre + apellido);
        String numero3Cadena = String.valueOf(numero3);
        int numero3SinCadena = Integer.parseInt(numero3Cadena);
        int numeroRamdom = (int) (Math.random() * 5);
        Scanner leer = new Scanner (System.in);
        String respuesta;
        System.out.println("¿Le gusto todo lo que usted vió hasta ahora?");
        respuesta = leer.next();
        System.out.println("Hola, Johann. Veo que " + respuesta + " le ha gustado lo que vió hasta ahora");
    }
    
}
