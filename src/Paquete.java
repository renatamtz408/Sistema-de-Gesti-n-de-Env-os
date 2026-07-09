public abstract class Paquete {
    private String nombreDestinatario;
    private double pesoKg;
    private EstrategiaEnvio estrategiaenvio;

    public Paquete(String nombreDestinatario, double pesoKg, EstrategiaEnvio estrategiaenvio) {
        this.nombreDestinatario = nombreDestinatario;
        this.pesoKg = pesoKg;
        this.estrategiaenvio = estrategiaenvio;
    }

    public double obtenerCostoEnvio() {
        return estrategiaenvio.calcularCosto(pesoKg);
    }

    public void imprimirReporte() {

        double total = 0;

        for (Paquete paquete : paquetes) {
            System.out.println("Destinatario: " + paquete.nombreDestinatario);
            System.out.println("Peso: " + paquete.pesoKg);

            double costo = paquete.obtenerCostoEnvio();

            System.out.println("Costo: $" + costo);

            total += costo;
        }
        System.out.println("Total recaudado: $" + total);
    }
}
