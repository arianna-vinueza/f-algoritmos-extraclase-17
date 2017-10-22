/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_academico;
import paquete_general.Pais;
/**
 *
 * @author Arianna Vinueza
 */
public class Docente {
    private String nombres;
    private String apellidos;
    private Pais pais;
    
        public void establecer_nombres(String n){
            nombres = n;
        }
        public String obtener_nombres(){
            return nombres;
        }
        public void establecer_apellidos(String a){
            apellidos = a;
        }
        public String obtener_apellidos(){
            return apellidos;
        }
        public void establecer_pais(Pais p){
            pais = p;
        }
        public Pais obtener_pais(){
            return pais;
        } 
    @Override
        public String toString(){
            String cadena = String.format("%s %s - país %s",obtener_nombres(),obtener_apellidos(),obtener_pais());
            return cadena;
        }
}
