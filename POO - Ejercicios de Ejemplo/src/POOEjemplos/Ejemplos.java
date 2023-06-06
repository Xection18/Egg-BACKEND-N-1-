/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POOEjemplos;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author Johann
 */
public class Ejemplos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
        Persona primerPersona = new Persona();
        Persona segundaPersona = new Persona();
        Persona terceraPersona = new Persona("Johann", 42721557, 22, "08/10/2000");
        
        System.out.println("Los datos de la tercer persona son: ");
        
        System.out.println("Nombre: " + terceraPersona.getNombre());
        System.out.println("DNI:" + terceraPersona.getDni());
        System.out.println("Edad" + terceraPersona.getEdad());
        System.out.println("Fecha de nacimiento: " + terceraPersona.getFechaDeNacimiento());
        
        System.out.println("Coloque el nombre completo de la persona");
        
        terceraPersona.setNombre(read.nextLine());
        
        System.out.println("Los datos de la tercer persona son: ");
        System.out.println("Nombre: " + terceraPersona.getNombre());
        System.out.println("DNI:" + terceraPersona.getDni());
        System.out.println("Edad" + terceraPersona.getEdad());
        System.out.println("Fecha de nacimiento: " + terceraPersona.getFechaDeNacimiento());
       
    }
    
}
