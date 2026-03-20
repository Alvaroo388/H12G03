package es.uah.eedd.listas.PilayCola;

// Clase que implementa un iterador para recorrer una lista enlazada
public class IteradorLista<T> implements InterfazIterador<T> {

    // Guarda el primer nodo de la lista
    private Nodo<T> primero;

    // Nodo actual en el que está el iterador
    private Nodo<T> actual;

    // Constructor del iterador
    public IteradorLista(Nodo<T> primero) {
        this.primero = primero;
        this.actual = primero;
    }

    @Override
    public boolean hasNext() {
        // Hay siguiente mientras el nodo actual no sea null
        return actual != null;
    }

    @Override
    public T next() {
        // Si no hay más elementos, devolvemos null
        if (!hasNext()) {
            return null;
        }

        // Guardamos el dato del nodo actual
        T dato = actual.dato;

        // Avanzamos al siguiente nodo
        actual = actual.siguiente;

        return dato;
    }

    @Override
    public void reset() {
        // Reiniciamos el iterador para volver al principio
        actual = primero;
    }
}
