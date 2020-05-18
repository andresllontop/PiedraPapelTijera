/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstracts;

/**
 *
 * @author andres
 */
public class Roca extends AbstractRoca {

    public Roca() {
        System.out.print("\n seleccionaste => ROCA");
    }

    public Roca(String Nombre) {
        System.out.print("\n " + Nombre + " seleccionaste => ROCA");
    }

    @Override
    public String getNombre() {
        return "ROCA";
    }

    @Override
    public int getIndice() {
        return 2;
    }

}
