package es.uah.eedd.listas.PilayCola;

// Interfaz que define las operaciones básicas de una pila
public interface InterfazPila<T extends Comparable<T>> {

    // Comprueba si la pila está vacía
    boolean isEmpty();

    // Devuelve el número de elementos de la pila
    int getSize();

    // Inserta un elemento en la cima de la pila
    void push(T dato);

    // Devuelve el elemento de la cima sin eliminarlo
    T peek();

    // Elimina y devuelve el elemento de la cima
    T pop();
}
