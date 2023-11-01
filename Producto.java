public class Producto {
    private String nombre;
    private String tipo;
    private int cantidadActual;
    private int cantidadMinima;
    private double precioBase;

    public Producto(String nombre, String tipo, int cantidadActual, int cantidadMinima, double precioBase) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.cantidadActual = cantidadActual;
        this.cantidadMinima = cantidadMinima;
        this.precioBase = precioBase;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public int getCantidadMinima() {
        return cantidadMinima;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public double getPrecioFinal() {
        double impuestos = 0.0;
        if (tipo.equals("Papelería")) {
            impuestos = 0.16;
        } else if (tipo.equals("Supermercado")) {
            impuestos = 0.04;
        } else if (tipo.equals("Droguería")) {
            impuestos = 0.12;
        }
        return precioBase * (1 + impuestos);
    }
}
