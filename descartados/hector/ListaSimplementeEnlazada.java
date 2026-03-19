package es.uah.eedd.listas;

public class ListaSimplementeEnlazada<T extends Comparable<T>> implements Lista<T> {

    protected ElementoSE<T> primero;
    protected int tamaño = 0;

    @Override
    public void add(T dato) {
        ElementoSE<T> nuevo = new ElementoSE<>(dato);

        if (primero == null) {
            primero = nuevo;
        } else {
            ElementoSE<T> aux = primero;

            while (aux.siguiente != null) {
                aux = aux.siguiente;
            }

            aux.siguiente = nuevo;
        }

        tamaño++;
    }

    @Override
    public T get(T dato) {
        ElementoSE<T> aux = primero;

        while (aux != null) {
            if (aux.dato.compareTo(dato) == 0) {
                return aux.dato;
            }
            aux = aux.siguiente;
        }

        return null;
    }

    @Override
    public T del(T dato) {
        ElementoSE<T> act = primero;
        ElementoSE<T> ant = null;

        while (act != null) {
            if (act.dato.compareTo(dato) == 0) {
                if (ant == null) {
                    primero = act.siguiente;
                } else {
                    ant.siguiente = act.siguiente;
                }

                tamaño--;
                return act.dato;
            }

            ant = act;
            act = act.siguiente;
        }

        return null;
    }


    @Override
    public boolean isEmpty() {
        return primero == null;
    }

    @Override
    public int getSize() {
        return tamaño;
    }

    @Override
    public MiIterador<T> getIterador() {
        return new IteradorLSE<>(primero);
    }
}
