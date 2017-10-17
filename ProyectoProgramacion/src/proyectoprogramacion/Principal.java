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
public class Principal {

    public static void main(String[] args) {

    
        Docente docente1=new Docente("Luis V.","Perez J.","Universidad Politécnica","Licenciado en Físico Matemáticas","Universidad Valenciana","Magister en Docencia Matemática","Matemáticas",8,"Física",6);
        Docente docente2=new Docente("Ana M.","Velez P.","Universidad Salesiana","Licenciado en Ciencias Sociales","Universidad Cataluña","Magister en Docencia Social","Sociales",9,"Literatura",10);
       
        
        
        
        System.out.println("Nombres: "+docente1.obtenerNombres()+"\n");
        System.out.println("Apellidos: "+docente1.obtenerApellidos()+"\n");
        
        
        System.out.println("=================");
        System.out.println("TITULOS");
        System.out.println("=================");
        System.out.println("\tTercer Nivel");
        System.out.println("\t\tNombre: "+docente1.obtenerTituloTercerNivel().obtenerNombre()+"\n");
        System.out.println("\t\tUniversidad: "+docente1.obtenerTituloTercerNivel().obtenerNombre_universidad()+"\n");
        
        System.out.println("\tCuarto Nivel \n");
        System.out.println("\t\tNombre: "+docente1.obtenerTituloCuartoNivel().obtenerNombre()+"\n");
        System.out.println("\t\tUniversidad: "+docente1.obtenerTituloCuartoNivel().obtenerNombre_universidad()+"\n");
        
        System.out.println("=================");
        System.out.println("ASIGNATURAS");
        System.out.println("=================");
        System.out.println("\tNombre: "+docente1.obtenerAsignatura().obtenerNombre()+"\n");
        System.out.println("\tCréditos: "+docente1.obtenerAsignatura().obtenerCreditos()+"\n");
        
        System.out.println("\tNombre: "+docente1.obtenerAsignatura1().obtenerNombre()+"\n");
        System.out.println("\tCréditos: "+docente1.obtenerAsignatura1().obtenerCreditos()+"\n");
        
        
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_\n");
        
        
        //DOCENTE 2
        
        System.out.println("Nombres: "+docente2.obtenerNombres()+"\n");
        System.out.println("Apellidos: "+docente2.obtenerApellidos()+"\n");
        
        
        System.out.println("=================");
        System.out.println("TITULOS");
        System.out.println("=================");
        System.out.println("\tTercer Nivel \n");
        System.out.println("\t\tNombre: "+docente2.obtenerTituloTercerNivel().obtenerNombre()+"\n");
        System.out.println("\t\tUniversidad: "+docente2.obtenerTituloTercerNivel().obtenerNombre_universidad()+"\n");
        
        System.out.println("\tCuarto Nivel \n");
        System.out.println("\t\tNombre: "+docente2.obtenerTituloCuartoNivel().obtenerNombre()+"\n");
        System.out.println("\t\tUniversidad: "+docente2.obtenerTituloCuartoNivel().obtenerNombre_universidad()+"\n");
        
        System.out.println("=================");
        System.out.println("ASIGNATURAS");
        System.out.println("=================");
        System.out.println("\tNombre: "+docente2.obtenerAsignatura().obtenerNombre()+"\n");
        System.out.println("\tCréditos: "+docente2.obtenerAsignatura().obtenerCreditos()+"\n");
        
        System.out.println("\tNombre: "+docente2.obtenerAsignatura1().obtenerNombre()+"\n");
        System.out.println("\tCréditos: "+docente2.obtenerAsignatura1().obtenerCreditos()+"\n");
        
    }
    
}    

 /*
     Caso 1:
     
     Datos del Docente:
    Nombres: Luis V.
    Apellidos: Perez J.
    Tiene a su cargo las asignaturas:
        Asignatura 1: Matemáticas con número de créditos 8
        Asignatura 2: Física con número de créditos 6
    El docente tiene los siguientes títulos académicos
        Título 3er nivel: Licenciado en Físico Matemáticas - Universidad Politécnica
        Título 4er nivel: Magister en Docencia Matemática - Universidad Valenciana
    
    Caso 2:
    
    Datos del Docente:
    Nombres: Ana M.
    Apellidos: Velez P.
    Tiene a su cargo las asignaturas:
        Asignatura 1: Sociales con número de créditos 9
        Asignatura 2: Literatura con número de créditos 10
    El docente tiene los siguientes títulos académicos
        Título 3er nivel: Licenciado en Ciencias Sociales - Universidad Salesiana
        Título 4er nivel: Magister en Docencia Social - Universidad Cataluña

     */ 

