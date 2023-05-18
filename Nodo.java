
package listas.poo;

public class Nodo {
    
    //Atributos (los atributos salen de la abstracción)
    private int Dato;
    private Nodo Liga;
    
    //Métodos (el infaltable es constructor)
    
    public Nodo() { 
        this.Dato = 0;
        this.Liga = null;
    }
    
    public Nodo(int d) { //no se manda la liga y el inicio de la liga se pone en null; Dato se cambia por d
        this.Dato = d;
        this.Liga = null;
    }

    public int getDato() {
        return Dato;
    }

    public void setDato(int Dato) {
        this.Dato = Dato;
    }

    public Nodo getLiga() {
        return Liga;
    }

    public void setLiga(Nodo Liga) {
        this.Liga = Liga;
    }
    
    
}
