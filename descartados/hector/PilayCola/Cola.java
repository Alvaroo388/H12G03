package es.uah.eedd.listas.PilayCola;

// Implementación de una cola usando una lista enlazada
public class Cola<T extends Comparable<T>> implements InterfazCola<T> {

    // La cola utiliza una lista como estructura interna
    private Lista<T> lista;

    // Constructor de la cola
    public Cola() {
        this.lista = new Lista<>();
    }

    @Override
    public boolean isEmpty() {
        // La cola está vacía si la lista también lo está
        return lista.isEmpty();
    }

    @Override
    public int getSize() {
        // Devuelve el número de elementos de la cola
        return lista.getSize();
    }

    @Override
    public void encolar(T dato) {
        // En una cola, los elementos se insertan al final
        lista.add(dato);
    }

    @Override
    public T primero() {
        // Devuelve el primer elemento de la cola sin eliminarlo
        return lista.getPrimero();
    }

    @Override
    public T desencolar() {
        // En una cola, se elimina el primer elemento
        return lista.delPrimero();
    }

    @Override
    public InterfazIterador<T> iterator() {
        // Devuelve un iterador para recorrer la cola
        // El recorrido se hace en el mismo orden en el que están los elementos
        return lista.iterator();
    }
}
