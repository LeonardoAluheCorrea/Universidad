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
public class Mozo extends Persona implements Runnable {
    private MesaComedor mesa;
    private MesaComedor mesaB;
    
    public Mozo(String nombreApellido, MesaComedor mesa, MesaComedor mesaB) {
        super(nombreApellido);
        this.mesa = mesa;
        this.mesaB = mesaB;
    }

    @Override
    public void run() {
            System.out.println("El mozo realiza su hobby mientras espera...");
            mesa.servirBebida();
            System.out.println("El mozo realiza su hobby mientras espera...");
            mesaB.servirBebida();
            System.out.println("El mozo realiza su hobby mientras espera...");
    }
    
}
