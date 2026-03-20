package es.uah.eedd.listas.PilayCola;

// Clase que representa un nodo de una lista simplemente enlazada
public class Nodo<T> {

    // Dato que guarda el nodo
    protected T dato;

    // Referencia al siguiente nodo de la lista
    protected Nodo<T> siguiente;

    // Constructor del nodo
    public Nodo(T dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}
