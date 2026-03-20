package es.uah.eedd.listas.ListaCircular;

// Clase que implementa un iterador para recorrer una lista circular
public class IteradorCircular<T extends Comparable<T>> implements InterfazIteradorCircular<T> {

    // Guarda la referencia al primer nodo de la lista
    private NodoCircular<T> primero;

    // Nodo en el que está actualmente el iterador
    private NodoCircular<T> actual;

    // Sirve para controlar si ya se ha dado la primera vuelta
    private boolean primeraVuelta;

    // Constructor del iterador
    public IteradorCircular(NodoCircular<T> primero) {
        this.primero = primero;
        this.actual = primero;
        this.primeraVuelta = true;
    }

    @Override
    public boolean hasNext() {
        // Si la lista está vacía, no hay elementos que recorrer
        if (actual == null) {
            return false;
        }

        // Se puede seguir mientras no hayamos vuelto al inicio
        // después de recorrer toda la lista
        return primeraVuelta || actual != primero;
    }

    @Override
    public T next() {
        // Si no hay siguiente elemento, devolvemos null
        if (!hasNext()) {
            return null;
        }

        // Guardamos el dato del nodo actual
        T dato = actual.dato;

        // Avanzamos al siguiente nodo
        actual = actual.siguiente;

        // Marcamos que ya hemos empezado a recorrer la lista
        primeraVuelta = false;

        return dato;
    }

    @Override
    public void reset() {
        // Volvemos a colocar el iterador al principio
        actual = primero;
        primeraVuelta = true;
    }
}
