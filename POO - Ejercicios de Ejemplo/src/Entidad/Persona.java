/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Johann
 */
public class Persona {
    
    // definiciones que lleva una clase: 
    
    // atributos
    
    /*
    El estado de un ojbeto es una lista de variables conocidas como sus atributos, cuyos valores representan
    el estado que caracteriza al objeto.
    
    Ejemplo:
    El perro tiene Estado (color, nombre, raza, edad)
    */
    
    // constructores
    
    // métodos propios
    
    /*
    El comportamiento es una lista de métodos, procedimientos, funciones u operaciones que un objeto puede ejecutar 
    a solicitud de otros objetos.
    Los objetos también se conocen como instancias
    
    Ejemplo:
    El perro tiene Comportanmiento (ladrar, caminar, comer, acostarse, mover la cola)
    */
    
    public String nombre;
    public int dni;
    public int edad;
    public String fechaDeNacimiento;
    
    public Persona() {
        
    }
    
    public Persona(String nombre, int dni, int edad, String fechaDeNacimiento) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setDni(int dni) {
        this.dni = dni;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getNombre() {
        return nombre;
    }
    
    public int getDni() {
        return dni;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }
    
}
