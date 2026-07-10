import java.util.ArrayList;

public class EmpresaMensajeria {

    private ArrayList<paqueteenvio> listapaquetes;

    public EmpresaMensajeria() {
        listapaquetes = new ArrayList<>();
    }

    public void registrarPaquete(paqueteenvio p) {
        listapaquetes.add(p);
    }

    public void imprimirReporte() {
        double total = 0;
        System.out.println("REPORTE");
        for (paqueteenvio p: listapaquetes) {

            String eenvio = "";
            if (p.getEstrategiaenvio() instanceof EnvioEstandar){
                eenvio= "Envio Estandar";
            }else if (p.getEstrategiaenvio() instanceof EnvioExpress){
                eenvio = "Envio Express";
            } else if (p.getEstrategiaenvio() instanceof EnvioInternacional) {
                eenvio = "Envio Internacional";
            }

            System.out.println("Destinatario: " + p.getnombreDestinatario());
            System.out.println("Peso: " + p.getpesoKg() + " kg");
            System.out.println("Tipo de envio: " + eenvio);

            double costo = p.obtenerCostoEnvio();

            System.out.println("Costo: $" + costo);
            System.out.println("______________________________");

            total += costo;
        }
        System.out.println("Total recaudado: $" + total);
        System.out.println("______________________________");

    }
}
