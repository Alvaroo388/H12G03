package es.uah.eedd.listas.ListaDomblementeEnlazada;

// Interfaz base para una lista doblemente enlazada nueva
public interface InterfazListaDoble<T extends Comparable<T>> {

    // Añade un dato al final de la lista
    void add(T dato);

    // Busca un dato y lo devuelve si existe
    T get(T dato);

    // Elimina un dato de la lista y lo devuelve
    T del(T dato);

    // Comprueba si la lista no tiene elementos
    boolean isEmpty();

    // Devuelve el tamaño actual de la lista
    int getSize();

    // Devuelve un iterador para recorrer la lista
    InterfazIteradorDoble<T> getIterador();
}
