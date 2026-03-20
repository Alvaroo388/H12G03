package es.uah.eedd.listas.ListaSimplementeEnlazada;

// Nodo de apoyo para la lista simplemente enlazada
public class NodoSimple<T> {

    // Dato que se guarda en este nodo
    T dato;

    // Referencia al siguiente nodo de la lista
    NodoSimple<T> siguiente;

    // Crea el nodo con el dato recibido
    NodoSimple(T dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}
