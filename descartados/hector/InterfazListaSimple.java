package es.uah.eedd.listas.ListaSimplementeEnlazada;

// Interfaz base para una lista simplemente enlazada nueva
public interface InterfazListaSimple<T extends Comparable<T>> {

    // Añade un dato al final de la lista
    void add(T dato);

    // Busca un dato y lo devuelve si está guardado
    T get(T dato);

    // Borra un dato de la lista y lo devuelve
    T del(T dato);

    // Indica si la lista está vacía
    boolean isEmpty();

    // Devuelve cuántos elementos hay guardados
    int getSize();

    // Devuelve un iterador para recorrer la lista
    InterfazIteradorSimple<T> getIterador();
}
