package es.uah.eedd.listas.PilayCola;

public class MainCola {
    public static void main(String[] args) {

        // Creamos una cola de enteros
        Cola<Integer> cola = new Cola<>();

        // Insertamos varios elementos
        cola.encolar(10);
        cola.encolar(20);
        cola.encolar(30);

        // Mostramos el primer elemento de la cola
        System.out.println("Primero: " + cola.primero());

        // Recorremos la cola con el iterador
        InterfazIterador<Integer> it = cola.iterator();

        System.out.println("Recorrido de la cola:");
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // Eliminamos un elemento de la cola
        System.out.println("Desencolado: " + cola.desencolar());

        // Mostramos el nuevo primer elemento
        System.out.println("Primero ahora: " + cola.primero());

        // Mostramos el tamaño actual
        System.out.println("Tamaño: " + cola.getSize());
    }
}