import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Producto.Nodo.ListasLigadas lista1= new Producto.Nodo.ListasLigadas();
        lista1.mostrarProducto();
        Tienda tienda1= new Tienda();
        Prueba.Cola cola = new Prueba.Cola();

        Prueba.Cola.agregarProducto("Prodcuto 1");
        Prueba.Cola.agregarProducto("Prodcuto 2");

        Prueba.Cola.mostrarProducto();

        int Opcion = 0;

        System.out.println("---------Bienvenido a Tienda.SAS---------");
        System.out.println("---------¿Que deseas hacer hoy?---------");
        System.out.println("1. Acceder al menu de ventas");
        System.out.println("2. Agregar productos ");
        System.out.println("3. Mostrar productos");
        System.out.println("3. Salir");
        Opcion = Integer.parseInt(sc.nextLine());

        switch (Opcion){
            case 1:{
                Tienda.MenuVentas();
                break;
            }
            case 2:{
                Prueba.Cola.ingresarProducto();
                break;
            }
            case 3:{
                Prueba.Cola.mostrarProducto();
                break;
            }
        }
    }
}