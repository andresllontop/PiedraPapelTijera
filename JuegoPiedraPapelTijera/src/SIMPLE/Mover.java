/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SIMPLE;

/**
 *
 * @author andres
 */
//CLASE HIJO
public class Mover extends Jugador {
    private String tipo;
    private int indice;
    //TIPO=INDICE;
    //PAPEL=0;
    //TIJERA=1;
    //ROCA=2;

    //CONSTRUCTOR QUE INGRESA EL JUGADOR, PUNTAJE Y TIPO DE MOVIMIENTO(NOMBRE)
    public Mover(String jugador, int puntaje, String tipo) {
        // INGRESAMOS NOMBRE Y PUNTAJE AL CONSTRUCTOR PADRE(JUGADOR)
        super(jugador, puntaje);
        //INGRESAMOS TPO DE MOVIMIENTO: PIEDRA,PAPEL,TIJERA
        this.tipo = tipo;

    }

    //CONSTRUCTOR QUE INGRESA EL JUGADOR, TIPO DE MOVIMIENTO(NOMBRE Y NUMERO)
    public Mover(String jugador, String tipo, int indice) {
        super(jugador);
        this.tipo = tipo;
        this.indice = indice;
    }

    //CONSTRUCTOR CON EL NOMBRE DEL JUGADOR
    public Mover(String jugador) {
        super(jugador);
    }

    //CONSTRUCTOR CON EL NOMBRE Y PUNTAJE DEL JUGADOR
    public Mover(String jugador, int puntaje) {
        super(jugador, puntaje);
    }

    @Override
    public String getTipo() {
        return this.tipo;
    }

    @Override
    public void SetTipo(String tipo) {
        switch (tipo) {
            case "PAPEL":
                this.indice = 0;
                break;
            case "TIJERA":
                this.indice = 1;
                break;
            case "ROCA":
                this.indice = 2;
                break;
        }
        this.tipo = tipo;
    }

    @Override
    public int getIndice() {
        System.out.println(this.getJugador() + " ---> seleccionaste: " + this.tipo + " ");
        return this.indice;
    }

    @Override
    public void SetIndice(int indice) {
        switch (indice) {
            case 0:
                this.tipo = "PAPEL";
                break;
            case 1:
                this.tipo = "TIJERA";
                break;
            case 2:
                this.tipo = "ROCA";
                break;
        }
        this.indice = indice;
    }

}
