public class Producto {
    private String NombreProducto;
    private String Codigo;
    private String Vencimiento;
    private double Costo;
    private double Precio;
    private String Marca;
    public Producto(String Vencimiento, String NombreProducto, String Codigo, double Costo, double Precio, String Marca)
    {
        this.Vencimiento = Vencimiento ;
        this.Codigo = Codigo ;
        this.NombreProducto = NombreProducto ;
        this.Costo = Costo ;
        this.Precio = Precio ;
        this.Marca = Marca ;
    }
    public class Nodo {
        private Producto producto;
        private Nodo siguiente;

        public Nodo(Producto producto, Nodo siguiente){
            this.producto = producto;
            this.siguiente = siguiente;
        }
    }
    public class ListasLigadas{
        private Nodo cabeza;
        public ListasLigadas(){
            this.cabeza=null;
        }
        public void agregarProducto(Producto producto){
            Nodo nuevoNodo = new Nodo(producto, null);
            if (cabeza == null){
                cabeza = nuevoNodo;
            }
            else {
                Nodo actual = cabeza;

            while(actual.siguiente != null){
                actual = actual.siguiente;
            }
        }
        }
        public void mostrarProducto (){
            Nodo actual = cabeza;
            while (actual != null){
                System.out.println(actual.siguiente);
                actual= actual.siguiente;
            }
        }
    }

}
