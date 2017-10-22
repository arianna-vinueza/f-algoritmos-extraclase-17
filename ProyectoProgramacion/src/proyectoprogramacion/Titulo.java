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

public class Titulo {
    private String nombre;
    private String nombre_universidad;
 
    //Constructor
    public Titulo(String name, String name_universidad) {
        nombre = name;
        nombre_universidad = name_universidad;
    }
    
    //Métodos
    public void agregarNombre(String name) {
        nombre = name;
    }
 
    public String obtenerNombre() {
        return nombre;
    }
    
    public void agregarMombre_universidad(String name_universidad) {
        nombre_universidad = name_universidad;
    }
 
    public String obtenerNombre_universidad() {
        return nombre_universidad;
    }
 

}
