package es.uah.eedd.listas.PilayCola;

// Implementación de una lista simplemente enlazada genérica
public class Lista<T extends Comparable<T>> implements InterfazLista<T> {

    // Referencia al primer nodo de la lista
    protected Nodo<T> primero;

    // Referencia al último nodo de la lista
    protected Nodo<T> ultimo;

    // Variable para guardar el tamaño de la lista
    protected int tamano = 0;

    @Override
    public boolean isEmpty() {
        // Devuelve true si la lista está vacía
        return primero == null;
    }

    @Override
    public int getSize() {
        // Devuelve el número de elementos de la lista
        return tamano;
    }

    @Override
    public void add(T dato) {
        // Creamos un nuevo nodo con el dato
        Nodo<T> nuevo = new Nodo<>(dato);

        // Si la lista está vacía, el nuevo nodo será el primero y el último
        if (primero == null) {
            primero = nuevo;
            ultimo = nuevo;
        } else {
            // Si no está vacía, añadimos el nodo al final
            ultimo.siguiente = nuevo;
            ultimo = nuevo;
        }

        // Aumentamos el tamaño de la lista
        tamano++;
    }

    @Override
    public T get(T dato) {
        // Empezamos a recorrer desde el primer nodo
        Nodo<T> aux = primero;

        // Recorremos la lista hasta encontrar el dato o llegar al final
        while (aux != null) {
            if (aux.dato.compareTo(dato) == 0) {
                return aux.dato;
            }

            aux = aux.siguiente;
        }

        // Si no se encuentra, devolvemos null
        return null;
    }

    @Override
    public T del(T dato) {
        // Si la lista está vacía, no se puede eliminar nada
        if (primero == null) {
            return null;
        }

        // Caso especial: el elemento a borrar está en el primer nodo
        if (primero.dato.compareTo(dato) == 0) {
            T eliminado = primero.dato;
            primero = primero.siguiente;

            // Si la lista queda vacía, actualizamos también ultimo
            if (primero == null) {
                ultimo = null;
            }

            tamano--;
            return eliminado;
        }

        // Usamos dos nodos para recorrer la lista
        Nodo<T> anterior = primero;
        Nodo<T> actual = primero.siguiente;

        // Buscamos el nodo que contiene el dato
        while (actual != null) {
            if (actual.dato.compareTo(dato) == 0) {
                T eliminado = actual.dato;

                // Saltamos el nodo que queremos eliminar
                anterior.siguiente = actual.siguiente;

                // Si era el último, actualizamos la referencia
                if (actual == ultimo) {
                    ultimo = anterior;
                }

                tamano--;
                return eliminado;
            }

            anterior = actual;
            actual = actual.siguiente;
        }

        // Si no se encuentra, devolvemos null
        return null;
    }

    @Override
    public T getPrimero() {
        // Si la lista está vacía, devolvemos null
        if (primero == null) {
            return null;
        }

        // Devuelve el dato del primer nodo
        return primero.dato;
    }

    @Override
    public T delPrimero() {
        // Si la lista está vacía, no hay nada que eliminar
        if (primero == null) {
            return null;
        }

        // Guardamos el dato del primer nodo
        T eliminado = primero.dato;

        // Movemos primero al siguiente nodo
        primero = primero.siguiente;

        // Si la lista queda vacía, también actualizamos ultimo
        if (primero == null) {
            ultimo = null;
        }

        tamano--;

        return eliminado;
    }

    @Override
    public InterfazIterador<T> iterator() {
        // Devuelve un iterador para recorrer la lista
        return new IteradorLista<>(primero);
    }
}
