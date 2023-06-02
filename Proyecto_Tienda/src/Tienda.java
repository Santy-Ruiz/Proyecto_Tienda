import java.util.Scanner;

public class Tienda {

    public  static void MenuVentas() {
        Vendedor vendedor1 = new Vendedor();
        Cliente cliente1= new Cliente();
        Cliente clientes1 = new Cliente();
        Scanner sc = new Scanner(System.in);
        int Opcion;
        int Unidades = 0;
        String probar;
        String Respuesta;
        double TotalProducto = 0.0;
        double TotalFactura = 0.0;
        Producto productos1 = new Producto();
        Producto.Nodo.ListasLigadas lista1 = new Producto.Nodo.ListasLigadas();
        Producto producto1 = new Producto("2023-05-30","Azucar","P0001",5000,"Azucarlite") ;
        lista1.agregarProducto(producto1);Producto producto2 = new Producto("2023-07-11", "Quesito" , "P0002",4800,"Colanta") ;
        lista1.agregarProducto(producto2);
        Producto producto3 = new Producto("2023-09-14", "Leche" , "P0003",4000,"Alqueria") ;
        lista1.agregarProducto(producto3);
        Producto producto4 = new Producto("2025-03-14", "Sal" , "P0004",2000,"Refisal") ;
        lista1.agregarProducto(producto4);

        do {
            System.out.println("Bienvenido al sistema de venta de producto");
                System.out.println("Pulse " + 1 + " para comprar " + producto1.getNombreProducto() + " cuyo precio es " + producto1.getPrecio());
                System.out.println("Pulse " + 2 + " para comprar " + producto2.getNombreProducto() + " cuyo precio es " + producto2.getPrecio());
                System.out.println("Pulse " + 3 + " para comprar " + producto3.getNombreProducto() + " cuyo precio es " + producto3.getPrecio());
                System.out.println("Pulse " + 4 + " para comprar " + producto4.getNombreProducto() + " cuyo precio es " + producto4.getPrecio());
            Opcion = sc.nextInt();
            if(Opcion==1){
                System.out.println("¿Cuantas cantidades de este producto desesas?");
                Unidades = sc.nextInt();
                TotalProducto= producto1.getPrecio() * Unidades ;
            } else if (Opcion==2) {
                System.out.println("¿Cuantas cantidades de este producto desesas?");
                Unidades = sc.nextInt() ;
                TotalProducto= producto2.getPrecio() * Unidades ;
            } else if (Opcion==3) {
                System.out.println("¿Cuantas cantidades de este producto desesas?");
                Unidades = sc.nextInt() ;
                TotalProducto= producto3.getPrecio() * Unidades ;
            }else if (Opcion==4) {
                System.out.println("¿Cuantas cantidades de este producto desesas?");
                Unidades = sc.nextInt() ;
                TotalProducto= producto4.getPrecio() * Unidades ;
            }else {
                System.out.println("No escogiste una opcion valida");
                break;
            }

            TotalFactura = TotalFactura + TotalProducto ;

            System.out.println("¿Desea comprar otro producto? si/no");
            Respuesta = sc.next();
        }
        while (Respuesta.equalsIgnoreCase("si")) ;
                probar= sc.nextLine();
        System.out.println("-----FACTURA-----");
        System.out.println("Nombre vendedor " + vendedor1.getNombreVendedor());
        System.out.println("Carnet vendedor " + vendedor1.getCarnet() );
        System.out.println("Digite su cedula por favor ");

        System.out.println("El total de su compra es: " + TotalFactura);

    }
}





