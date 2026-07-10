import java.util.ArrayList;

public class EmpresaMensajeria {

    private ArrayList<Paquete> paquetes;

    public EmpresaMensajeria() {
        paquetes = new ArrayList<>();
    }

    public void registrarPaquete(Paquete paquete) {
        paquetes.add(paquete);
    }

    public void imprimirReporte() {
        double total = 0;
        System.out.println("REPORTE");
        for (Paquete paquete : paquetes) {
            System.out.println("Destinatario: " + paquete.getnombreDestinatario());
            System.out.println("Peso: " + paquete.getpesoKg());

            double costo = paquete.obtenerCostoEnvio();

            System.out.println("Costo: $" + costo);

            total += costo;
        }
        System.out.println("Total recaudado: $" + total);
    }
}
