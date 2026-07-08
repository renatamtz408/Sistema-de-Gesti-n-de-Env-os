public class EnvioEstandar extends EstrategiaEnvio{
    @Override
    public double calcularCosto(double pesoKg) {
        return pesoKg*2;
    }
}
