package es.uah.eedd.listas.ListaDomblementeEnlazada;

// Iterador para recorrer una lista doblemente enlazada
public class IteradorListaDoble<T> implements InterfazIteradorDoble<T> {

    // Nodo en el que está ahora mismo el iterador
    private NodoDoble<T> actual;

    // El recorrido arranca en el primer nodo de la lista
    public IteradorListaDoble(NodoDoble<T> comienzo) {
        this.actual = comienzo;
    }

    // Si actual no es null, sigue habiendo elementos
    @Override
    public boolean hasNext() {
        return actual != null;
    }

    // Devuelve el dato actual y pasa al siguiente nodo
    @Override
    public T next() {
        if (!hasNext()) {
            return null;
        }

        T dato = actual.dato;
        actual = actual.siguiente;
        return dato;
    }
}
