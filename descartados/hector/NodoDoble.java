package es.uah.eedd.listas.ListaDomblementeEnlazada;

// Nodo de apoyo para la lista doblemente enlazada
public class NodoDoble<T> {

    // Dato almacenado en el nodo
    T dato;

    // Referencia al nodo siguiente
    NodoDoble<T> siguiente;

    // Referencia al nodo anterior
    NodoDoble<T> anterior;

    // Crea el nodo dejando los enlaces vacíos
    public NodoDoble(T dato) {
        this.dato = dato;
        this.siguiente = null;
        this.anterior = null;
    }
}
