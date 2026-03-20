package es.uah.eedd.listas.ListaCircular;

// Clase que representa un nodo de la lista circular
public class NodoCircular<T> {

    // Dato que guarda el nodo
    protected T dato;

    // Referencia al siguiente nodo
    protected NodoCircular<T> siguiente;

    // Constructor del nodo
    public NodoCircular(T dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}
