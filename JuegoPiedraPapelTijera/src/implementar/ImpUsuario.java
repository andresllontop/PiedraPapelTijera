/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementar;

import interfaces.InterfaceUsuario;

/**
 *
 * @author andres
 */
public class ImpUsuario implements InterfaceUsuario {

    // private Scanner inputScanner;
    private String nombre = "USUARIO";
    private int puntaje;

    public ImpUsuario() {

    }

    public ImpUsuario(int puntaje) {
        //this.inputScanner = new Scanner(System.in);
        this.puntaje = puntaje;
    }

    @Override
    public int getMover(Mover mover, int valor) {
        switch (valor) {
            case 0:
                return mover.crearPapel(this.getNombre()).getIndice();
            case 1:
                return mover.crearTijera(this.getNombre()).getIndice();
            case 2:
                return mover.crearRoca(this.getNombre()).getIndice();
            default:
                //SOLICITAR NUEVAMENTE LA ENTRADA
                System.out.print("\n OPCIÓN INCORRECTA ");
                return -1;
        }
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombreUsuario) {
        this.nombre = nombreUsuario;
    }

    @Override
    public int getPuntaje() {
        return puntaje;
    }

    @Override
    public void setPuntaje(int puntaje) {
        this.puntaje = this.puntaje + puntaje;
    }

}
