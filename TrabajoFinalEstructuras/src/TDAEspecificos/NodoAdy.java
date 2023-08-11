/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDAEspecificos;

/**
 *
 * @author Leo
 */
public class NodoAdy {
    private NodoVert vertice;
    private NodoAdy sigAdyacente;
    private Object etiqueta;

    public NodoAdy(NodoVert vertice, NodoAdy sigAdyacente, Object etiqueta) {
        this.vertice = vertice;
        this.sigAdyacente = sigAdyacente;
        this.etiqueta = etiqueta;
    }

    public Object getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(Object etiqueta) {
        this.etiqueta = etiqueta;
    }

    public NodoVert getVertice() {
        return vertice;
    }

    public void setVertice(NodoVert vertice) {
        this.vertice = vertice;
    }

    public NodoAdy getSigAdyacente() {
        return sigAdyacente;
    }

    public void setSigAdyacente(NodoAdy sigAdyacente) {
        this.sigAdyacente = sigAdyacente;
    }
    
}
