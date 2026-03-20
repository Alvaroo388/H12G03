package es.uah.eedd.listas.PilayCola;

// Interfaz que define las operaciones básicas de una lista enlazada
public interface InterfazLista<T extends Comparable<T>> {

    // Comprueba si la lista está vacía
    boolean isEmpty();

    // Devuelve el número de elementos de la lista
    int getSize();

    // Añade un elemento al final de la lista
    void add(T dato);

    // Busca un elemento y lo devuelve si existe
    T get(T dato);

    // Elimina un elemento de la lista y lo devuelve
    T del(T dato);

    // Devuelve el primer elemento de la lista
    T getPrimero();

    // Elimina el primer elemento de la lista y lo devuelve
    T delPrimero();

    // Devuelve un iterador para recorrer la lista
    InterfazIterador<T> iterator();
}
