/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementar;

import interfaces.InterfaceMover;
import interfaces.InterfacePapel;
import interfaces.InterfaceRoca;
import interfaces.InterfaceTijera;

/**
 *
 * @author andres
 */
public class Mover implements InterfaceMover {

    @Override
    public InterfaceTijera crearTijera(String Nombre) {
        return new Tijera(Nombre);
    }

    @Override
    public InterfacePapel crearPapel(String Nombre) {
        return new Papel(Nombre);
    }

    @Override
    public InterfaceRoca crearRoca(String Nombre) {
        return new Roca(Nombre);
    }

}
