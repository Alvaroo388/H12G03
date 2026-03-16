public class Cola<T extends Comparable<T>>extends ListaDoblementeEnlazada<T> implements Colas<T>{
    @Override
    public T peek(){
        if(isEmpty())return null;
        return primero.dato;
    }
    @Override
    public void offer(T dato){
        super.add(dato);
    }
    @Override
    public T poll(){
        if (isEmpty())return null;
        T dato=primero.dato;
        if(primero==último){
            primero=último=null;
        }else{
            primero=primero.siguiente;
            primero.anterior=null;
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
    public boolean contains(T dato){
        if (isEmpty())return false;
        ElementoDe<T> act=primero;
        while(act!=null){
            if (act.dato.compareTo(dato)==0){
                return true;
            }
            act=act.siguiente;
        }
        return false;
    }

    @Override
    public String toString(){
        String cola="[";
        ElementoDe<T> act=primero;
        while(act!=null){
            cola+=act.dato;
            if(act.siguiente!=null){
                cola+=", ";
            }
            act=act.siguiente;
        }
        cola+="]";
        return cola;
    }

    @Override
    public T last(){
        if (isEmpty()) return null;
        return último.dato;
    }

    @Override
    public void rotate(int times){
        if (isEmpty() || primero==último)return;
        for (int i = 0; i < times; i++){
        ElementoDe<T>aux=primero;
            primero=primero.siguiente;
            primero.anterior=null;

            último.siguiente=aux;
            aux.anterior=último;
            aux.siguiente=null;

            último=aux;

        }
    }
    @Override
    public Cola<T> copy(){
        Cola<T> copia= new Cola<>();
        ElementoDe<T> act=primero;
        while (act!=null){
            copia.offer(act.dato);
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

