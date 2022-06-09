package Clase10;

public class Producto 
{
    private int codigo;
    private String nombre;
    private double precio;

    Producto(String nombre, double precio, int codigo)
    {
        this.codigo = codigo;

        this.nombre = nombre;

        this.precio = precio;
    }

    public void setCodigo(int codigo) 
    {
        this.codigo = codigo;
    }
    public int getCodigo()
    {
        return codigo;
    }

    public void setNombres(String nombre) 
    {
        this.nombre = nombre;
    }
    public String getNombres() 
    {
        return nombre;
    }
    
    public void setPrecio(double precio) 
    {
        this.precio = precio;
    }
    public double getPrecio() 
    {
        return precio;
    }
    public void listarProducto()
    {
        System.out.println("Codigo: "+ this.getCodigo());
        System.out.println("Nombre: "+ this.getNombres());
        System.out.println("Precio: "+ this.getPrecio());
    }

}
