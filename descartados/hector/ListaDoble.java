package es.uah.eedd.listas.ListaDomblementeEnlazada;

// Implementación de una lista doblemente enlazada
public class ListaDoble<T extends Comparable<T>> implements InterfazListaDoble<T> {

    // Primer nodo de la lista
    protected NodoDoble<T> primero;

    // Último nodo de la lista
    protected NodoDoble<T> ultimo;

    // Cantidad de elementos guardados
    protected int tamaño = 0;

    // Añade un dato al final de la lista
    @Override
    public void add(T dato) {
        NodoDoble<T> nuevo = new NodoDoble<>(dato);

        // Si no hay elementos, primero y último son el nuevo nodo
        if (isEmpty()) {
            primero = nuevo;
            ultimo = nuevo;
        } else {
            // Si ya hay nodos, enlazamos el nuevo detrás del último
            ultimo.siguiente = nuevo;
            nuevo.anterior = ultimo;
            ultimo = nuevo;
        }

        // Sumamos uno al tamaño total
        tamaño++;
    }

    // Busca un dato recorriendo la lista desde el principio
    @Override
    public T get(T dato) {
        NodoDoble<T> aux = primero;

        // Se revisan los nodos uno a uno
        while (aux != null) {
            if (aux.dato.compareTo(dato) == 0) {
                return aux.dato;
            }

            aux = aux.siguiente;
        }

        // Si no aparece, devolvemos null
        return null;
    }

    // Elimina el nodo que contiene el dato recibido
    @Override
    public T del(T dato) {
        NodoDoble<T> aux = primero;

        // Recorremos la lista hasta encontrar el nodo correcto
        while (aux != null) {
            if (aux.dato.compareTo(dato) == 0) {

                // Si es el primero, actualizamos el inicio
                if (aux.anterior == null) {
                    primero = aux.siguiente;
                } else {
                    aux.anterior.siguiente = aux.siguiente;
                }

                // Si es el último, actualizamos el final
                if (aux.siguiente == null) {
                    ultimo = aux.anterior;
                } else {
                    aux.siguiente.anterior = aux.anterior;
                }

                // Al borrar un nodo, reducimos el tamaño
                tamaño--;
                return aux.dato;
            }

            aux = aux.siguiente;
        }

        // Si no se encuentra, devolvemos null
        return null;
    }

    // Comprueba si la lista no tiene elementos
    @Override
    public boolean isEmpty() {
        return primero == null;
    }

    // Devuelve el tamaño actual de la lista
    @Override
    public int getSize() {
        return tamaño;
    }

    // Devuelve un iterador para recorrer la lista desde el principio
    @Override
    public InterfazIteradorDoble<T> getIterador() {
        return new IteradorListaDoble<>(primero);
    }
}
