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
public class Papel extends AbstractPapel {

    public Papel() {
        System.out.print("\n seleccionaste => PAPEL");
    }

    public Papel(String Nombre) {
        System.out.print("\n " + Nombre + " seleccionaste => PAPEL");
    }

    @Override
    public String getNombre() {
        return "PAPEL";
    }

    @Override
    public int getIndice() {
        return 0;
    }

}
