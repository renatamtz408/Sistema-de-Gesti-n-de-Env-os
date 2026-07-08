public class EnvioExpress implements EstrategiaEnvio{
    @Override
    public double calcularCosto(double pesoKg) {
        return pesoKg*4.5;
    }
}
