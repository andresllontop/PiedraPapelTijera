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
    //CREAMOS VARIABLE DEL NUMERO DE JUGADAS
    private int cantidadDeJugadas;

    public Juego() {
        //INICIALIZAMOS VARIABLE DEL NUMERO DE JUGADAS
        this.cantidadDeJugadas = 0;
    }
//FUNCION PARA OBTENER NUMERO DE JUGADAS
    public int getCantidadDeJugadas() {
        return cantidadDeJugadas;
    }

    public Jugador aleatorio(Jugador jugador) {
        Random random = new Random();
        //NUMERO ALEATORIO DESDE CERO HASTA EL DOS
        int indice = random.nextInt(3);
        //INGRESAMOS LA JUGADA DE LA COMPUTADORA 
        jugador.SetIndice(indice);
        return jugador;
    }
/* FUNCION DE INCIO DE JUEGO
    */
    public Jugador[] comenzarJuego(Jugador jugador, Jugador computer) {
        //OBTENEMOS LA JUGADAD DE USUARIO
        int indiceJugador = jugador.getIndice();
        //OBTENEMOS LA JUGADAD DE COMPUTADORA
        int indiceComputer = computer.getIndice();
        //CREAMOS ARRAY JUGADOR PARA CAPTURAR RESULTADOS
        Jugador[] resultado = new Jugador[2];
        //OBTENER EL RESULTADO DE LA JUGADA DE AMBOS USUARIOS
        int comparaMovimiento = this.compararMovimiento(indiceJugador, indiceComputer);

        switch (comparaMovimiento) {
            case 0://EMPATE
                System.out.print("\n********  !EMPATE! ********  ");
                jugador.setEstado("EMPATE");
                computer.setEstado("EMPATE");
                break;
            case 1://GANA USUARIO
                //AUMENTAMOS PUNTAJE USUARIO
                jugador.setPuntaje(1);
                jugador.setEstado("GANA");
                computer.setEstado("PIERDE");
                System.out.print("\n " + jugador.getTipo() + " LE GANA A "
                        + computer.getTipo() + "\n  ********  !" + jugador.getJugador() + " WIN! ******** ");
                break;

            case -1://GANA COMPUTADORA
                //AUMENTAMOS PUNTAJE COMPUTADORA
                computer.setPuntaje(1);
                jugador.setEstado("PIERDE");
                computer.setEstado("GANA");

                System.out.print("\n" + computer.getTipo() + " LE GANA A "
                        + jugador.getTipo() + "\n  ********  !PERDISTE! ******** ");
                System.out.print("\n  ********  !" + computer.getJugador() + " WIN! ******** ");
                break;
        }
        resultado[0] = jugador;
        resultado[1] = computer;
        //AUMENTAMOS LA CANTIDAD DE JUGADAS QUE SE REALIZARON
        this.cantidadDeJugadas++;
        //RETORNAMOS RESULTADOS
        return resultado;

    }
/* FUNCION DE ESTADISTICAS DE LOS JUGADORES
    */
    public void estadisticaDelJuego(Jugador jugador, Jugador computer) {
        System.out.print("\n********  !ESTADISTICAS DEL JUEGO! ********  ");
        System.out.print("\n PUNTAJE USUARIO : " + jugador.getPuntaje());
        System.out.print("\n PUNTAJE COMPUTADORA : " + computer.getPuntaje());
        System.out.print("\n EMPATES : " + (this.getCantidadDeJugadas()
                - (jugador.getPuntaje() + computer.getPuntaje())));
        System.out.print("\n NÚMERO DE JUGADAS : " + this.getCantidadDeJugadas());
        System.out.print("\n********  !FIN  DEL JUEGO! ********  ");
    }
/* FUNCION PARA COMPARAR LOS MOVIMIENTOS DE LOS JUGADORES
    */
    public int compararMovimiento(int usuarioPrimer, int usuarioSegundo) {
        /* SI EL MOVIMIENTO DE AMBOS JUGADORES SON IGUALES 
        ENTOCES EMPATE Y RETORNA CERO.
        */
        if (usuarioPrimer == usuarioSegundo) {
            return 0;
        }
        /* SI NO SON IGUALES ENTONCES...
        */

        switch (usuarioPrimer) {
        //JUGADA DE USUARIO PAPEL
            case 0:
                //JUGADA DE COMPUTADORA ES ROCA
                if (usuarioSegundo == 2) {
                    //GANA USUARIO PAPEL
                    return 1;
                } else {
                    //PIERDE USUARIO PAPEL
                    return -1;
                }
        //JUGADA DE USUARIO TIJERA
            case 1:
                //JUGADA DE COMPUTADORA ES PAPEL
                if (usuarioSegundo == 0) {
                    //GANA USUARIO TIJERA
                    return 1;
                } else {
                    //PIERDE USUARIO TIJERA
                    return -1;
                }
        //JUGADA DE USUARIO ROCA
            case 2:
                //JUGADA DE COMPUTADORA ES TIJERA
                if (usuarioSegundo == 1) {
                    //GANA USUARIO ROCA
                    return 1;
                } else {
                    //PIERDE USUARIO ROCA 
                    return -1;
                }

            default:
                return 0;

        }
    }

/* FUNCION PARA QUE LE PREGUNTE SI QUIERE JUGAR
    */
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
