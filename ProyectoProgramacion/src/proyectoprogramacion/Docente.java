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

public class Docente {
    private String nombres;
    private String apellidos;
    private Titulo titulo_tercer_nivel;
    private Titulo titulo_cuarto_nivel;
    private Asignatura asignatura_1;
    private Asignatura asignatura2;
 
    //Constructo
    public Docente(String names, String names2, String nameTitulo, String nameUniversidad, String nameTitulo1, String nameUniversidad1, String name_Asignatura, int credits, String name_Asignatura1, int credits1) {
        nombres = names;
        apellidos = names2;
        titulo_tercer_nivel= new Titulo(nameTitulo,nameUniversidad);
        titulo_cuarto_nivel= new Titulo(nameTitulo1,nameUniversidad1);
        asignatura_1=new Asignatura(name_Asignatura,credits);
        asignatura2=new Asignatura(name_Asignatura1,credits1);
    }
    
    //Método
 
    public void agregarNombres(String names) {
        nombres = names;
    }
    public void agregarApellidos(String names2) {
        apellidos = names2;
    }
    public void agregarTituloTercerNivel(String nameTitulo, String nameUniversidad) {
        titulo_tercer_nivel = new Titulo(nameTitulo,nameUniversidad);
    }
    public void agregarTituloCuartoNivel(String nameTitulo1, String nameUniversidad1) {
        titulo_cuarto_nivel = new Titulo(nameTitulo1,nameUniversidad1);
    }
    public void agregarAsignatura(String name_Asignatura, int credits){
        asignatura_1 = new Asignatura(name_Asignatura,credits);
    }
    public void agregarAsignatura1(String name_Asignatura1, int credits1){
        asignatura2 = new Asignatura(name_Asignatura1,credits1);
    }
    
  
    public String obtenerNombres() {
        return nombres;
    }
    public String obtenerApellidos() {
        return apellidos;
    }
    public Titulo obtenerTituloTercerNivel() {
        return titulo_tercer_nivel;
    }
    public Titulo obtenerTituloCuartoNivel() {
        return titulo_cuarto_nivel;
    }
    public Asignatura obtenerAsignatura() {
        return asignatura_1;
    }
    public Asignatura obtenerAsignatura1() {
        return asignatura2;
    }
    
    
}
