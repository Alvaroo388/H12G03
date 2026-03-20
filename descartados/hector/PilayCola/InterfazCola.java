package es.uah.eedd.listas.PilayCola;

// Interfaz que define las operaciones básicas de una cola
public interface InterfazCola<T extends Comparable<T>> {

    // Comprueba si la cola está vacía
    boolean isEmpty();

    // Devuelve el número de elementos de la cola
    int getSize();

    // Inserta un elemento al final de la cola
    void encolar(T dato);

    // Devuelve el primer elemento de la cola sin eliminarlo
    T primero();

    // Elimina y devuelve el primer elemento de la cola
    T desencolar();

    // Devuelve un iterador para recorrer la cola
    InterfazIterador<T> iterator();
}
