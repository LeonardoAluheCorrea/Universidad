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
public class Empleado extends Persona implements Runnable {
    private MesaComedor mesa;
    private MesaComedor mesaB;
    
    public Empleado(String nombreApellido, MesaComedor mesa, MesaComedor mesaB) {
        super(nombreApellido);
        this.mesa = mesa;
        this.mesaB = mesaB;
    }

    @Override
    public void run() {
        MesaComedor mesaActual = mesa;
        int orden;
        orden = (int) (Math.random() * 3 + 1);
        System.out.println("Llega el empleado " + this.getNombreApellido() + " ,busca una mesa");
        if (!mesa.ocuparSilla()){
            System.out.println("Prueba otra mesa");
            if (!mesaB.ocuparSilla()){
                System.out.println("Todas las mesas estan ocupada, el empleado " + this.getNombreApellido() + " se va");
                orden = 5;
            }
            else{
                mesaActual = mesaB;
            }
        }
        System.out.println(this.getNombreApellido() + " se sienta en la mesa " + mesaActual.getNro());
        switch(orden){
            case 1:
                System.out.println(mesaActual.getNro() + " pide una bebida");
                mesaActual.ordenarBebida();
                mesaActual.consumir();
                mesaActual.irse();
                break;
            case 2:
                System.out.println(mesaActual.getNro() + " pide un plato de comida");
                mesaActual.ordenarComida();
                mesaActual.consumir();
                mesaActual.irse();
                break;
            case 3:
                System.out.println(this.getNombreApellido() + " pide una bebida");
                mesaActual.ordenarBebida();
                mesaActual.consumir();
                System.out.println("Ahora, " + mesaActual.getNro() + " pide un plato de comida");
                mesaActual.ordenarComida();
                mesaActual.consumir();
                mesaActual.irse();
        }
    }
    
}
