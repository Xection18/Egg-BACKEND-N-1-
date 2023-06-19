/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

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
public class Libro {
    public String isbn;
    public String título;
    public String autor;
    public int númeroDePáginas;
    
    public Libro() {
        this.isbn = "";
        this.título = "";
        this.autor = "";
        this.númeroDePáginas = 0;
    }
    
    public Libro(String isbn, String título, String autor, int númeroDePáginas) {
    this.isbn = isbn;
    this.título = título;
    this.autor = autor;
    this.númeroDePáginas = númeroDePáginas;
    
    }
    
    public String getIsbn() {
        return isbn;
    }
    
    public String getTítulo() {
        return título;
    }
    
    public String getAutor() {
        return autor;
    }
    
    public int getNúmeroDePáginas() {
        return númeroDePáginas;
    }
    
}



