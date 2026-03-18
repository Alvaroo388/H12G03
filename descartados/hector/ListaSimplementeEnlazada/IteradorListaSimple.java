package es.uah.eedd.listas.ListaSimplementeEnlazada;

// Iterador encargado de recorrer una lista simple
public class IteradorListaSimple<T> implements InterfazIteradorSimple<T> {

    // Marca el nodo actual del recorrido
    private NodoSimple<T> actual;

    // El iterador empieza a recorrer desde el primer nodo
    public IteradorListaSimple(NodoSimple<T> comienzo) {
        this.actual = comienzo;
    }

    // Mientras actual no sea null, todavía quedan datos
    @Override
    public boolean hasNext() {
        return actual != null;
    }

    // Devuelve el dato actual y avanza una posición
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
