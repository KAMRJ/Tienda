public class Farmacia {
        Proveedor[] proveedores;
        Producto[] productos;
        int proveedoresCount;
        int productosCount;

        public Farmacia() {
            proveedores = new Proveedor[10]; // Establece un límite inicial para los proveedores
            productos = new Producto[10]; // Establece un límite inicial para los productos
            proveedoresCount = 0;
            productosCount = 0;
        }

        public void registrarProveedor(Proveedor proveedor) {
            // Agregar un proveedor al arreglo de proveedores
        }

        public void registrarProducto(Producto producto) {
            // Agregar un producto al arreglo de productos
        }

        public void visualizarProveedores() {
            // Mostrar la información de los proveedores
        }

        public void visualizarProductosEnStock() {
            // Mostrar información de los productos en stock
        }

        public void modificarCantidadDeProducto(Producto producto, int nuevaCantidad) {
            // Modificar la cantidad de un producto en stock
        }

        public void crearFactura(Venta venta) {
            // Generar una factura para la venta y guardarla
        }

        public void productoAgotado(Producto producto) {
            // Comprobar si un producto se está quedando sin stock
        }

        public void ingresarProveedor(Proveedor proveedor) {
            // Agregar un nuevo proveedor al arreglo de proveedores
        }

        public void ingresarCliente(Cliente cliente) {
            // Agregar un nuevo cliente (si es necesario)
        }
}
