public class Pila< T extends Comparable<T>>extends ListaDoblementeEnlazada<T> implements Pilas<T>{
    @Override
    public T peek() {
        if (isEmpty()) return null;
        return último.dato;
    }
    @Override
    public void push(T dato) {
        super.add(dato);
    }
    @Override
    public T pop() {
        if (isEmpty()) return null;
        T dato = último.dato;
        if (primero == último) {
            primero = último = null;
        } else {
            último = último.anterior;
            último.siguiente = null;
        }
        tamaño--;
        return dato;
    }
    @Override
    public void clear(){
        primero=último=null;
        tamaño=0;
    }

    @Override
    public boolean contains(T dato) {
        if (isEmpty())return false;
        ElementoDe<T> act = primero;while (act != null) {
            if (act.dato.compareTo(dato) == 0) {
                return true;
            }
            act = act.siguiente;
        }
        return false;
    }
    @Override
    public String toString(){
        String pila= "[";
        ElementoDe<T> act= primero;
        while(act!=null){
            pila+=act.dato;
            if (act.siguiente!=null){
                pila+=", ";
            }
            act=act.siguiente;
        }
        pila+="]";
        return pila;
    }
    @Override
    public T bottom(){
        if (isEmpty()) return null;
        return primero.dato;
    }
    @Override
    public void reverse(){
        if(isEmpty())return;
        ElementoDe<T> act=primero;
        ElementoDe<T> aux=null;
        while (act!=null){
            aux=act.anterior;
            act.anterior=act.siguiente;
            act.siguiente=aux;
            act=act.anterior;
        }
        aux=primero;
        primero=último;
        último=aux;
    }
    @Override
    public int search(T dato){
        if (isEmpty()) return -1;
        ElementoDe<T> act=último;
        int pos=1;
        while(act!=null){
            if (act.dato.compareTo(dato)==0){
                return pos;
            }
                act=act.anterior;
            pos++;
        }
        return -1;

    }
    @Override
    public Pila<T> copy(){
        Pila<T> copia=new Pila<T>();
        ElementoDe<T> act=primero;
        while (act!=null){
        copia.push(act.dato);
        act=act.siguiente;
    }
    return copia;
    }



    @Override
    public T min(){
        if (isEmpty()) return null;
        ElementoDe<T> act= primero;
        T min =act.dato;
        while(act!=null) {
            if (act.dato.compareTo(min) < 0) {
                min = act.dato;
            }
            act = act.siguiente;
        }
        return min;
    }

    @Override
    public T max(){
        if (isEmpty())return null;
        ElementoDe<T> act=primero;
        T max=act.dato;
        while (act!=null){
            if (act.dato.compareTo(max)>0){
                max=act.dato;
            }
            act=act.siguiente;
        }
        return max;
    }

}

