package es.uah.eedd.listas;

public interface Lista <T extends Comparable<T>>{
    void add(T dato);
    T get(T dato);
    T del(T dato);
    boolean isEmpty();
    int getSize();
    MiIterador<T> getIterador();
}
