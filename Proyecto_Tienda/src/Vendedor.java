import java.util.Scanner;

public class Vendedor {
    private  String nombreVendedor;
    private String ID_Vendedor;
    public Vendedor(String nombreVendedor, String ID_Vendedor){
        this.nombreVendedor = nombreVendedor;
        this.ID_Vendedor = ID_Vendedor;
    }

    public Vendedor() {

    }


    public String getNombreVendedor(){
        return nombreVendedor;
    }
    public String getID_Vendedor(){
        return ID_Vendedor;
    }

    public String toString(){
        return "ID: " + ID_Vendedor + ", Nombre: " + nombreVendedor;
    }

    public static class Nodo{
        private Vendedor vendedor;
        private Nodo siguiente;

        public Nodo(Vendedor vendedor) {
            this.vendedor = vendedor;
            this.siguiente = siguiente;
        }

        public Vendedor getVendedor() {
            return vendedor;
        }

        public Nodo getSiguiente() {
            return siguiente;
        }

        public void setSiguiente(Nodo siguiente) {
            this.siguiente = siguiente;
        }
    }
    public static class ListaCircular{

        static Scanner scanner = new Scanner(System.in);
         String respuesta = "";
        private static Nodo cabeza;

        public ListaCircular() {
            this.cabeza = cabeza;
        }

        public static boolean estaVacia(){
            return cabeza == null;
        }

        public void agregarVendor (String nombreVendedor, String ID_Vendedor){
            Vendedor nuevoVendedor = new Vendedor(nombreVendedor, ID_Vendedor);
            Nodo nuevoNodo = new Nodo(nuevoVendedor);

            if (estaVacia()){
                cabeza = nuevoNodo;
                cabeza.setSiguiente(cabeza);
            }else {
                Nodo ultimo  = cabeza;
                while (ultimo.getSiguiente() != cabeza){
                    ultimo = ultimo.getSiguiente();
                }
                ultimo.setSiguiente(nuevoNodo);
                nuevoNodo.setSiguiente(cabeza);
            }
        }

        public static void mostrarVendores(){
            if (estaVacia()){
                System.out.println("La lista esta vacia");
                return;
            }

            Nodo actual = cabeza;
            do {
                System.out.println(actual.getVendedor());
                actual = actual.getSiguiente();
            }while (actual !=cabeza);
        }

    }

}