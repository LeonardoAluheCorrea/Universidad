/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabajoPracticoRendezvous;

import TrabajoPracticoRendezvous.Objetos.DualSynch;

/**
 *
 * @author Leo
 */
public class problema02 {

    public static void main(String[] args) {
        final DualSynch ds = new DualSynch();
        Thread hilo = new Thread() {
            public void run() {
                ds.f();
            }
        };
        hilo.start();
        ds.g();

    }
}
