/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
import Beans.Mover;

 */
package juego;

import implementar.Mover;
import implementar.ImpComputadora;
import implementar.ImpUsuario;
import interfaces.InterfaceComputadora;
import interfaces.InterfaceUsuario;

/**
 *
 * @author andres
 */
public class Juego {
//CREAMOS INSTANCIAS DE LAS CLASES

    private final InterfaceComputadora computadora;
    private final InterfaceUsuario usuario;

    private int cantidadDeJugadas;

    public Juego() {

        this.usuario = new ImpUsuario(0);
        this.computadora = new ImpComputadora(0);
        //INICIALIZAMOS ATRIBUTOS
        this.cantidadDeJugadas = 0;

    }

    public void comenzarJuego(int valoropcion) {

        int comparaMovimiento = this.compararMovimiento(usuario.getMover(new Mover(), valoropcion),
                computadora.getMover(new Mover(), 3));
        switch (comparaMovimiento) {
            case 0://EMPATE
                System.out.print("\n********  !EMPATE! ********  ");
                break;
            case 1://GANA USUARIO
                System.out.print("\n" + usuario.getNombre() + " LE GANA A " + computadora.getNombre() + "\n ********  !GANASTE! ******** ");
                usuario.setPuntaje(1);
                break;
            case -1://GANA COMPUTADORA
                System.out.print("\n" + computadora.getNombre() + " LE GANA A " + usuario.getNombre() + "\n ********  !PERDISTE! ******** ");
                computadora.setPuntaje(1);
                break;
        }
        this.cantidadDeJugadas++;

    }

    public void estadisticaDelJuego() {
         System.out.print("\n ********  ESTADISTICAS ******** ");
        System.out.print("\n PUNTAJE "+usuario.getNombre()+" : " + usuario.getPuntaje());
        System.out.print("\n PUNTAJE "+computadora.getNombre()+" : " + computadora.getPuntaje());
        System.out.print("\n PUNTAJE EMPATES : " + (this.cantidadDeJugadas - (usuario.getPuntaje() + computadora.getPuntaje())));
        System.out.print("\n NÚMERO DE JUGADAS : " + this.cantidadDeJugadas);
    }

    public int compararMovimiento(int usuarioPrimer, int usuarioSegundo) {
        //EMPATE
        if (usuarioPrimer == usuarioSegundo) {
            return 0;
        }
        switch (usuarioPrimer) {
            case 0:
                if (usuarioSegundo == 2) {
                    return 1;
                } else {
                    return -1;
                }

            case 1:
                if (usuarioSegundo == 0) {
                    return 1;
                } else {
                    return -1;
                }
            case 2:
                if (usuarioSegundo == 1) {
                    return 1;
                } else {
                    return -1;
                }

            default:
                return 0;

        }
    }
}
