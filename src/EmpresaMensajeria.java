import java.util.ArrayList;

public class EmpresaMensajeria {

    private ArrayList<Paquete> paquetes;

    public EmpresaMensajeria() {
        paquetes = new ArrayList<>();
    }

    public void registrarPaquete(Paquete paquete) {
        paquetes.add(paquete);
    }
}
