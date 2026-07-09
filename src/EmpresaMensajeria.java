import java.util.ArrayList;

public class EmpresaMensajeria {
    private ArrayList<paqueteenvio> listapaquetes;

    public EmpresaMensajeria() {
        this.listapaquetes = new ArrayList<>();
    }

    public void registrarPaquetes (paqueteenvio p){
        listapaquetes.add(p);
    }

    public void imprimirReporte (){
        System.out.println("REPORTE");
        double dinerototal = 0;
        for (paqueteenvio p : listapaquetes){
            double costo= p.obtenerCostoEnvio();
            dinerototal += costo;

            String eEnvio = "";
            if (p.getEstrategiaenvio() instanceof EnvioEstandar){
                eEnvio = "Envio Estandar";
            }else if (p.getEstrategiaenvio() instanceof EnvioExpress){
                eEnvio= "Envio Express";
            }else if (p.getEstrategiaenvio() instanceof EnvioInternacional) {
                eEnvio = "Envio Internacional";
            }

            System.out.println("Destinatario: " + p.getNombreDestinatario());
            System.out.println("Costo: " + costo);
            System.out.println("Peso: " + p.getPesoKg() +" Kg");
            System.out.println("Estrategia Envio: " + eEnvio);
            System.out.println("____________________________");
        }
        System.out.println("Tota Dia $" + dinerototal);
    }



}
