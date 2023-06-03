public class PilaProductos {
    private Nodo top;

    public PilaProductos() {
        this.top = null;
    }

    public void push(Producto producto) {
        Nodo nuevoNodo = new Nodo(producto, null);
        if (top == null) {
            top = nuevoNodo;
        } else {
            nuevoNodo.setSiguiente(top);
            top = nuevoNodo;
        }
    }

    public Producto pop() {
        if (top == null) {
            return null;
        }
        Producto productoEliminado = top.getProducto();
        top = top.getSiguiente();
        return productoEliminado;
    }

    public Producto peek() {
        if (top == null) {
            return null;
        }
        return top.getProducto();
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        int count = 0;
        Nodo actual = top;
        while (actual != null) {
            count++;
            actual = actual.getSiguiente();
        }
        return count;
    }

    public void clear() {
        top = null;
    }

    public void print() {
        Nodo actual = top;
        while (actual != null) {
            System.out.println(actual.getProducto().getNombreProducto() + " " +
                    actual.getProducto().getCodigo() + " " +
                    actual.getProducto().getVencimiento() + " " +
                    actual.getProducto().getPrecio() + " " +
                    actual.getProducto().getMarca());
            actual = actual.getSiguiente();
        }
    }

    public static class Nodo {
        private Producto producto;
        private Nodo siguiente;

        public Nodo(Producto producto, Nodo siguiente) {
            this.producto = producto;
            this.siguiente = siguiente;
        }

        public Nodo getSiguiente() {
            return siguiente;
        }

        public void setSiguiente(Nodo siguiente) {
            this.siguiente = siguiente;
        }

        public Producto getProducto() {
            return producto;
        }
    }
}
