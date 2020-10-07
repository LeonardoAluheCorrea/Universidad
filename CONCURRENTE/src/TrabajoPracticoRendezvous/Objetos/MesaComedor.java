/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabajoPracticoRendezvous.Objetos;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Leo
 */
public class MesaComedor {
    private int nro;
    private Semaphore consumir;
    private Semaphore comida;
    private Semaphore bebida;
    private Semaphore silla;

    public MesaComedor(int nro) {
        this.nro = nro;
        consumir = new Semaphore(0);
        comida = new Semaphore(0);
        bebida = new Semaphore(0);
        silla = new Semaphore(1);
    }

    public int getNro() {
        return nro;
    }
    
    public void ordenarComida(){
       comida.release();
    }
    
    public void ordenarBebida(){
        bebida.release();
    }
    
    public void consumir(){
        try {
            consumir.acquire();
            System.out.println("La mesa " + nro + " empieza a consumir lo que le trajeron");
            Thread.sleep(7000);
            System.out.println("La mesa " + nro + " consumio su pedido");
        } catch (InterruptedException ex) {
            Logger.getLogger(MesaComedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void irse(){
        System.out.println("Se libera la mesa " + nro);
        silla.release();
    }
    
    public void servirComida(){
        try {
            comida.acquire();
            System.out.println("Prepara la comida para la mesa " + nro);
            Thread.sleep(6000);
            System.out.println("Lista la comida para la mesa " + nro);
            consumir.release();
        } catch (InterruptedException ex) {
            Logger.getLogger(MesaComedor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void servirBebida(){
        try {
            if (comida.tryAcquire()){
                bebida.acquire();
                System.out.println("Busca la bebida para la mesa " + nro);
                Thread.sleep(3000);
                System.out.println("Sirve la bebida en mesa " + nro);
                consumir.release();
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(MesaComedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public boolean ocuparSilla(){
        boolean ocupado;
        ocupado = !silla.tryAcquire();
        if (ocupado){
            System.out.println("La mesa nro " + nro + " esta ocupada, debe buscar otra");
        }
        return !ocupado;
    }
    
}
