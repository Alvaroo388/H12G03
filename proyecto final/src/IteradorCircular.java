public class IteradorCircular<T> implements MiIterador<T>{
    private ElementoSE<T> actual;
    private int contador;
    private int size;

    public IteradorCircular(ElementoSE<T> ultimo, int size) {
        if (ultimo != null) {
                actual = ultimo.getSiguiente();
            }
        this.size = size;
        contador = 0;
    }
    @Override
    public boolean hasNext(){
        return contador < size;
    }
    @Override
    public T next(){
        if(!hasNext()){
            return null;
        }
        T dato = actual.getDato();
        actual = actual.getSiguiente();
        contador++;
        return dato;
    }

}
