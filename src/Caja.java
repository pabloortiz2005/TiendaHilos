public class Caja {
    private int id;
    private long initialTime;

    public Caja(int id) {
        this.id = id;
        this.initialTime = System.currentTimeMillis();
    }

    public synchronized void procesarCompra(String cliente, String producto) {
        long tiempoProcesando = System.currentTimeMillis() - initialTime;
        System.out.println("Caja " + id + ": El cliente " + cliente + " está procesando el producto " + producto +
                ". Tiempo de proceso: " + tiempoProcesando + " ms.");
        try {
            Thread.sleep(1000); // Simula el tiempo de escaneo del producto (1 segundo por producto).
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
