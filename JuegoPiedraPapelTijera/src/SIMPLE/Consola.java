/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SIMPLE;

import java.util.Scanner;

/**
 *
 * @author andres
 */
public class Consola {

    public static void main(String[] args) {
        Scanner inputScanner;
        boolean valoropcion = false;
        Jugador jugador = new Mover("JUGADOR", 0);
        Jugador computer = new Mover("COMPUTADORA", 0);
        Juego juego = new Juego();

        System.out.print("\n ******** COMENZAR JUEGO ********  ");
        do {
            inputScanner = new Scanner(System.in);
            //entrada de usuario por consola
            System.out.print("\n        ESCRIBE ");
            System.out.print("\n ¿ PAPEL,TIJERA ,ROCA ? => ");
            //OBTENER ENTRADA
            String usuarioInput = inputScanner.nextLine();
            //CONVERTIR A MASYUSCULA LA ENTRADA
            usuarioInput = usuarioInput.toUpperCase();
            //JUGADA DE LA COMPUTADORA ALEATORIO
            computer = juego.aleatorio(computer);
            //OPCION DE LA JUGADA DEL USUARIO
            switch (usuarioInput.charAt(0)) {
                case 'P':
                    jugador.SetTipo("PAPEL");
                    juego.comenzarJuego(jugador, computer);
                    break;
                case 'T':
                    jugador.SetTipo("TIJERA");
                    juego.comenzarJuego(jugador, computer);
                    break;
                case 'R':
                    jugador.SetTipo("ROCA");
                    juego.comenzarJuego(jugador, computer);
                    break;
                default:
                    System.out.print("\n !OPCIÓN INCORRECTA! ");
                    valoropcion = true;
                    break;
            }
            /*
            LE PREGUNTAMOS SI QUIERE JUGAR NUEVAMENTE,
                SI NO QUIERE JUGAR NUVAMENTE TERMINA EL JUEGO
                Y MUESTRA LAS ESTADISTICAS,CASO CONTRARIO
            LE PEDIREMOS QUE INGRESE SU NUEVA JUGADA.
             */
            if (!valoropcion) {
                if (!juego.playAgain(inputScanner)) {
                    valoropcion = true;
                }
            } else {
                valoropcion = false;
            }
        } while (!valoropcion);
        /*
           MOSTRAR ESTADISTICAS
            
         */
        juego.estadisticaDelJuego(jugador, computer);
    }
}
