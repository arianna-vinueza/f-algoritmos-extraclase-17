/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_academico;

/**
 *
 * @author Arianna Vinueza
 */
public class Asignatura {
    private String nombre;
    private int creditos;
    private Carrera carrera;
    private Docente docente;
    
        public void establecer_nombre(String n){
            nombre = n;
        }
        public String obtener_nombre(){
            return nombre;
        }
        public void establecer_creditos(int c){
            creditos = c;
        }
        public int obtener_creditos(){
            return creditos;
        }
        public void establecer_carrera(Carrera c){
            carrera = c;
        }
        public Carrera obtener_carrera(){
            return carrera;
        }
        public void establer_docente(Docente d){
            docente = d;
        }
        public Docente obtener_docente(){
            return docente;
        }
    @Override
        public String toString(){
            String cadena = String.format("%s (%s créditos) %s\n"
                    + "\tDocente: %s",obtener_nombre(),obtener_creditos(),obtener_carrera(),obtener_docente());
            return cadena;
        }
}
