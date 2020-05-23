/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
import Beans.Mover;

 */
package SIMPLE;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author andres
 */
public class Juego {
    private int cantidadDeJugadas;

    public Juego() {
        //INICIALIZAMOS ATRIBUTOS
        this.cantidadDeJugadas = 0;
    }

    public int getCantidadDeJugadas() {
        return cantidadDeJugadas;
    }

    public Jugador aleatorio(Jugador jugador) {
        Random random = new Random();
        int indice = random.nextInt(3);
        jugador.SetIndice(indice);
        return jugador;
    }

    public Jugador[] comenzarJuego(Jugador jugador, Jugador computer) {
        int indiceJugador = jugador.getIndice();
        int indiceComputer = computer.getIndice();
        Jugador[] resultado = new Jugador[2];
        int comparaMovimiento = this.compararMovimiento(indiceJugador, indiceComputer);

        switch (comparaMovimiento) {
            case 0://EMPATE
                System.out.print("\n********  !EMPATE! ********  ");
                jugador.setEstado("EMPATE");
                computer.setEstado("EMPATE");
                break;
            case 1://GANA USUARIO
                jugador.setPuntaje(1);
                jugador.setEstado("GANA");
                computer.setEstado("PIERDE");

                System.out.print("\n " + jugador.getNombre() + " LE GANA A "
                        + computer.getNombre() + "\n  ********  !" + jugador.getJugador() + " WIN! ******** ");
                break;

            case -1://GANA COMPUTADORA
                computer.setPuntaje(1);
                jugador.setEstado("PIERDE");
                computer.setEstado("GANA");

                System.out.print("\n" + computer.getNombre() + " LE GANA A "
                        + jugador.getNombre() + "\n  ********  !PERDISTE! ******** ");
                System.out.print("\n  ********  !" + computer.getJugador() + " WIN! ******** ");
                break;
        }
        resultado[0] = jugador;
        resultado[1] = computer;
        this.cantidadDeJugadas++;
        return resultado;

    }

    public void estadisticaDelJuego(Jugador jugador, Jugador computer) {
        System.out.print("\n********  !ESTADISTICAS DEL JUEGO! ********  ");
        System.out.print("\n PUNTAJE USUARIO : " + jugador.getPuntaje());
        System.out.print("\n PUNTAJE COMPUTADORA : " + computer.getPuntaje());
        System.out.print("\n EMPATES : " + (this.getCantidadDeJugadas()
                - (jugador.getPuntaje() + computer.getPuntaje())));
        System.out.print("\n NÚMERO DE JUGADAS : " + this.getCantidadDeJugadas());
        System.out.print("\n********  !FIN  DEL JUEGO! ********  ");
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

    public boolean playAgain(Scanner input) {
        System.out.print("\n Quieres Jugar Nuevamente ? SI o NO => ");
        //OBTENER ENTRADA
        String usuarioInput = input.nextLine();
        //CONVERTIR A MASYUSCULA LA ENTRADA
        usuarioInput = usuarioInput.toUpperCase();
        //CAPTURA LA PRIMERA LETRA Y LO COMPARA PARA RETORNAR VERDADERO O FALSO
        return usuarioInput.charAt(0) == 'S';
    }
}
