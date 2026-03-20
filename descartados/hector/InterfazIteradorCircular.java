package es.uah.eedd.listas.ListaCircular;

// Interfaz para definir el comportamiento básico de un iterador circular
public interface InterfazIteradorCircular<T> {

    // Indica si todavía quedan elementos por recorrer
    boolean hasNext();

    // Devuelve el siguiente elemento del recorrido
    T next();

    // Reinicia el iterador para volver a empezar desde el principio
    void reset();
}
