package es.uah.eedd.listas.PilayCola;

// Implementación de una pila usando una lista enlazada
public class Pila<T extends Comparable<T>> implements InterfazPila<T> {

    // La pila se apoya en una lista para guardar los elementos
    private Lista<T> lista;

    // Constructor de la pila
    public Pila() {
        this.lista = new Lista<>();
    }

    @Override
    public boolean isEmpty() {
        // La pila está vacía si la lista también lo está
        return lista.isEmpty();
    }

    @Override
    public int getSize() {
        // Devuelve el tamaño de la pila
        return lista.getSize();
    }

    @Override
    public void push(T dato) {
        // Para que la pila funcione en modo LIFO,
        // insertamos el elemento al principio de la lista

        Nodo<T> nuevo = new Nodo<>(dato);

        // Si la lista está vacía, el nuevo nodo será el primero y el último
        if (lista.primero == null) {
            lista.primero = nuevo;
            lista.ultimo = nuevo;
        } else {
            // Enlazamos el nuevo nodo al principio
            nuevo.siguiente = lista.primero;
            lista.primero = nuevo;
        }

        // Aumentamos el tamaño de la lista
        lista.tamano++;
    }

    @Override
    public T peek() {
        // Devuelve el elemento de arriba de la pila sin eliminarlo
        return lista.getPrimero();
    }

    @Override
    public T pop() {
        // Elimina y devuelve el elemento que está arriba de la pila
        return lista.delPrimero();
    }
}
