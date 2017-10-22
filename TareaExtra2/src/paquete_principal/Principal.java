/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_principal;

import paquete_academico.*;
import paquete_estudiante.*;
import paquete_general.*;

/**
 *
 * @author Arianna Vinueza
 */
public class Principal {

    public static void main(String[] args) {

        Pais p1 = new Pais();
        p1.establecer_nombre("Ecuador");
        Pais p2 = new Pais();
        p2.establecer_nombre("Perú");
        Pais p3 = new Pais();
        p3.establecer_nombre("Colombia");
        Pais p4 = new Pais();
        p4.establecer_nombre("Venezuela");
        

        Carrera c1 = new Carrera();
        c1.establecer_nombre("Sistemas");
        c1.establecer_modalidad("presencial");
        Carrera c2 = new Carrera();
        c2.establecer_nombre("Ingenieria Quimica");
        c2.establecer_modalidad("presencial");
        Carrera c3 = new Carrera();
        c3.establecer_nombre("Ingenieria Quimica");
        c3.establecer_modalidad("distancia");
        

        Universidad u1 = new Universidad();
        u1.establecer_nombre("Universidad Técnica Particular de Loja");
        u1.establecer_siglas("UTPL");
        u1.establecer_pais(p1);
        Universidad u2 = new Universidad();
        u2.establecer_nombre("Universidad Técnica Equinoccial");
        u2.establecer_siglas("UTE");
        u2.establecer_pais(p1);
        

        Docente d1 = new Docente();
        d1.establecer_nombres("Mario");
        d1.establecer_apellidos("Alcivar");
        d1.establecer_pais(p3);
        Docente d2 = new Docente();
        d2.establecer_nombres("Maria");
        d2.establecer_apellidos("Ruiz");
        d2.establecer_pais(p2);
        Docente d3 = new Docente();
        d3.establecer_nombres("Luis");
        d3.establecer_apellidos("Armijos");
        d3.establecer_pais(p4);
        

        Asignatura a1_1 = new Asignatura();
        a1_1.establecer_nombre("Matemáticas");
        a1_1.establecer_creditos(10);
        a1_1.establecer_carrera(c1);
        a1_1.establer_docente(d1);
        Asignatura a1_2 = new Asignatura();
        a1_2.establecer_nombre("Física");
        a1_2.establecer_creditos(8);
        a1_2.establecer_carrera(c1);
        a1_2.establer_docente(d2);
        

        Asignatura a2_1 = new Asignatura();
        a2_1.establecer_nombre("Biología");
        a2_1.establecer_creditos(9);
        a2_1.establecer_carrera(c2);
        a2_1.establer_docente(d3);
        Asignatura a2_2 = new Asignatura();
        a2_2.establecer_nombre("Física");
        a2_2.establecer_creditos(7);
        a2_2.establecer_carrera(c3);
        a2_2.establer_docente(d2);
        

        Estudiante e_1 = new Estudiante();
        e_1.establecer_nombres("Luis V");
        e_1.establecer_apellidos("Perez J.");
        e_1.establecer_universidad(u1);
        e_1.establecer_asignatura_1(a1_1);
        e_1.establecer_asignatura_2(a1_2);
        

        Estudiante e_2 = new Estudiante();
        e_2.establecer_nombres("Ana");
        e_2.establecer_apellidos("Lima J.");
        e_2.establecer_universidad(u2);
        e_2.establecer_asignatura_1(a2_1);
        e_2.establecer_asignatura_2(a2_2);
        
        

        System.out.println(e_1);
        System.out.println("\n=======================================================================================================\n");
        System.out.println(e_2);
    }
}
