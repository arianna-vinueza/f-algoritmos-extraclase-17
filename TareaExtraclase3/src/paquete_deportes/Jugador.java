/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_deportes;

/**
 *
 * @author AriannaVinueza
 */
public class Jugador {

    private String nombre;
    private String posicion;
    private int edad;

    public Jugador(String n, String p, int e) {
        nombre = n;
        posicion = p;
        edad = e;

    }

    public void establecer_nombre(String n) {
        nombre = n;
    }

    public String obtener_nombre() {
        return nombre;
    }

    public void establecer_posicion(String p) {
        posicion = p;
    }

    public String obtener_posicion() {
        return posicion;
    }

    public void establecer_edad(int e) {
        edad = e;
    }

    public int obtener_edad() {
        return edad;
    }

    public String toString() {
        String cadena = String.format("%s - %s - %d", obtener_nombre(), obtener_posicion(), obtener_edad());
        return cadena;
    }

}
