package es.uah.eedd.listas.ListaSimplementeEnlazada;

// Interfaz del iterador para la lista simple
public interface InterfazIteradorSimple<T> {

    // Indica si todavía quedan elementos por recorrer
    boolean hasNext();

    // Devuelve el siguiente dato del recorrido
    T next();
}
