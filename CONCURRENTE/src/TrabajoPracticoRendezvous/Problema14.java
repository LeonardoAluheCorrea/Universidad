/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabajoPracticoRendezvous;

import TrabajoPracticoRendezvous.Objetos.Cocinero;
import TrabajoPracticoRendezvous.Objetos.Empleado;
import TrabajoPracticoRendezvous.Objetos.MesaComedor;
import TrabajoPracticoRendezvous.Objetos.Mozo;

/**
 *
 * @author Leo
 */
public class Problema14 {
    
    public static void main(String[]args){
        MesaComedor mesa, mesaB;
        Cocinero cocinero;
        Mozo mozo;
        Empleado emp1, emp2;
        Thread t1, t2, t3, t4;
        mesa = new MesaComedor(1);
        mesaB = new MesaComedor(2);
        cocinero = new Cocinero("", mesa, mesaB);
        mozo = new Mozo("", mesa, mesaB);
        emp1 = new Empleado("A", mesa, mesaB);
        emp2 = new Empleado("B", mesa , mesaB);
        t1 = new Thread(emp1);
        t2 = new Thread(emp2);
        t3 = new Thread(mozo);
        t4 = new Thread(cocinero);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
