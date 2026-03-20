package es.uah.eedd.listas.PilayCola;

// Interfaz que define las operaciones básicas de un iterador
public interface InterfazIterador<T> {

    // Indica si todavía quedan elementos por recorrer
    boolean hasNext();

    // Devuelve el siguiente elemento
    T next();

    // Reinicia el iterador para volver al principio
    void reset();
}
