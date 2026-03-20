public class Main {

    public static void main(String[] args) {

        Alumno a1 = new Alumno("111A", "Lucia", 8.5);
        Alumno a2 = new Alumno("222B", "Carlos", 6.7);
        Alumno a3 = new Alumno("333C", "Marta", 9.1);
        Alumno a4 = new Alumno("444D", "Pablo", 7.3);

        System.out.println("====================================");
        System.out.println("PRUEBAS CON ALUMNO");
        System.out.println("====================================");

        probarListaSE(a1, a2, a3);
        probarListaDE(a1, a2, a3);
        probarListaCircular(a1, a2, a3);

        probarIteradorSE(a1, a2, a3);
        probarIteradorDE(a1, a2, a3);
        probarIteradorCircular(a1, a2, a3);

        probarCola(a1, a2, a3, a4);
        probarPila(a1, a2, a3, a4);
    }

    // =========================
    // LISTA SIMPLE
    // =========================
    public static void probarListaSE(Alumno a1, Alumno a2, Alumno a3) {
        System.out.println("\n----- PRUEBA ListaSE -----");

        ListaSE<Alumno> lista = new ListaSE<>();

        System.out.println("isEmpty inicial: " + lista.isEmpty());
        System.out.println("getSize inicial: " + lista.getSize());
        System.out.println("get(a1) vacía: " + lista.get(a1));
        System.out.println("del(a1) vacía: " + lista.del(a1));
        System.out.println("existeDato(a1) vacía: " + lista.existeDato(a1));

        lista.add(a1);
        lista.add(a2);
        lista.add(a3);

        System.out.print("Lista tras add: ");
        imprimirIterador(lista.getIterador());

        System.out.println("get(a2): " + lista.get(a2));
        System.out.println("existeDato(a1): " + lista.existeDato(a1));
        System.out.println("getSize: " + lista.getSize());

        System.out.println("del(a2): " + lista.del(a2));
        System.out.print("Lista tras del(a2): ");
        imprimirIterador(lista.getIterador());

        lista.invertir();
        System.out.print("Lista tras invertir(): ");
        imprimirIterador(lista.getIterador());
    }

    // =========================
    // LISTA DOBLE
    // =========================
    public static void probarListaDE(Alumno a1, Alumno a2, Alumno a3) {
        System.out.println("\n----- PRUEBA ListaDE -----");

        ListaDE<Alumno> lista = new ListaDE<>();

        System.out.println("isEmpty inicial: " + lista.isEmpty());
        System.out.println("getSize inicial: " + lista.getSize());
        System.out.println("get(a1) vacía: " + lista.get(a1));
        System.out.println("del(a1) vacía: " + lista.del(a1));
        System.out.println("existeDato(a1) vacía: " + lista.existeDato(a1));

        lista.add(a1);
        lista.add(a2);
        lista.add(a3);

        System.out.print("Lista tras add: ");
        imprimirIterador(lista.getIterador());

        System.out.println("get(a2): " + lista.get(a2));
        System.out.println("existeDato(a3): " + lista.existeDato(a3));
        System.out.println("getSize: " + lista.getSize());

        System.out.println("del(a3): " + lista.del(a3));
        System.out.print("Lista tras del(a3): ");
        imprimirIterador(lista.getIterador());

        System.out.println("del(a1): " + lista.del(a1));
        System.out.print("Lista tras del(a1): ");
        imprimirIterador(lista.getIterador());
    }

    // =========================
    // LISTA CIRCULAR
    // =========================
    public static void probarListaCircular(Alumno a1, Alumno a2, Alumno a3) {
        System.out.println("\n----- PRUEBA ListaCircular -----");

        ListaCircular<Alumno> lista = new ListaCircular<>();

        System.out.println("isEmpty inicial: " + lista.isEmpty());
        System.out.println("getSize inicial: " + lista.getSize());
        System.out.println("get(a1) vacía: " + lista.get(a1));
        System.out.println("del(a1) vacía: " + lista.del(a1));

        lista.add(a1);
        lista.add(a2);
        lista.add(a3);

        System.out.print("ListaCircular tras add: ");
        imprimirIteradorCircular(lista.iteratorCircular());

        System.out.println("get(a2): " + lista.get(a2));
        System.out.println("getSize: " + lista.getSize());

        System.out.println("del(a1): " + lista.del(a1));
        System.out.print("Tras del(a1): ");
        imprimirIteradorCircular(lista.iteratorCircular());

        System.out.println("del(a3): " + lista.del(a3));
        System.out.print("Tras del(a3): ");
        imprimirIteradorCircular(lista.iteratorCircular());

        System.out.println("del(a2): " + lista.del(a2));
        System.out.print("Tras del(a2): ");
        imprimirIteradorCircular(lista.iteratorCircular());

        System.out.println("isEmpty final: " + lista.isEmpty());
    }

    // =========================
    // ITERADOR SE
    // =========================
    public static void probarIteradorSE(Alumno a1, Alumno a2, Alumno a3) {
        System.out.println("\n----- PRUEBA IteradorSE -----");

        ElementoSE<Alumno> e1 = new ElementoSE<>(a1);
        ElementoSE<Alumno> e2 = new ElementoSE<>(a2);
        ElementoSE<Alumno> e3 = new ElementoSE<>(a3);

        e1.setSiguiente(e2);
        e2.setSiguiente(e3);

        IteradorSE<Alumno> it = new IteradorSE<>(e1);

        System.out.println("hasNext inicial: " + it.hasNext());
        System.out.println("next(): " + it.next());
        System.out.println("next(): " + it.next());
        System.out.println("next(): " + it.next());
        System.out.println("hasNext final: " + it.hasNext());
        System.out.println("next() sin elementos: " + it.next());
    }

    // =========================
    // ITERADOR DE
    // =========================
    public static void probarIteradorDE(Alumno a1, Alumno a2, Alumno a3) {
        System.out.println("\n----- PRUEBA IteradorDE -----");

        ElementoDE<Alumno> e1 = new ElementoDE<>(a1);
        ElementoDE<Alumno> e2 = new ElementoDE<>(a2);
        ElementoDE<Alumno> e3 = new ElementoDE<>(a3);

        e1.setSiguiente(e2);
        e2.setAnterior(e1);
        e2.setSiguiente(e3);
        e3.setAnterior(e2);

        IteradorDE<Alumno> it = new IteradorDE<>(e1);

        System.out.println("hasNext inicial: " + it.hasNext());
        System.out.println("next(): " + it.next());
        System.out.println("next(): " + it.next());
        System.out.println("next(): " + it.next());
        System.out.println("hasNext final: " + it.hasNext());
        System.out.println("next() sin elementos: " + it.next());
    }

    // =========================
    // ITERADOR CIRCULAR
    // =========================
    public static void probarIteradorCircular(Alumno a1, Alumno a2, Alumno a3) {
        System.out.println("\n----- PRUEBA IteradorCircular -----");

        NodoCircular<Alumno> n1 = new NodoCircular<>(a1);
        NodoCircular<Alumno> n2 = new NodoCircular<>(a2);
        NodoCircular<Alumno> n3 = new NodoCircular<>(a3);

        n1.siguiente = n2;
        n2.siguiente = n3;
        n3.siguiente = n1;

        IteradorCircular<Alumno> it = new IteradorCircular<>(n1);

        System.out.println("hasNext inicial: " + it.hasNext());
        System.out.println("next(): " + it.next());
        System.out.println("next(): " + it.next());
        System.out.println("next(): " + it.next());
        System.out.println("hasNext después de una vuelta: " + it.hasNext());
        System.out.println("next() cuando ya terminó: " + it.next());

        it.reset();
        System.out.println("Tras reset(), hasNext: " + it.hasNext());
        System.out.println("next() tras reset(): " + it.next());
    }

    // =========================
    // COLA
    // =========================
    public static void probarCola(Alumno a1, Alumno a2, Alumno a3, Alumno a4) {
        System.out.println("\n----- PRUEBA Cola -----");

        Cola<Alumno> cola = new Cola<>();

        System.out.println("isEmpty inicial: " + cola.isEmpty());
        System.out.println("getSize inicial: " + cola.getSize());
        System.out.println("peek vacía: " + cola.peek());
        System.out.println("poll vacía: " + cola.poll());
        System.out.println("last vacía: " + cola.last());
        System.out.println("contains(a1) vacía: " + cola.contains(a1));
        System.out.println("min vacía: " + cola.min());
        System.out.println("max vacía: " + cola.max());
        System.out.println("toString vacía: " + cola.toString());

        cola.offer(a1);
        cola.offer(a2);
        cola.offer(a3);
        cola.offer(a4);

        System.out.println("Tras offer(a1,a2,a3,a4): " + cola);
        System.out.println("peek(): " + cola.peek());
        System.out.println("last(): " + cola.last());
        System.out.println("getSize(): " + cola.getSize());
        System.out.println("contains(a2): " + cola.contains(a2));
        System.out.println("contains(new Alumno): " + cola.contains(new Alumno("999Z", "Otro", 5.0)));
        System.out.println("min(): " + cola.min());
        System.out.println("max(): " + cola.max());

        cola.rotate(1);
        System.out.println("Tras rotate(1): " + cola);

        cola.rotate(2);
        System.out.println("Tras rotate(2): " + cola);

        Cola<Alumno> copia = cola.copy();
        System.out.println("copy(): " + copia);

        System.out.println("poll(): " + cola.poll());
        System.out.println("Tras poll(): " + cola);

        cola.clear();
        System.out.println("Tras clear(): " + cola);
        System.out.println("isEmpty final: " + cola.isEmpty());
    }

    // =========================
    // PILA
    // =========================
    public static void probarPila(Alumno a1, Alumno a2, Alumno a3, Alumno a4) {
        System.out.println("\n----- PRUEBA Pila -----");

        Pila<Alumno> pila = new Pila<>();

        System.out.println("isEmpty inicial: " + pila.isEmpty());
        System.out.println("getSize inicial: " + pila.getSize());
        System.out.println("peek vacía: " + pila.peek());
        System.out.println("pop vacía: " + pila.pop());
        System.out.println("bottom vacía: " + pila.bottom());
        System.out.println("contains(a1) vacía: " + pila.contains(a1));
        System.out.println("search(a1) vacía: " + pila.search(a1));
        System.out.println("min vacía: " + pila.min());
        System.out.println("max vacía: " + pila.max());
        System.out.println("toString vacía: " + pila.toString());

        pila.push(a1);
        pila.push(a2);
        pila.push(a3);
        pila.push(a4);

        System.out.println("Tras push(a1,a2,a3,a4): " + pila);
        System.out.println("peek(): " + pila.peek());
        System.out.println("bottom(): " + pila.bottom());
        System.out.println("getSize(): " + pila.getSize());
        System.out.println("contains(a3): " + pila.contains(a3));
        System.out.println("contains(new Alumno): " + pila.contains(new Alumno("999Z", "Otro", 5.0)));
        System.out.println("search(a4): " + pila.search(a4));
        System.out.println("search(a2): " + pila.search(a2));
        System.out.println("search(a1): " + pila.search(a1));
        System.out.println("search(new Alumno): " + pila.search(new Alumno("999Z", "Otro", 5.0)));
        System.out.println("min(): " + pila.min());
        System.out.println("max(): " + pila.max());

        Pila<Alumno> copia = pila.copy();
        System.out.println("copy(): " + copia);

        System.out.println("pop(): " + pila.pop());
        System.out.println("Tras pop(): " + pila);

        pila.reverse();
        System.out.println("Tras reverse(): " + pila);

        pila.clear();
        System.out.println("Tras clear(): " + pila);
        System.out.println("isEmpty final: " + pila.isEmpty());
    }

    // =========================
    // AUXILIARES
    // =========================
    public static <T> void imprimirIterador(MiIterador<T> it) {
        System.out.print("[");
        boolean primero = true;

        while (it.hasNext()) {
            if (!primero) {
                System.out.print(", ");
            }
            System.out.print(it.next());
            primero = false;
        }

        System.out.println("]");
    }

    public static <T> void imprimirIteradorCircular(InterfazIteradorCircular<T> it) {
        System.out.print("[");
        boolean primero = true;

        while (it.hasNext()) {
            if (!primero) {
                System.out.print(", ");
            }
            System.out.print(it.next());
            primero = false;
        }

        System.out.println("]");
    }
}
