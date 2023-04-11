import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Producto.Nodo.ListasLigadas lista1= new Producto.Nodo.ListasLigadas();
        Producto producto1 = new Producto("2023-05-30","Azucar","P0001",5000,"Azucarlite");
        lista1.agregarProducto(producto1);
        lista1.mostrarProducto();

        Calculadora Calculadora1 = new Calculadora();
        int Opcion = 0;

        System.out.println("---------Bienvenido a Tienda.SAS---------");
        System.out.println("---------¿Que deseas hacer hoy?---------");
        System.out.println("1. Acceder al menu de ventas");
        System.out.println("2. Salir del programa");
        Opcion = Integer.parseInt(sc.nextLine());

        switch (Opcion){
            case 1:{
                Calculadora.MenuVentas();
                break;
            }
            case 2:{

            }
        }
    }
}