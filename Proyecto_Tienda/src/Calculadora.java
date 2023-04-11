import java.util.Scanner;

public class Calculadora {
    private double Sumar;
    private double Multiplicar;
    private double Dividir;
    private double Iva;
    private double Porcentaje;
    private double Ingresos;
    private double Egresos;

    public static void MenuVentas(){
        Producto Productos1 = new Producto();
        Producto.Nodo.ListasLigadas lista1= new Producto.Nodo.ListasLigadas();

        Scanner sc_ventas = new Scanner(System.in);
        int Opcion;
        int Unidades = 0;
        String Respuesta = "";
        double TotalFactura = 0.0;

        do{

            System.out.println("Bienvenido al sistema de ventas de productos");
            for(int i = 0; i <2 ;  i++)
            {
                System.out.println("Pulse " + i + " para comprar " );
            }
            Opcion  = sc_ventas.nextInt();
            System.out.println("Ha elegido comprar " );

            System.out.println("¿Desea comprar otro producto? si/no");
            Respuesta = sc_ventas.next();

        }while (Respuesta.equalsIgnoreCase("si"));

        System.out.println("El total de su compra es: " + TotalFactura);

    }
}
