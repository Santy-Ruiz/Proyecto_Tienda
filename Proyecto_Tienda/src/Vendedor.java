import java.util.Scanner;

public class Vendedor {
    private String nombreVendedor;
    private String ID_Vendedor;

    public Vendedor(String nombreVendedor, String ID_Vendedor) {
        this.nombreVendedor = nombreVendedor;
        this.ID_Vendedor = ID_Vendedor;
    }

    public Vendedor() {

    }


    public String getNombreVendedor() {
        return nombreVendedor;
    }

    public String getID_Vendedor() {
        return ID_Vendedor;
    }

    public String toString() {
        return "Vendedores Agregados: \n" + "ID del vendedor: " + ID_Vendedor + ", Nombre del Vendedor: " + nombreVendedor;
    }

    public static class Nodo {
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

    public static class ListaCircular {

        static Scanner scanner = new Scanner(System.in);
        String respuesta = "";
        private static Nodo cabeza;

        public ListaCircular() {
            this.cabeza = cabeza;
        }

        public static boolean estaVacia() {
            return cabeza == null;
        }

        public void agregarVendor(String nombreVendedor, String ID_Vendedor) {
            Vendedor nuevoVendedor = new Vendedor(nombreVendedor, ID_Vendedor);
            Nodo nuevoNodo = new Nodo(nuevoVendedor);

            if (estaVacia()) {
                cabeza = nuevoNodo;
                cabeza.setSiguiente(cabeza);
            } else {
                Nodo ultimo = cabeza;
                while (ultimo.getSiguiente() != cabeza) {
                    ultimo = ultimo.getSiguiente();
                }
                nuevoNodo.setSiguiente(cabeza);
                ultimo.setSiguiente(nuevoNodo);
            }
        }

        public static void mostrarVendedores() {
            if (estaVacia()) {
                System.out.println("La lista está vacía");
                return;
            }

            Nodo actual = cabeza;
            do {
                System.out.println(actual.getVendedor());
                actual = actual.getSiguiente();
            } while (actual != cabeza);
        }

        public void IngresarVendedor(){
            System.out.println("Ingresa el nombre del vendedor que deses agregar ó ingresar 'salir' para terminar");
            String nombreVendedor = scanner.nextLine();
            while (!nombreVendedor.equalsIgnoreCase("salir")) {
                System.out.println("Ingrese el ID del vendedor:");
                String ID_Vendedor = scanner.nextLine();
                agregarVendor(nombreVendedor, ID_Vendedor);

                System.out.println("Ingresa el nombre del vendedor que deseas agregar o ingresa 'salir' para terminar");
                nombreVendedor = scanner.nextLine();
            }

            mostrarVendedores();
        }
    }
}