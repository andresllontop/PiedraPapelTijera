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

    /*SE APLICÓ EL PATRON DE DISEÑO BUILDER,
        ES DECIR VARIOS CONSTRUCTORES DE UNA CLASE...
        EN LA CLASE HIJA "MOVER" ASIGNAMOS MUCHOS CONSTRUCTORES 
        PARA LAS DIFERENTES FUNCIONALIDADES QUE DESEAMOS APLICAR,
        POR EJEMPLO: INGRESAR SOLO EL NOMBRE DEL JUGADOR O EL PUNTAJE Y NOMBRE DEL JUGADOR.
  
     */
 /*SE APLICÓ EL PATRON DE DISEÑO FACADE,
        ES DECIR QUE OTROS SUBSISTEMAS PUEDEN ACCEDER A NUESTRO SISTEMA Y CADA SUBSISTEMA CON SU OPERACION PROPIA...
        EN LA CLASE ABSTRACTA PADRE "JUGADOR"(SISTEMA), 
    CREAMOS ATRIBUTOS ABSTRACTACTOS QUE VAN HEREDAR DE LA CLASE HIJA JUGADOR(SUBSISTEMA) QUIEN VA 
    A REALIZAR SU PROPIA OPERACION... Y PORQUE SE DEFINIÓ LA CLASE PADRE ABSTRACTA EN VEZ QUE UNA INTERFACE,ES POR LAS SIMPLE
    RAZÓN DE QUE PODEMOS AGREGAR CUERPO A ESA CLASE...
    
    EN EL JUEGO DE PIEDRA PAPEL, TIJERA Y ROCA SE DEFINIÓ LA CLASE PADRE DONDE SERÁ EL JUGADOR(USUARIO, COMPUTADORA);
    Y LAS CLASE HIJA MOVER(TIJERA,ROCA,PAPEL)...
    SE DEFINIÓ DOS OBJETOS JUGADOR:USUARIO,COMPUTADORA; 
    CADA JUGADOR CON UN OBJETO MOVER,
    POR LO TANTO NO SE CREARON MAS DE DOS OBJETOS MOVER POR CADA JUGADA,
    SOLAMENTE SE MODIFICARÁ EL TIPO DE MOVIMIENTO ES DECIR (ROCA, PAPEL, TIJERA) Ó (2,0,1).
   
     */
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
