/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementar;

import interfaces.InterfaceComputadora;
import java.util.Random;

/**
 *
 * @author andres
 */
public class ImpComputadora implements InterfaceComputadora {

    private String nombre = "COMPUTADORA";
    private int puntaje;

    public ImpComputadora() {
    }

    public ImpComputadora(int puntaje) {
        this.puntaje = puntaje;
    }

    @Override
    public int getMover(Mover mover, int valor) {
        Random random = new Random();
        int indice = random.nextInt(3);

        switch (indice) {
            case 0:
                return mover.crearPapel(this.getNombre()).getIndice();
            case 1:
                return mover.crearTijera(this.getNombre()).getIndice();
            case 2:
                return mover.crearRoca(this.getNombre()).getIndice();
            default:
                System.out.print("\n OPCIÓN INCORRECTA");
                return getMover(mover, valor);
        }

    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int getPuntaje() {
        return puntaje;
    }

    @Override
    public void setPuntaje(int puntaje) {
        this.puntaje = (this.puntaje + puntaje);
    }
}
