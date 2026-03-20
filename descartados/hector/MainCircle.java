package es.uah.eedd.listas.ListaCircular;

public class MainCircle {
    public static void main(String[] args) {

        // Creamos una lista circular de enteros
        ListaCircular<Integer> lista = new ListaCircular<>();

        // Añadimos varios elementos
        lista.add(10);
        lista.add(20);
        lista.add(30);

        // Creamos un iterador para recorrer la lista
        InterfazIteradorCircular<Integer> it = lista.iteratorCircular();

        // Recorremos la lista completa
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
