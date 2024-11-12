public class Main {
    public static void main(String[] args) {
        // Creación de cajas
        Caja caja1 = new Caja(1);
        Caja caja2 = new Caja(2);

        // Creación de clientes
        Cliente cliente1 = new Cliente("Juan", caja1);
        Cliente cliente2 = new Cliente("Ana", caja2);
        Cliente cliente3 = new Cliente("Pedro", caja1);
        Cliente cliente4 = new Cliente("Lucía", caja2);
        Cliente cliente5 = new Cliente("Carlos", caja1);

        // Agregar productos a los carritos
        cliente1.agregarProductoAlCarrito("Leche");
        cliente1.agregarProductoAlCarrito("Pan");
        cliente1.agregarProductoAlCarrito("Huevos");

        cliente2.agregarProductoAlCarrito("Arroz");
        cliente2.agregarProductoAlCarrito("Tomates");

        cliente3.agregarProductoAlCarrito("Papel higiénico");
        cliente3.agregarProductoAlCarrito("Colonia djMario");

        cliente4.agregarProductoAlCarrito("Jabón");
        cliente4.agregarProductoAlCarrito("Pasta de dientes");
        cliente4.agregarProductoAlCarrito("Desodorante");

        cliente5.agregarProductoAlCarrito("Cereal");

        // Crear hilos para los clientes
        Thread hilo1 = new Thread(cliente1);
        Thread hilo2 = new Thread(cliente2);
        Thread hilo3 = new Thread(cliente3);
        Thread hilo4 = new Thread(cliente4);
        Thread hilo5 = new Thread(cliente5);

        // Iniciar los hilos
        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
        hilo5.start();

        try {

            hilo1.join();
            hilo2.join();
            hilo3.join();
            hilo4.join();
            hilo5.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
