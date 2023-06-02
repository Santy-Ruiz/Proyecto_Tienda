import java.util.Scanner;
public class Prueba {

    public static class Nodo{
        private String producto;
        private Nodo siguiente;

        public Nodo(String producto) {
            this.producto = producto;
            this.siguiente = null;
        }
        public String getProducto(){
            return producto;
        }
        public Nodo setSiguiente(){
            return siguiente;
        }

        public void setSiguiente(Nodo siguiente){
            this.siguiente=siguiente;
        }
    }

    public static class Cola {

        static Scanner sc = new Scanner(System.in);
        private static Nodo frente;
        private static Nodo fin;

        public void Cola(){
            this.frente = null;
            this.fin = null;
        }
        public static boolean estaVacia(){
            return frente == null;
        }

        public static void agregarProducto(String producto) {
            Nodo nuevoNodo = new Nodo(producto);
            if (estaVacia()) {
                frente = nuevoNodo;
                fin = nuevoNodo;
            } else {
                fin.setSiguiente(nuevoNodo);
                fin = nuevoNodo;
            }
            System.out.println("Se agrego el producto " + producto);
        }

        public static void mostrarProducto(){
            Nodo actual = frente;
            System.out.println("Productos en la cola: ");
            while (actual != null){
                System.out.println(actual.getProducto());
                actual = actual.setSiguiente();
            }
        }

        public static void ingresarProducto(){
            while (true){
                System.out.println("Ingrese un producto o 'Salir' para terminar");
                String producto = sc.nextLine();
                if (producto.equalsIgnoreCase("salir")){
                    mostrarProducto();
                    break;
                }else{
                    agregarProducto(producto);
                }

            }
        }
    }


}