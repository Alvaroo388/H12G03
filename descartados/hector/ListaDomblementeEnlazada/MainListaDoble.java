package es.uah.eedd.listas.ListaDomblementeEnlazada;
// Main de prueba para la lista doble nueva
public class MainListaDoble {

    public static void main(String[] args) {

        // Creamos una lista doble de cadenas
        ListaDoble<String> lista = new ListaDoble<>();

        // Añadimos varios nombres para probar la estructura
        lista.add("Ana");
        lista.add("Luis");
        lista.add("Marta");
        lista.add("Pablo");

        // Probamos búsqueda, borrado y tamaño
        System.out.println("Tamaño inicial de la lista doble: " + lista.getSize());
        System.out.println("Buscar Marta: " + lista.get("Marta"));
        System.out.println("Borrar Luis: " + lista.del("Luis"));
        System.out.println("Tamaño después de borrar: " + lista.getSize());

        // Recorremos la lista completa con el iterador
        System.out.println("Contenido de la lista doble:");
        InterfazIteradorDoble<String> it = lista.getIterador();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
