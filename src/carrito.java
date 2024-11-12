public class carrito {
    private String[] productos;
    private int cantidad;

    public carrito() {
        productos = new String[5];
        cantidad = 0;
    }

    public void agregarProducto(String producto) {
        if (cantidad < 5) {
            productos[cantidad] = producto;
            cantidad++;
        } else {
            System.out.println("El carrito ya tiene el máximo de productos.");
        }
    }

    public String siguienteProducto() {
        if (cantidad > 0) {
            return productos[--cantidad];
        }
        return null;
    }

    public boolean hayProductos() {
        return cantidad > 0;
    }
}
