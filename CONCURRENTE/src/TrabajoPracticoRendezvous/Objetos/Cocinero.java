/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabajoPracticoRendezvous.Objetos;

/**
 *
 * @author Leo
 */
public class Cocinero extends Persona implements Runnable{
    private MesaComedor mesa;
    private MesaComedor mesaB;
    
    public Cocinero(String nombreApellido, MesaComedor mesa, MesaComedor mesaB) {
        super(nombreApellido);
        this.mesa = mesa;
        this.mesaB = mesaB;
    }

    @Override
    public void run() {
            System.out.println("El cocinero ordena su cocina mientras espera...");
            mesa.servirComida();
            System.out.println("El cocinero ordena su cocina mientras espera...");
            mesaB.servirComida();
    }
    
}
