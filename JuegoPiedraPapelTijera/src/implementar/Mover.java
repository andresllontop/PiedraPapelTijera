/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementar;

import abstracts.AbstractPapel;
import abstracts.AbstractRoca;
import abstracts.AbstractTijera;
import abstracts.Papel;
import abstracts.Roca;
import abstracts.Tijera;
import interfaces.InterfaceMover;

/**
 *
 * @author andres
 */
public class Mover implements InterfaceMover {

    @Override
    public AbstractTijera crearTijera(String Nombre) {
        return new Tijera(Nombre);
    }

    @Override
    public AbstractPapel crearPapel(String Nombre) {
        return new Papel(Nombre);
    }

    @Override
    public AbstractRoca crearRoca(String Nombre) {
        return new Roca(Nombre);
    }

}
