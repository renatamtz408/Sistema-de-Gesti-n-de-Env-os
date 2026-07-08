public class EnvioInternacional  extends EstrategiaEnvio{
    @Override
    public double calcularCosto(double pesoKg) {
        return pesoKg*6;
    }
}
