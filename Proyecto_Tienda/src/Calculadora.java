import java.util.Scanner;

public class Calculadora {
    private double Sumar;
    private double Multiplicar;
    private double Dividir;
    private double Iva;
    private double Porcentaje;
    private double Ingresos;
    private double Egresos;


    public static void MenuVentas() {
        Tienda tienda1= new Tienda();

        Producto productos1 = new Producto();


        Scanner sc_ventas = new Scanner(System.in);
        int Opcion;
        int Unidades = 0;
        String Respuesta;
        double TotalFactura = 0.0;

        do {
            System.out.println("Bienvenido al sistema de venta de producto");
            for (int i = 0; i >=4; i++) {
                System.out.println("Pulse " + i + " para comprar " +  " cuyo precio es " );
            }
                Opcion = sc_ventas.nextInt();

                System.out.println("Ha elegido comprar "  );

                System.out.println("¿Desea comprar otro producto? si/no");
                Respuesta = sc_ventas.next();

            }
            while (Respuesta.equalsIgnoreCase("si")) ;

            System.out.println("El total de su compra es: " + TotalFactura);

        }
    }

