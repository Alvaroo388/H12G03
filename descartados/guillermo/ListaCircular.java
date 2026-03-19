import java.util.List;

public class ListaCircular<T extends Comparable<T>>extends ListaSimplementeEnlazada<T> implements Lista<T> {
protected ElementoSe<T> ultimo;


@Override
    public boolean isEmpty(){
    return primero==null;
}
@Override
    public int getTamaño(){
    return tamaño;
}

@Override
    public void add(T dato){
    ElementoSe<T> nuevo= new ElementoSe<>(dato);
    if (isEmpty()){
        primero=ultimo=nuevo;
        ultimo.siguiente=primero;
    }else {
        ultimo.siguiente=nuevo;
        nuevo.siguiente=primero;
        ultimo=nuevo;
    }
    tamaño++;
}

@Override
    public T get(T dato){
    if (isEmpty()) return null;
    ElementoSe<T> act = primero;
    do {
        if (act.dato.compareTo(dato) == 0) {
            return act.dato;
        }
        act = act.siguiente;
    }while(act!=primero);
    return null;
}
    @Override
    public T del(T dato) {
        if (isEmpty()) return null;

        // Caso 1 : un solo nodo
        if (primero == ultimo) {
            if (primero.dato.compareTo(dato) == 0) {
                T borrado = primero.dato;
                primero = null;
                ultimo = null;
                tamaño--;
                return borrado;
            }
            return null;
        }

        // Caso 2 : borrar el primero
        if (primero.dato.compareTo(dato) == 0) {
            T borrado = primero.dato;
            primero = primero.siguiente;
            ultimo.siguiente = primero;
            tamaño--;
            return borrado;
        }

        // Buscar el nodo a borrar recorriendo con anterior y actual
        ElementoSe<T> ant = primero;
        ElementoSe<T> act = primero.siguiente;

        while (act != primero) {
            if (act.dato.compareTo(dato) == 0) {
                T borrado = act.dato;
                ant.siguiente = act.siguiente;

                // Si borramos el último, actualizamos ultimo
                if (act == ultimo) {
                    ultimo = ant;
                }
                tamaño--;
                return borrado;
            }

            ant = act;
            act = act.siguiente;
        }

        return null; // no encontrado
    }
}



