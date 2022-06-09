package Clase10;

public class Main 
{
    public static void main(String args[])
    {
        ProductoControlador productoControlador = new ProductoControlador(4);

        productoControlador.crear("casaca",120f,34254317);
        productoControlador.crear("polo",125.5f,34354317);
        productoControlador.crear("pantalon",101.5f,34454317);
        productoControlador.crear("Zapatilla",239f,34554317);


        productoControlador.listar();
      
        System.out.println("------------- Buscar Producto -------------");

        int producto = 34354317;

        Producto encontrado;

        encontrado = productoControlador.buscar(producto);

        if(encontrado != null)
        {
            System.out.println("Producto encontrado: "+encontrado.getNombres());

        } else {

            System.out.println("No se encontro: "+producto);
        }

    }
}

