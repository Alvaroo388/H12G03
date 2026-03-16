package alvaro.martinezcampo_listas;

public class ListaCircular<T extends Comparable<T>> implements Lista<T> {
    private ElementoSE<T> ultimo;
    private int size;

    public ListaCircular(){
        ultimo = null;
        size = 0;
    }

    @Override
    public void add(T dato) {
        ElementoSE<T> nuevo = new ElementoSE<>(dato);
        if (ultimo == null){
            ultimo = nuevo;
            ultimo.setSiguiente(ultimo);
        }else{
            nuevo.setSiguiente(ultimo.getSiguiente());
            ultimo.setSiguiente(nuevo);
            ultimo = nuevo;
        }
        size++;
    }

    @Override
    public T get(T dato) {
        if (ultimo == null){
            return null;
        }else{
            ElementoSE<T> actual = ultimo.getSiguiente();
            int contador = 0;
            while (contador < size){
                if (actual.getDato().compareTo(dato) == 0){
                    return actual.getDato();
                }
                contador++;
                actual = actual.getSiguiente();
            }
        }
        return null;
    }

    @Override
    public T del(T dato){

        if(ultimo == null){
            return null;
        }
        ElementoSE<T> actual = ultimo.getSiguiente();
        ElementoSE<T> anterior= ultimo;
        for(int i = 0; i < size; i++){
            if(actual.getDato().compareTo(dato) == 0){
                if(actual == ultimo && actual == ultimo.getSiguiente()){
                    ultimo = null;
                } else {
                    anterior.setSiguiente(actual.getSiguiente());
                    if(actual == ultimo){
                        ultimo = anterior;
                    }
                }
                size--;
                return actual.getDato();
            }
            anterior = actual;
            actual = actual.getSiguiente();
        }
        return null;
    }

    @Override
    public boolean isEmpty() {
        return ultimo == null;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public MiIterador<T> getIterador(){
        return new IteradorCircular<>(ultimo, size);
    }
}
