public class Producto {
    private String NombreProducto;
    private String Codigo;
    private String Vencimiento;
    private double Costo;
    private double Precio;
    private String Marca;
    public static int Catalogo[];

    public Producto()
    {
        this.NombreProducto = NombreProducto ;
        this.Codigo = Codigo ;
        this.Vencimiento = Vencimiento ;
        this.Costo = Costo ;
        this.Precio = Precio ;
        this.Marca = Marca ;
    }
    public String MostrarNombre()
    {
        return this.NombreProducto;
    }
    public  String MostrarCodigo()
    {
        return this.Codigo ;
    }
    public String MostrarVencimiento()
    {
        return this.Vencimiento ;
    }
    public String MostrarMarca()
    {
        return this.Marca ;

    }
    public  double MostrarPrecio()
    {
        return this.Precio;
    }
}
