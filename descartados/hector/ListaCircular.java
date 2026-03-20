package es.uah.eedd.listas.ListaCircular;

// Implementación de una lista circular genérica cuyos elementos se pueden comparar
public class ListaCircular<T extends Comparable<T>> implements InterfazListaCircular<T> {

    // Referencia al primer nodo de la lista
    protected NodoCircular<T> primero;

    // Referencia al último nodo de la lista
    protected NodoCircular<T> ultimo;

    // Variable para guardar el tamaño actual de la lista
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
        // Creamos un nuevo nodo con el dato que queremos insertar
        NodoCircular<T> nuevo = new NodoCircular<>(dato);

        // Si la lista está vacía, el nuevo nodo será el primero y el último
        if (primero == null) {
            primero = nuevo;
            ultimo = nuevo;

            // Como la lista es circular, el nodo apunta a sí mismo
            primero.siguiente = primero;
        } else {
            // Si la lista no está vacía, enlazamos el nuevo nodo al final
            ultimo.siguiente = nuevo;
            ultimo = nuevo;

            // El último siempre debe apuntar al primero para mantener la circularidad
            ultimo.siguiente = primero;
        }

        // Aumentamos el tamaño de la lista
        tamano++;
    }

    @Override
    public T get(T dato) {
        // Si la lista está vacía, no hay nada que buscar
        if (primero == null) {
            return null;
        }

        // Empezamos a recorrer desde el primer nodo
        NodoCircular<T> aux = primero;

        // Recorremos toda la lista hasta volver al inicio
        do {
            // Si encontramos el dato, lo devolvemos
            if (aux.dato.compareTo(dato) == 0) {
                return aux.dato;
            }

            // Avanzamos al siguiente nodo
            aux = aux.siguiente;

        } while (aux != primero);

        // Si terminamos el recorrido y no está, devolvemos null
        return null;
    }

    @Override
    public T del(T dato) {
        // Si la lista está vacía, no se puede eliminar nada
        if (primero == null) {
            return null;
        }

        // Caso especial: solo hay un nodo en la lista
        if (primero == ultimo) {
            if (primero.dato.compareTo(dato) == 0) {
                T eliminado = primero.dato;

                // La lista se queda vacía
                primero = null;
                ultimo = null;
                tamano--;

                return eliminado;
            }

            return null;
        }

        // Nodo actual que estamos revisando
        NodoCircular<T> actual = primero;

        // Nodo anterior al actual
        NodoCircular<T> anterior = ultimo;

        // Recorremos la lista completa
        do {
            // Si encontramos el dato que queremos eliminar
            if (actual.dato.compareTo(dato) == 0) {
                T eliminado = actual.dato;

                // Si el nodo a borrar es el primero
                if (actual == primero) {
                    primero = primero.siguiente;
                    ultimo.siguiente = primero;
                }
                // Si el nodo a borrar es el último
                else if (actual == ultimo) {
                    ultimo = anterior;
                    ultimo.siguiente = primero;
                }
                // Si el nodo está en medio, simplemente lo saltamos
                else {
                    anterior.siguiente = actual.siguiente;
                }

                // Reducimos el tamaño de la lista
                tamano--;

                return eliminado;
            }

            // Avanzamos en el recorrido
            anterior = actual;
            actual = actual.siguiente;

        } while (actual != primero);

        // Si no se encuentra el dato, devolvemos null
        return null;
    }

    @Override
    public InterfazIteradorCircular<T> iteratorCircular() {
        // Devuelve un iterador para poder recorrer la lista circular
        return new IteradorCircular<>(primero);
    }
}
