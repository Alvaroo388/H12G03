package es.uah.eedd.listas.ListaSimplementeEnlazada;

// Main de prueba para la lista simple nueva
public class MainListaSimple {

    public static void main(String[] args) {

        // Creamos una lista simple de enteros
        ListaSimple<Integer> lista = new ListaSimple<>();

        // Añadimos varios datos para probar inserciones
        lista.add(10);
        lista.add(20);
        lista.add(30);
        lista.add(40);

        // Mostramos algunas operaciones básicas
        System.out.println("Tamaño inicial de la lista simple: " + lista.getSize());
        System.out.println("Buscar 20: " + lista.get(20));
        System.out.println("Borrar 30: " + lista.del(30));
        System.out.println("Tamaño después de borrar: " + lista.getSize());

        // Recorremos toda la lista con su iterador
        System.out.println("Contenido de la lista simple:");
        InterfazIteradorSimple<Integer> it = lista.getIterador();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
