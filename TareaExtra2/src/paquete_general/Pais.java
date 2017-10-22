/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_general;

/**
 *
 * @author Arianna Vinueza
 */
public class Pais {
    private String nombre;
    
    public void establecer_nombre(String n){
        nombre = n;
    }
    public String obtener_nombre(){
        return nombre;
    }
    
    @Override
    public String toString (){
        String cadena = String.format("%s",obtener_nombre());
        return cadena;
    }
}
