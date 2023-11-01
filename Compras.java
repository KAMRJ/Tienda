public class Compras {

    private String nombre;

    private int numerodeTelefono;

    private String direccion;

    private String nombreProducto;

    private int cantidadProducto;

    private String descripcion;

    private double precio;



    public Compras(String nombre, int numerodeTelefono, String direccion, String nombreProducto, int cantidadProducto, String descripcion, double precio){
        this.nombre = nombre;
        this.numerodeTelefono = numerodeTelefono;
        this.direccion = direccion;
        this.nombreProducto = nombreProducto;
        this.cantidadProducto = cantidadProducto;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String darnombre(){
        return nombre;
    }

    public int darnumerodeTelefono(){
        return numerodeTelefono;
    }

    public String dardirecion(){
        return direccion;
    }

    public String darnomreProducto(){
        return nombreProducto;
    }

    public int darcantidadProducto(){
        return cantidadProducto;
    }

    public String dardescripcion(){
        return descripcion;
    }

    public double getPrecio(){
        return precio;
    }
}



