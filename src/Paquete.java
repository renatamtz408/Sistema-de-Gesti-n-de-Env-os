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

    public String getnombreDestinatario() {
        return nombreDestinatario;
    }

    public double getpesoKg() {
        return pesoKg;
    }

    public EstrategiaEnvio getEstrategiaenvio() {
        return estrategiaenvio;
    }
}
