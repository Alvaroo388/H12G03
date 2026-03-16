package alvaro.martinezcampo_listas;

public class Pila<T extends Comparable<T>>{
    private ListaSE<T> lista;

    public Pila() {
        lista = new ListaSE<>();
    }
    public void push (T dato){
        lista.add(dato);
    }
    public T pop(){
        return lista.del(top());
    }
    public T top(){
        if (lista.isEmpty()){
            return null;
        }
        return lista.getIterador().next();
    }
    public boolean isEmpty(){
        return lista.isEmpty();
    }
    public int size(){
        return lista.getSize();
    }
}
