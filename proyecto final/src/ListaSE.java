
// Clase genérica de lista simplemente enlazada.
// T extiende de Comparable para poder comparar elementos con compareTo.

public class ListaSE<T extends Comparable<T>> implements Lista<T> {
    protected ElementoSE<T> primero; // Referencia al primer nodo de la lista.
    protected int size;

    public ListaSE() { // Constructor: crea una lista vacía.
        this.primero = null;
        this.size = 0;
    }

    @Override
    public void add(T dato) {
        ElementoSE<T> nuevo = new ElementoSE<>(dato); // Se crea un nuevo nodo con el dato recibido.
        if (primero != null) {
            nuevo.setSiguiente(primero);
            primero = nuevo; // Ahora el nuevo nodo pasa a ser el primero
        }else{
            primero = nuevo; // Si la lista estaba vacía, el nuevo nodo es el primero
        }
        size++;
    }

    @Override
    public T get(T dato) {
        ElementoSE<T> actual = primero; // // Empezamos a recorrer desde el primer nodo
        while (actual != null){

            if (actual.getDato().compareTo(dato) == 0){
                return actual.getDato(); // Devolvemos el dato encontrado
            }
            actual = actual.getSiguiente(); // Avanzamos al siguiente nodo
        }
        return null; // Si no se encontró el dato, devolvemos null
    }

    @Override
    public T del(T dato) {
        ElementoSE<T> actual = primero; //actual recorre la lista
        ElementoSE<T> anterior = null; // anterior guarda el nodo anterior a actual
        while (actual != null){

            if (actual.getDato().compareTo(dato) == 0){
                if (anterior == null){ // Si anterior es null, significa que actual es el primer nodo
                    primero = actual.getSiguiente();  // El primer nodo pasa a ser el siguiente del actual
                }else {
                    // Si no es el primero, hacemos que el anterior apunte
                    // al siguiente del actual, saltándose el nodo borrado
                    anterior.setSiguiente(actual.getSiguiente());
                }
                size--;  // Reducimos el tamaño de la lista
                return actual.getDato(); // Devolvemos el dato eliminado
            }
            anterior = actual;
            actual = actual.getSiguiente();
        }
        return null;
    }

    @Override
    public boolean isEmpty() {
        return primero == null;
    }

    @Override
    public int getSize() { // Devuelve el número de elementos almacenados
        return size;
    }

    @Override
    public MiIterador<T> getIterador() { // Crea y devuelve un iterador que empieza en el primer nodo
        return new IteradorSE<>(primero);
    }

    public boolean existeDato(T dato){
        return get(dato) != null;  // Si devuelve algo distinto de null, el dato existe
    }
    public void invertir(){ // Invertir una lista, el primero pasa a ser el último, etc.
        ElementoSE<T> anterior = null;
        ElementoSE<T> actual = primero;
        ElementoSE<T> siguiente;

        while(actual != null){ // Recorremos toda la lista
            siguiente = actual.getSiguiente(); // Guardamos el siguiente nodo antes de cambiar enlaces
            actual.setSiguiente(anterior); // Invertimos el enlace: ahora el actual apunta al anterior
            anterior = actual; // Avanzamos anterior al nodo actual
            actual = siguiente; // Avanzamos actual al siguiente nodo original
        }
        primero = anterior; // Al terminar, anterior apunta al nuevo primero de la lista
    }
    @Override
    public String toString() {
        String texto = "[";
        ElementoSE<T> actual = primero;

        while (actual != null) {
            texto += actual.getDato();
            if (actual.getSiguiente()!= null) {
                texto += ", ";
            }
            actual = actual.getSiguiente();
        }

        texto += "]";
        return texto;
    }


}
