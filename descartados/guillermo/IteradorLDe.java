public class IteradorLDe<T>  implements MiIterador<T>{
    private ElementoDe<T> actual;

    public IteradorLDe(ElementoDe<T> primero){
        this.actual=primero;
    }

    @Override
    public boolean hasNext() {
        return actual !=null;
    }


    @Override
    public T next(){
        if (!hasNext()) return null;
        T dato=actual.dato;
        actual=actual.siguiente;
        return dato;
    }
}
