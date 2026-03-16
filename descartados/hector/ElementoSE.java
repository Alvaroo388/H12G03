package es.uah.eedd.listas;

public class ElementoSE<T extends Comparable<T>> {
    T dato;
    ElementoSE<T> siguiente;

    public ElementoSE(T dato) {
        this.dato=dato;
        this.siguiente=null;
    }
}
