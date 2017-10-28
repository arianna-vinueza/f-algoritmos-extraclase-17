/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_principal;

import paquete_deportes.Equipo;
import paquete_deportes.Jugador;
import paquete_deportes.Tecnico;

/**
 *
 * @author AriannaVinueza
 */
public class Principal {

    public static void main(String[] args) {
    
        Jugador [] jugadores = new Jugador [6];
        
        jugadores[0]= new Jugador("Manuel Alvarez", "Arquero",20);
        jugadores[1]= new Jugador("Eduardo Valencia", "Defensa",21);
        jugadores[2]= new Jugador("Fabian Cevallos", "Defensa",30);
        jugadores[3]= new Jugador("Antonio Lara", "Centrocampista",32);
        jugadores[4]= new Jugador("Luis Delgado", "Centrocampista",17);
        jugadores[5]= new Jugador("Xavier Lopez", "Delantero",25);
   
        Tecnico [] tecnicos = new Tecnico[3];
        tecnicos[0]= new Tecnico("Luis Gomez", "Tecnico principal", 45);
        tecnicos[1]= new Tecnico("Julio Neto", "Asistente Tecnico", 46);
        tecnicos[2]= new Tecnico("Marco Silva", "Preparador Fisico", 47);
        
        System.out.println("--------------------------------------------------");
        Equipo e = new Equipo("Boca Juniors", "B", 1940, jugadores, tecnicos);
        
        System.out.println(e);
        
        
        
        
        
        
        
        
        
    }
    
}
