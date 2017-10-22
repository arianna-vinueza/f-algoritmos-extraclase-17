/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogramacion;

/**
 *
 * @author Arianna Vinueza
 */

public class Asignatura {
    private String nombre;
    private int creditos;
 
    //Constructor
    public Asignatura(String name, int credits) {
        nombre = name;
        creditos = credits;
    }
    
    //Métodos
    public void agregarNombre(String name) {
        nombre = name;
    }
 
    public String obtenerNombre() {
        return nombre;
    }
    
    public void agregarCreditos(int credits) {
        creditos = credits;
    }
 
    public int obtenerCreditos() {
        return creditos;
    }
}
