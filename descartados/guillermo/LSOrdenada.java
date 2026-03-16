public class LSOrdenada<T extends Comparable<T>> extends ListaSimplementeEnlazada<T> {
    @Override
    public void add(T dato) {
        ElementoSe<T> nuevo = new ElementoSe<>(dato);
        if (primero == null || primero.dato.compareTo(dato) > 0) {
            nuevo.siguiente = primero;
            primero = nuevo;
        } else {
            ElementoSe<T> act = primero;
            while (act.siguiente != null && act.siguiente.dato.compareTo(dato) < 0) {
                act = act.siguiente;
            }
            nuevo.siguiente = act.siguiente;
            act.siguiente = nuevo;
        }
        tamaño++;
    }

}
