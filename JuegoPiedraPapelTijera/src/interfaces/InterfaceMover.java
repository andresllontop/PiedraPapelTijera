/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import abstracts.AbstractPapel;
import abstracts.AbstractRoca;
import abstracts.AbstractTijera;

/**
 *
 * @author andres
 */
public interface InterfaceMover {

    public AbstractTijera crearTijera(String Nombre);

    public AbstractPapel crearPapel(String Nombre);

    public AbstractRoca crearRoca(String Nombre);

}
