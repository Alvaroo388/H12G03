package es.uah.eedd.listas;

public class IteradorLSE<T extends Comparable<T>> implements MiIterador<T> {

    private ElementoSE<T> actual;

    public IteradorLSE(ElementoSE<T> primero) {
        this.actual = primero;
    }

    @Override
    public boolean hasNext() {
        return actual != null;
    }

    @Override
    public T next() {
        T datoActual = actual.dato;
        actual = actual.siguiente;
        return datoActual;
    }
}