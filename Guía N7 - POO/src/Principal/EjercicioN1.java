/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Entidades.Libro;
import java.util.Scanner;

/*
1. Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, 
Título, Autor, Número de páginas, y un constructor con todos los atributos
pasados por parámetro y un constructor vacío. Crear un método para cargar 
un libro pidiendo los datos al usuario y luego informar mediante otro método
el número de ISBN, el título, el autor del libro y el número de páginas.

*/

/**
 *
 * @author Johann
 */
public class EjercicioN1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        cargarDatosDeUsuarioYInformarLibro();
    }
    
    public static void cargarDatosDeUsuarioYInformarLibro() {
        Scanner read = new Scanner (System.in);
        
        System.out.println("Ingrese su nombre: ");
        String nombre = read.nextLine();
        System.out.println("Ingrese su apellido; ");
        String apellido = read.nextLine();
        
        System.out.println("Okay, " + nombre + " " + apellido + ". Ahora debera cargar el libro suyo");
        System.out.println("Ingrese el ISBN: ");
        int isbn = read.nextInt();
        System.out.println("Ingrese el título: ");
        String título = read.nextLine();
        System.out.println("Ingrese el autor: ");
        String autor = read.nextLine();
        System.out.println("Ingrese el númeroDePáginas");
        int númeroDePáginas = read.nextInt();
        System.out.println("Cargando libro...");
                
        cargarLibroISBN_Título_Autor_NúmeroDePáginas(isbn, título, autor, númeroDePáginas);
    }
    
    public static void cargarLibroISBN_Título_Autor_NúmeroDePáginas(int isbn, String título, String autor, int númeroDePáginas) {
        Libro nuevoLibro = new Libro(isbn, título, autor, númeroDePáginas);
        
    }
    
}
