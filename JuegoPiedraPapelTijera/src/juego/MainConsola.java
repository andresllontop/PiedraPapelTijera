/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

import java.util.Scanner;

/**
 *
 * @author andres
 */
public class MainConsola {

    public boolean playAgain(Scanner input) {
        System.out.print("\n Quieres Jugar Nuevamente ? SI o NO => ");
        //OBTENER ENTRADA
        String usuarioInput = input.nextLine();
        //CONVERTIR A MASYUSCULA LA ENTRADA
        usuarioInput = usuarioInput.toUpperCase();
        //CAPTURA LA PRIMERA LETRA Y LO COMPARA PARA RETORNAR VERDADERO O FALSO
        return usuarioInput.charAt(0) == 'S';
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner inputScanner;
        MainConsola consola = new MainConsola();
        int valoropcion = 0;
        char primeraLetra;
        Juego juego = new Juego();
        System.out.print("\n ******** COMENZAR JUEGO ********  ");
        do {
            inputScanner = new Scanner(System.in);
            //entrada de usuario por consola
            System.out.print("\n ¿ PAPEL,TIJERA ,ROCA? => ");
            //OBTENER ENTRADA
            String usuarioInput = inputScanner.nextLine();
            //CONVERTIR A MASYUSCULA LA ENTRADA
            usuarioInput = usuarioInput.toUpperCase();
            //capturar la primera letra
            primeraLetra = usuarioInput.charAt(0);

            switch (primeraLetra) {
                case 'P':
                    valoropcion = 0;
                    break;
                case 'T':
                    valoropcion = 1;
                    break;
                case 'R':
                    valoropcion = 2;
                    break;
                default:
                    System.out.print("\n !OPCIÓN INCORRECTA! ");
                    valoropcion = -1;
                    break;
            }

            if (valoropcion != -1) {
                juego.comenzarJuego(valoropcion);
                if (!consola.playAgain(inputScanner)) {
                    juego.estadisticaDelJuego();
                    valoropcion = -1;
                } else {
                    System.out.println();

                }
            } else {
                valoropcion = 0;
            }

        } while (valoropcion != -1);

    }

}
