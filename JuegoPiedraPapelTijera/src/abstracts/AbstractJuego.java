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
public abstract class AbstractJuego {

    public abstract String getNombre();

    public abstract int getIndice();

    @Override
    public String toString() {
        return "AbstractJuego{nombre:" +getNombre()+",indice: "+getIndice()+ '}';
    }

  

}
