import java.util.Scanner;

public class Main{
        public static void main(String[] args) {
                Tienda tienda = new Tienda();

                Producto producto1 = new Producto("Lápiz", "Papelería", 100, 20, 10.0);
                Producto producto2 = new Producto("Arroz", "Supermercado", 50, 10, 5.0);
                Producto producto3 = new Producto("Jabón", "Droguería", 80, 15, 2.0);
                tienda.agregarProducto(producto1);
                tienda.agregarProducto(producto2);
                tienda.agregarProducto(producto3);

                Scanner scanner = new Scanner(System.in);
                int opcion;

                do {
                        System.out.println("Selecciona una opción:");
                        System.out.println("1. Visualizar la información de los productos.");
                        System.out.println("2. Vender un producto.");
                        System.out.println("3. Abastecer la tienda con un producto.");
                        System.out.println("4. Cambiar un producto.");
                        System.out.println("5. Calcular estadísticas de ventas.");
                        System.out.println("0. Salir");
                        opcion = scanner.nextInt();

                        switch (opcion) {
                                case 1:
                                        tienda.mostrarProductos();
                                        break;
                                case 2:
                                        System.out.println("Nombre del producto a vender:");
                                        String nombreVenta = scanner.next();
                                        System.out.println("Cantidad a vender:");
                                        int cantidadVenta = scanner.nextInt();
                                        tienda.venderProducto(nombreVenta, cantidadVenta);
                                        break;
                                case 3:
                                        System.out.println("Nombre del producto a abastecer:");
                                        String nombreAbastecimiento = scanner.next();
                                        System.out.println("Cantidad a abastecer:");
                                        int cantidadAbastecimiento = scanner.nextInt();
                                        tienda.abastecerProducto(nombreAbastecimiento, cantidadAbastecimiento);
                                        break;
                                case 4:
                                        System.out.println("Nombre del producto a cambiar:");
                                        String nombreCambio = scanner.next();
                                        System.out.println("Nuevo nombre:");
                                        String nuevoNombre = scanner.next();
                                        System.out.println("Nuevo tipo:");
                                        String nuevoTipo = scanner.next();
                                        System.out.println("Nueva cantidad actual:");
                                        int nuevaCantidadActual = scanner.nextInt();
                                        System.out.println("Nueva cantidad mínima para abastecimiento:");
                                        int nuevaCantidadMinima = scanner.nextInt();
                                        System.out.println("Nuevo precio base:");
                                        double nuevoPrecioBase = scanner.nextDouble();

                                        Producto nuevoProducto = new Producto(nuevoNombre, nuevoTipo, nuevaCantidadActual, nuevaCantidadMinima, nuevoPrecioBase);
                                        tienda.cambiarProducto(nombreCambio, nuevoProducto);
                                        break;
                                        case 5:
                                                tienda.calcularEstadisticas();
                                                break;
                                        case 0:
                                                System.out.println("Saliendo...");
                                                break;
                                        default:
                                                System.out.println("Opción no válida.");
                                                break;
                                        }

                } while (opcion != 0);
        }
}