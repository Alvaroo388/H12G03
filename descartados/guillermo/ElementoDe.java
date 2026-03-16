class ElementoDe<T>{
    T dato;
    ElementoDe<T> siguiente;
    ElementoDe<T> anterior;


    ElementoDe(T dato){
        this.dato=dato;
        this.siguiente= null;
        this.anterior =null;
    }
}
