public class ListaDoblementeEnlazada <T extends Comparable<T>> implements Lista<T>{
    protected ElementoDe<T> primero, último;
    protected int tamaño;



    public boolean isEmpty(){
        return primero==null;
    }
    @Override
    public int getTamaño(){
        return tamaño;
    }

    @Override
    public void add(T dato) {
        ElementoDe<T> nuevo = new ElementoDe<>(dato);
        if (isEmpty()){
            primero=último=nuevo;
        }
        else{
            último.siguiente=nuevo;
            nuevo.anterior=último;
            último=nuevo;
        }


    }
    @Override
    public T del(T dato){
            if (isEmpty()) return null;
            ElementoDe<T> último=null;
            ElementoDe<T> act=primero;

            while(act!=null) {
                if (act.dato.compareTo(dato) == 0) {

                    if (act.anterior != null) {
                        act.anterior.siguiente = act.siguiente;
                    } else {
                        primero = act.siguiente;
                    }
                    if (act.siguiente != null) {
                        act.siguiente.anterior = act.anterior;
                    } else {
                        último = act.anterior;
                    }
                    tamaño--;
                    return act.dato;
                }
                act = act.siguiente;
            }
            return null;
    }

    @Override
    public T get(T dato){
        ElementoDe<T> act = primero;
        while (act != null) {
            if (act.dato.compareTo(dato) == 0) {
                return act.dato;
            }
            act = act.siguiente;
        }
        return null;
    }
    @Override
    public MiIterador<T> getIterador(){return new IteradorLDe<>(primero);}
}
