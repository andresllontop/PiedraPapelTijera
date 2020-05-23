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
public class Mover extends Jugador {

    private String nombre;
    private int indice;

    public Mover(String jugador, int puntaje, String nombre) {
        super(jugador, puntaje);
        this.nombre = nombre;

    }

    public Mover(String jugador, String nombre, int indice) {
        super(jugador);
        this.nombre = nombre;
        this.indice = indice;
    }

    public Mover(String jugador) {
        super(jugador);
    }

    public Mover(String jugador, int puntaje) {
        super(jugador, puntaje);
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public void SetNombre(String nombre) {
        switch (nombre) {
            case "PAPEL":
                this.indice = 0;
                break;
            case "TIJERA":
                this.indice = 1;
                break;
            case "ROCA":
                this.indice = 2;
                break;
        }
        this.nombre = nombre;
    }

    @Override
    public int getIndice() {
        System.out.println(this.getJugador() + " ---> seleccionaste: " + this.nombre + " ");
        return this.indice;
    }

    @Override
    public void SetIndice(int indice) {
        switch (indice) {
            case 0:
                this.nombre = "PAPEL";
                break;
            case 1:
                this.nombre = "TIJERA";
                break;
            case 2:
                this.nombre = "ROCA";
                break;
        }
        this.indice = indice;
    }

}
