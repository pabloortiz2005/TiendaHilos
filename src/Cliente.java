public class Cliente implements Runnable {
    private String nombre;
    private carrito carrito;
    private Caja caja;

    public Cliente(String nombre, Caja caja) {
        this.nombre = nombre;
        this.carrito = new carrito();
        this.caja = caja;
    }

    @Override
    public void run() {
        while (carrito.hayProductos()) {
            String producto = carrito.siguienteProducto();
            caja.procesarCompra(nombre, producto);
        }
    }

    public void agregarProductoAlCarrito(String producto) {
        carrito.agregarProducto(producto);
    }
}

