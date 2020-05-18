/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementar;

import interfaces.InterfaceTijera;

/**
 *
 * @author andres
 */
public class Tijera implements InterfaceTijera {

    public Tijera() {
        System.out.print("\n seleccionaste => TIJERA");
    }

    public Tijera(String Nombre) {
        System.out.print("\n " + Nombre + " seleccionaste => TIJERA");
    }

    @Override
    public String getNombre() {
        return "TIJERA";
    }

    @Override
    public int getIndice() {
        return 1;
    }

}
