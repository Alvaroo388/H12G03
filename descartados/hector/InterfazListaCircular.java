package es.uah.eedd.listas.ListaCircular;

// Interfaz que define las operaciones básicas de una lista circular
public interface InterfazListaCircular<T extends Comparable<T>> {

    // Comprueba si la lista está vacía
    boolean isEmpty();

    // Devuelve el número de elementos de la lista
    int getSize();

    // Añade un elemento a la lista
    void add(T dato);

    // Busca un elemento y lo devuelve si existe
    T get(T dato);

    // Elimina un elemento de la lista y lo devuelve
    T del(T dato);

    // Devuelve un iterador para recorrer la lista circular
    InterfazIteradorCircular<T> iteratorCircular();
}
