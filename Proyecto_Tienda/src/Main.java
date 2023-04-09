public class Main {
    public static void main(String[] args) {
        Producto.Nodo.ListasLigadas lista1= new Producto.Nodo.ListasLigadas();
        Producto producto1 = new Producto("2023-05-30","Azucar","P0001",5000,"Azucarlite");
        lista1.agregarProducto(producto1);
        lista1.mostrarProducto();
    }
}