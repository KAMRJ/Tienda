import java.util.Scanner;

public class Main {
    public void main(String[] args) {
        Farmacia farmacia = new Farmacia();

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú Principal");
            System.out.println("1. Registrar Proveedor");
            System.out.println("2. Registrar Producto");
            System.out.println("3. Visualizar Proveedores");
            System.out.println("4. Visualizar Productos en Stock");
            System.out.println("5. Modificar Cantidad de Producto");
            System.out.println("6. Crear Factura");
            System.out.println("7. Producto Agotado");
            System.out.println("8. Ingresar Cliente");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Registro de proveedor
                    break;
                case 2:
                    // Registro de producto
                    break;
                case 3:
                    // Visualizar proveedores
                    break;
                case 4:
                    // Visualizar productos en stock
                    break;
                case 5:
                    // Modificar cantidad de producto
                    break;
                case 6:
                    // Crear factura
                    break;
                case 7:
                    // Producto agotado
                    break;
                case 8:
                    // Ingresar cliente
                    break;
                case 0:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 8);
    }
}