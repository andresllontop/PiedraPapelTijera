/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SIMPLE;

/**
 *
 * @author andres
 */
public abstract class Jugador {

    private String jugador;
    private int puntaje;
    private String estado;

    public Jugador(String jugador) {
        System.out.println(" PLAYER : " + jugador);
        this.jugador = jugador;
    }

    public Jugador(String jugador, int puntaje) {
        System.out.println(jugador);
        this.jugador = jugador;
        this.puntaje = puntaje;
    }

    public String getJugador() {
        return jugador;
    }

    public void setJugador(String jugador) {
        this.jugador = jugador;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = this.puntaje + puntaje;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    //propiedades abstractas

    public abstract String getNombre();

    public abstract int getIndice();

    public abstract void SetNombre(String nombre);

    public abstract void SetIndice(int indice);
}
