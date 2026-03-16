package listas;

public class Cola<T extends Comparable<T>> {
    private ListaDE<T> lista;
    public Cola(){
        lista = new ListaDE<>();
    }
    public void enqueue(T dato){
        lista.add(dato);
    }
    public T front(){
        if (lista.isEmpty()){
            return null;
        }
        return lista.getIterador().next();
    }
    public T dequeue(){

    }
}
