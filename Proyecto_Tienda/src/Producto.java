public class Producto {
    private String NombreProducto;
    private String Codigo;
    private String Vencimiento;
    private double Precio;
    private String Marca;

    public Producto() {
    }

    public Producto(String Vencimiento, String NombreProducto, String Codigo, double Precio, String Marca) {
        this.Vencimiento = Vencimiento;
        this.Codigo = Codigo;
        this.NombreProducto = NombreProducto;
        this.Precio = Precio;
        this.Marca = Marca;
    }

    public String getNombreProducto() {
        return NombreProducto;
    }

    public void setNombreProducto(String NombreProducto) {
        this.NombreProducto = NombreProducto;
    }

    public String getVencimiento() {
        return Vencimiento;
    }

    public void setVencimiento(String Vencimiento) {
        this.Vencimiento = Vencimiento;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }
    public static class Nodo {
        private Producto producto;
        private Nodo siguiente;


        public Nodo(Producto producto, Nodo siguiente) {
            this.producto = producto;
            this.siguiente = siguiente;
        }



        public Nodo getsiguiente() {
            return siguiente;
        }

        public void setsiguiente(Nodo siguiente) {
            this.siguiente = siguiente;
        }

        public static class ListasLigadas {
            private Nodo cabeza;

            public ListasLigadas() {
                this.cabeza = null;
            }

            public void agregarProducto(Producto producto) {
                Nodo nuevoNodo = new Producto.Nodo(producto, null);
                if (cabeza == null) {
                    cabeza = nuevoNodo;
                } else {
                    Nodo actual = cabeza;

                    while (actual.getsiguiente() != null) {
                        actual = actual.getsiguiente();
                    }
                    actual.setsiguiente(nuevoNodo);
                }
            }

            public void mostrarProducto() {
                Nodo actual = cabeza;
                while (actual != null) {
                    System.out.println(actual.producto.getNombreProducto() + " " + actual.producto.getCodigo() + " " +
                            actual.producto.getVencimiento() + " " + actual.producto.getPrecio() + " " + actual.producto.getMarca());
                    actual = actual.siguiente;
                }
            }
        }

    }
}



