import java.util.Scanner;
public class ColaProductos {
    public static class Nodo{
        private String producto;
        private String codigo;
        private double precio;
        private String vencimiento;
        private String marca;
        private Nodo siguiente;

        public Nodo(String producto, String codigo, double precio, String vencimiento, String marca ) {
            this.producto = producto;
            this.codigo = codigo;
            this.precio = precio;
            this.vencimiento = vencimiento;
            this.marca = marca;
            this.siguiente = null;
        }
        public String getProducto(){
            return producto;
        }
        public String getCodigo(){
            return codigo;
        }
        public double getPrecio(){
            return precio;
        }
        public String getVencimiento(){
            return vencimiento;
        }
        public String getMarca(){
            return marca;
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

        public void Cola() {
            this.frente = null;
            this.fin = null;
        }

        public static boolean estaVacia() {
            return frente == null;
        }

        public static void agregarProducto(String producto, String codigo, double precio, String vencimiento, String marca) {
            Nodo nuevoNodo = new Nodo(producto, codigo, precio,vencimiento,marca);
            if (estaVacia()) {
                frente = nuevoNodo;
                fin = nuevoNodo;
            } else {
                fin.setSiguiente(nuevoNodo);
                fin = nuevoNodo;
            }
            System.out.println("Se agrego el producto " + producto + " con el codigo: " + codigo);
        }

        public static void mostrarProducto() {
            Nodo actual = frente;
            System.out.println("Productos en la cola: ");
            while (actual != null) {
                System.out.println("Nombre: " +  actual.getProducto() + " / Codigo: " + actual.getCodigo() + " / Precio: " + actual.getPrecio() + " / Fecha vencimiento: " + actual.getVencimiento() + " / Marca: " + actual.getMarca());
                actual = actual.setSiguiente();
            }
        }

        public static void ingresarProducto() {
            while (true) {
                System.out.println("Ingrese un el nommbre del producto que desees agregar  o escribe 'salir' para terminar");
                String producto = sc.nextLine();
                if (producto.equalsIgnoreCase("salir")) {
                    mostrarProducto();
                    break;
                } else {
                    System.out.println("Ingresa el codigo del producto");
                    String codigo = sc.nextLine() ;
                    System.out.println("Ingresa el precio del producto");
                    double precio = Double.parseDouble(sc.nextLine());
                    System.out.println("Ingresa la fecha de vencimiento del producto (Formato AAAA-MM-DD)");
                    String vencimiento = sc.nextLine();
                    System.out.println("Ingresa la marca del producto");
                    String marca = sc.nextLine();
                    agregarProducto(producto, codigo, precio,vencimiento,marca);
                }

            }
        }

    }


}