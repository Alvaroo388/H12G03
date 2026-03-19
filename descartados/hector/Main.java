package es.uah.eedd.listas;

public class Main {

    public static void main(String[] args) {

        ListaSimplementeEnlazada<Integer> lista = new ListaSimplementeEnlazada<>();

        lista.add(4);
        lista.add(7);
        lista.add(2);

        System.out.println("¿La lista está vacía? " + lista.isEmpty());
        System.out.println("Tamaño: " + lista.getSize());

        System.out.println("Buscar 7: " + lista.get(7));
        System.out.println("Buscar 9: " + lista.get(9));

        System.out.println("Borrar 7: " + lista.del(7));
        System.out.println("Tamaño después de borrar: " + lista.getSize());

        System.out.println("Recorrido con iterador:");
        MiIterador<Integer> it = lista.getIterador();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
