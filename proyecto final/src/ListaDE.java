public class ListaDE<T extends Comparable<T>> implements Lista<T>{
    protected ElementoDE<T> primero,ultimo;
    protected int size;

    public ListaDE() { // Constructor,crea una lista vacía
        this.primero = null;
        this.ultimo = null;
        this.size = 0;
    }


    @Override
    public void add(T dato) {
        ElementoDE<T> nuevo = new ElementoDE<>(dato); // Creamos un nuevo nodo con el dato
        if (primero == null){ // Si la lista está vacía, el nuevo nodo será el primero y el último
            primero = nuevo;
            ultimo = nuevo;
        }else{ // Si no está vacía, insertamos al principio
            primero.setAnterior(nuevo);
            nuevo.setSiguiente(primero);
            primero = nuevo;

        }
        size++;

    }

    @Override
    public T get(T dato) {
        ElementoDE<T> actual = primero;
        while(actual != null){
            if(actual.getDato().compareTo(dato) == 0){
                return actual.getDato();
            }
            actual = actual.getSiguiente();
        }
        return null; // Si no está, devolvemos null
    }

    @Override
    public T del(T dato) {
        ElementoDE<T> actual = primero;
        while (actual != null){
            if (actual.getDato().compareTo(dato) == 0){
                if (actual.getAnterior() == null){ // Borrar el primero
                    primero = actual.getSiguiente();
                    if (primero != null){
                        primero.setAnterior(null);
                    }else{
                        ultimo = null;
                    }
                } else if (actual.getSiguiente() == null){ // Borrar el último
                    ultimo = actual.getAnterior();
                    ultimo.setSiguiente(null);
                } else {  // Borrar uno del medio
                    actual.getAnterior().setSiguiente(actual.getSiguiente());
                    actual.getSiguiente().setAnterior(actual.getAnterior());
                }
                size--; // Disminuimos el tamaño
                return actual.getDato();
            }
            actual = actual.getSiguiente();
        }
        return null;
    }

    @Override
    public boolean isEmpty() {
        return primero == null; // La lista está vacía si no hay primer nodo
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public MiIterador<T> getIterador() {
        return new IteradorDE<>(primero); // Devuelve un iterador empezando por el primero
    }

    public boolean existeDato(T dato){
        return get(dato) != null; // Si get devuelve algo distinto de null, existe fel dato
    }
}
