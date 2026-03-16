import java.util.List;

public class ListaCircular<T extends Comparable<T>>extends ListaSimplementeEnlazada<T> implements Lista<T> {
protected ElementoSe<T> primero;
protected ElementoSe<T> último;
protected int tamaño;

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
        primero=último=nuevo;
        último.siguiente=primero;
    }else {
        último.siguiente=nuevo;
        nuevo.siguiente=primero;
        último=nuevo;
    }
    tamaño++;
}

@Override
    public T get(T dato){
    ElementoSe<T> act=primero;
    while(act.siguiente!=primero){
        if (act.dato.compareTo(dato)==0){
            return dato;
        }
        act=act.siguiente;
    }
    return null;
}
@Override
    public T del(T dato){
    if (isEmpty())return null;
    ElementoSe<T> act=primero;
    while(act.siguiente!=primero){
        if (act.dato.compareTo(dato)==0 && último.siguiente==act){
            último.siguiente=act.siguiente;
        }else{
            primero=act.siguiente;
        }if(act.)

    }
}



}


