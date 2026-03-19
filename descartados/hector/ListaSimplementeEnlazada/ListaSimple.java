package es.uah.eedd.listas.ListaSimplementeEnlazada;

// Implementación de una lista simplemente enlazada
public class ListaSimple<T extends Comparable<T>> implements InterfazListaSimple<T> {

    // Primer nodo de la lista
    protected NodoSimple<T> primero;

    // Número de elementos guardados
    protected int tamaño = 0;

    // Añade un nuevo dato al final de la lista
    @Override
    public void add(T dato) {
        NodoSimple<T> nuevo = new NodoSimple<>(dato);

        // Si la lista está vacía, el nuevo pasa a ser el primero
        if (primero == null) {
            primero = nuevo;
        } else {
            // Si no está vacía, avanzamos hasta el último nodo
            NodoSimple<T> aux = primero;

            while (aux.siguiente != null) {
                aux = aux.siguiente;
            }

            // Enlazamos el nuevo nodo al final
            aux.siguiente = nuevo;
        }

        // Actualizamos el tamaño después de insertar
        tamaño++;
    }

    // Busca un dato dentro de la lista
    @Override
    public T get(T dato) {
        NodoSimple<T> aux = primero;

        // Recorremos nodo a nodo hasta encontrarlo o llegar al final
        while (aux != null) {
            if (aux.dato.compareTo(dato) == 0) {
                return aux.dato;
            }

            aux = aux.siguiente;
        }

        // Si no aparece, devolvemos null
        return null;
    }

    // Elimina el primer nodo cuyo dato coincida
    @Override
    public T del(T dato) {
        NodoSimple<T> actual = primero;
        NodoSimple<T> anterior = null;

        // Vamos recorriendo la lista hasta encontrar el dato
        while (actual != null) {
            if (actual.dato.compareTo(dato) == 0) {

                // Si está en el primer nodo, movemos el inicio
                if (anterior == null) {
                    primero = actual.siguiente;
                } else {
                    // Si está en medio o al final, saltamos ese nodo
                    anterior.siguiente = actual.siguiente;
                }

                // Al borrar, el tamaño baja en una unidad
                tamaño--;
                return actual.dato;
            }

            anterior = actual;
            actual = actual.siguiente;
        }

        // Si no se encuentra el dato, no se borra nada
        return null;
    }

    // Comprueba si la lista está vacía
    @Override
    public boolean isEmpty() {
        return primero == null;
    }

    // Devuelve cuántos elementos hay
    @Override
    public int getSize() {
        return tamaño;
    }

    // Crea un iterador empezando desde el primer nodo
    @Override
    public InterfazIteradorSimple<T> getIterador() {
        return new IteradorListaSimple<>(primero);
    }
}
