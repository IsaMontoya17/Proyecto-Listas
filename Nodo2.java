
package listas.poo;

public class Nodo2 {
    
    private int Dato;
    private Nodo2 LigaD, LigaI;

    public Nodo2() { 
        this.Dato = 0;
        this.LigaD = null;
        this.LigaI = null;
    }
    
    public Nodo2(int d) {
        this.Dato = d;
        this.LigaD = null;
        this.LigaI = null;
    }

    public int getDato() {
        return Dato;
    }

    public void setDato(int Dato) {
        this.Dato = Dato;
    }

    public Nodo2 getLigaD() {
        return LigaD;
    }

    public void setLigaD(Nodo2 LigaD) {
        this.LigaD = LigaD;
    }

    public Nodo2 getLigaI() {
        return LigaI;
    }

    public void setLigaI(Nodo2 LigaI) {
        this.LigaI = LigaI;
    }
 
}
