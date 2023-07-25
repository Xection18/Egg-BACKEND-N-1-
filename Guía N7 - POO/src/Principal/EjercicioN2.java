/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Entidades.Circunferencia;
import java.util.Scanner;

/*  
    Declarar una clase llamada Circunferencia que tenga como atributo privado el radio 
    de tipo real. A continuación, se deben crear los siguientes métodos:
    Método constructor que inicialice el radio pasado como parámetro.
    Métodos get y set para el atributo radio de la clase Circunferencia.
    Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
    Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
    Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).

 */
public class EjercicioN2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circunferencia unaCircunferencia = new Circunferencia();
        crearCircunferencia_(unaCircunferencia);
        areaDeLaCircunferencia_(unaCircunferencia);
        perimetroDeLaCircunferencia_(unaCircunferencia);
    }
    
    
    public static void crearCircunferencia_(Circunferencia unaCircunferencia) {
        Scanner read = new Scanner (System.in);
        System.out.println("Ingrese el radio de la circunferencia para guardarlo en memoria.");
        double radio;
        radio = read.nextDouble();
        
        unaCircunferencia.setRadio(radio);
        
    }
    
    public static void areaDeLaCircunferencia_(Circunferencia unaCircunferencia) {
        System.out.println("Ahora calcularemos el área de la circunfencia con este cálculo: Área = ( π * radio ) ^ 2");
        double area;
        
        area = (Math.PI * unaCircunferencia.getRadio()) * (Math.PI * unaCircunferencia.getRadio());
        System.out.println("El área es: " + area);
    }
    
    public static void perimetroDeLaCircunferencia_(Circunferencia unaCircunferencia) {
        System.out.println("Ahora calcularemos el perimetro con este cálculo: Perímetro = 2 * π * radio");
        double perímetro;
        
        perímetro = 2 * Math.PI * unaCircunferencia.getRadio();
        System.out.println("El perímetro es: " + perímetro);
                
    }
}
