/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import implementar.Mover;

/**
 *
 * @author andres
 */
public interface InterfaceJugador {

    public int getMover(Mover mover,int valor);

    public String getNombre();

    public void setNombre(String nombre);

    public int getPuntaje();

    public void setPuntaje(int puntaje);
}
