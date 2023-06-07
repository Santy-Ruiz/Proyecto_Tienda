import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        PilaProductos pila=new PilaProductos();
        Scanner sc = new Scanner(System.in);
        Producto.Nodo.ListasLigadas lista1= new Producto.Nodo.ListasLigadas();
        lista1.mostrarProducto();
        Tienda tienda1= new Tienda();
        ColaProductos.Cola cola = new ColaProductos.Cola();
        Vendedor.ListaCircular vendedor1 = new Vendedor.ListaCircular();

        vendedor1.agregarVendor("Juan", "1");
        vendedor1.agregarVendor("Pedro", "2");

        int Opcion = 0;
        String cedula = " " ;

        System.out.println("---------Bienvenido a Tienda.SAS---------");
        System.out.println("---------¿Que deseas hacer hoy?---------");
        System.out.println("1. Acceder al menu de ventas");
        System.out.println("2. Agregar productos ");
        System.out.println("3. Agregar venedores ");
        System.out.println("4. Salir");
        Opcion = Integer.parseInt(sc.nextLine());

        switch (Opcion){
            case 1:{
                Tienda.MenuVentas();
                break;
            }
            case 2:{
                ColaProductos.Cola.ingresarProducto();
                break;
            }
            case 3:{
                vendedor1.mostrarVendores();
            }
        }
    }
}
