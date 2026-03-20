package es.uah.eedd.listas.PilayCola;

public class MainPila {
    public static void main(String[] args) {

        // Creamos una pila de enteros
        Pila<Integer> pila = new Pila<>();

        // Insertamos varios elementos
        pila.push(10);
        pila.push(20);
        pila.push(30);

        // Mostramos el elemento de la cima
        System.out.println("Cima: " + pila.peek());

        // Sacamos elementos de la pila
        System.out.println("Pop: " + pila.pop());
        System.out.println("Pop: " + pila.pop());

        // Mostramos el tamaño actual
        System.out.println("Tamaño: " + pila.getSize());

        // Mostramos la nueva cima
        System.out.println("Cima: " + pila.peek());
    }
}
