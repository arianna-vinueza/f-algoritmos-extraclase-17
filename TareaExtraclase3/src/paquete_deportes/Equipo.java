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
public class Equipo {

    private String nombre;
    private String siglas;
    private int anio_fundacion;

    private Jugador[] jugadores;
    private Tecnico[] tecnicos;

    //constructor
    public Equipo(String nom, String sigl, int año_fund, Jugador[] jug, Tecnico[] tec) {
        nombre = nom;
        siglas = sigl;
        anio_fundacion = año_fund;
        jugadores = jug;
        tecnicos = tec;
    }

    public void establecer_judagores(Jugador[] j) {
        jugadores = j;

    }

    public Jugador[] obtener_jugadores() {
        return jugadores;
    }

    public void establecer_tecnicos(Tecnico[] t) {
        tecnicos = t;

    }

    public Tecnico[] obtener_tecnicos() {
        return tecnicos;
    }

    public void establecer_nombre(String n) {
        nombre = n;
    }

    public String obtener_nombre() {
        return nombre;
    }

    public void establecer_siglas(String s) {
        siglas = s;
    }

    public String obtener_siglas() {
        return siglas;
    }

    public void establecer_anio_fundacion(int año_fund) {
        anio_fundacion = año_fund;
    }

    public int obtener_anio_fundacion() {
        return anio_fundacion;
    }

    ///metodo para promedio de tecnicos edad
    public double obtener_promedio_edad_tecnicos() {
        double proedades = 0;
        Tecnico[] arreglotecnicos = obtener_tecnicos();
        for (int i = 0; i < arreglotecnicos.length; i++) {
            proedades += arreglotecnicos[i].obtener_edad();

        }
        return proedades / arreglotecnicos.length;
    }
    //metodo promedio edad jugadores

    public double obtener_promedio_edad_jugadores() {
        double proedades_ju = 0;
        Jugador[] arreglosjugadores = obtener_jugadores();
        for (int i = 0; i < arreglosjugadores.length; i++) {
            proedades_ju += arreglosjugadores[i].obtener_edad();

        }

        return proedades_ju / arreglosjugadores.length;
    }

    public String convertir_array_jugadores() {
        String cadenaJugadores = "";
        Jugador[] arrayJugadores = obtener_jugadores();
        for (int i = 0; i < jugadores.length; i++) {
            cadenaJugadores += String.format("\t%s - %s - %d años\n",
                    arrayJugadores[i].obtener_nombre(),
                    arrayJugadores[i].obtener_posicion(),
                    arrayJugadores[i].obtener_edad());

        }
        return cadenaJugadores;
    }

    public String convertir_array_tecnicos() {
        String cadenaTecnicos = "";
        Tecnico[] arrayTecnicos = obtener_tecnicos();
        for (int i = 0; i < tecnicos.length; i++) {
            cadenaTecnicos += String.format("\t%s - %s - %d años\n",
                    arrayTecnicos[i].obtener_nombre(),
                    arrayTecnicos[i].obtener_funcion(),
                    arrayTecnicos[i].obtener_edad());

        }
        return cadenaTecnicos;
    }

    @Override
    public String toString() {
        String cadena = String.format("\t\tEquipo \"%s\"\n"
                +"--------------------------------------------------"
                + "\nSus técnicos son: \n"
                + "%s"
                +"--------------------------------------------------"
                + "\nSus jugadores son: \n"
                + "%s"
                +"--------------------------------------------------"
                + "\nPromedio de edad de:\n"
                + "\tTécnicos: %.2f años\n"
                + "\tJugadores: %.2f años",
                 obtener_nombre(),
                 convertir_array_tecnicos(),
                 convertir_array_jugadores(),
                 obtener_promedio_edad_tecnicos(),
                 obtener_promedio_edad_jugadores()
        );
        return cadena;
    }

}
