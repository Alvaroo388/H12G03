package es.uah.eedd.listas.ListaDomblementeEnlazada;

// Interfaz del iterador para la lista doble
public interface InterfazIteradorDoble<T> {

    // Comprueba si aún queda algún elemento
    boolean hasNext();

    // Devuelve el siguiente dato de la lista
    T next();
}
