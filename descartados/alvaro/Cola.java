package alvaro.martinezcampo_listas;

public class Cola<T extends Comparable<T>> {

    // Primer elemento de la cola (el que entró primero)
    private ElementoDE<T> primero;

    // Último elemento de la cola (el que ha entrado último)
    private ElementoDE<T> ultimo;

    // Tamaño de la cola
    private int size;

    // Constructor: cola vacía
    public Cola() {
        primero = null;
        ultimo = null;
        size = 0;
    }

    //Añadir al final
    public void enqueue(T dato) {
        ElementoDE<T> nuevo = new ElementoDE<>(dato);

        // Si la cola está vacía
        if (isEmpty()) {
            primero = nuevo;
            ultimo = nuevo;
        } else {
            // El nuevo va detrás del último
            ultimo.setSiguiente(nuevo);
            nuevo.setAnterior(ultimo);
            ultimo = nuevo;
        }

        size++;
    }
    // Deqeue: quitar el primero
    public T dequeue() {
        // Si está vacía, no hay nada que sacar
        if (isEmpty()) {
            return null;
        }
        T dato = primero.getDato();
        primero = primero.getSiguiente();
        if (primero != null) {
            primero.setAnterior(null);
        } else {
            ultimo = null;
        }
        size--;
        return dato;
    }

    // Ver el primero sin eliminarlo
    public T primero() {
        if (isEmpty()) {
            return null;
        }
        return primero.getDato();
    }

    // Saber si está vacía
    public boolean isEmpty() {
        return primero == null;
    }
    // Tamaño de la cola
    public int getSize() {
        return size;
    }
}