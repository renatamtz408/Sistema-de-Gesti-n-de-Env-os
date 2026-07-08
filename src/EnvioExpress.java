public class EnvioExpress  extends EstrategiaEnvio{
    @Override
    public double calcularCosto(double pesoKg) {
        return pesoKg*4.5;
    }
}
