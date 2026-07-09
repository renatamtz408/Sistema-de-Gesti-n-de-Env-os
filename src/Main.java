import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opc = 0;
        EmpresaMensajeria empresaMensajeria = new EmpresaMensajeria();
        do {
            try {
                System.out.println("   MENU");
                System.out.println("1) Consultar opcciones");
                System.out.println("2) Registrar Paquete");
                System.out.println("3) Imprimir Reporte");
                System.out.println("4) Salir");
                opc = teclado.nextInt();
                teclado.nextLine();
                switch (opc) {
                    case 1:
                        System.out.println("OPCIONES DE ENVIO: ");
                        System.out.println("Envio Estandar: $2.00 USD por kg (entrega en 5 a 7 días hábiles).");
                        System.out.println("Envio Express: $4.50 USD por kg y cargo fijo de $3.00 USD por manejo prioritario (entrega\n" +
                                "en 24 a 48 horas).");
                        System.out.println("Envio Internacional:$6.00 USD por kg + un recargo único de $10.00 USD en la primera factura\n" +
                                "por trámites aduaneros y seguro obligatorio.");
                        break;
                    case 2:
                        System.out.println("REGISTRE SU PAQUETE: ");
                        System.out.println("Ingrese el nombre del destinatario: ");
                        String nombre = teclado.nextLine();
                        System.out.println("Ingrese el peso en Kg del paquete: ");
                        double peso = teclado.nextDouble();
                        System.out.println("Seleccione el Tipo de envio: ");
                        System.out.println("1) Envio Estandar");
                        System.out.println("2) Envio Express");
                        System.out.println("3) Envio Internacional");
                        int tipo = teclado.nextInt();
                        teclado.nextLine();
                        if (tipo == 1) {
                            paqueteenvio p = new paqueteenvio(nombre, peso, new EnvioEstandar());
                            empresaMensajeria.registrarPaquetes(p);
                            System.out.println("Paquete registrado con exito.");
                        } else if (tipo == 2) {
                            paqueteenvio p = new paqueteenvio(nombre, peso, new EnvioExpress());
                            empresaMensajeria.registrarPaquetes(p);
                            System.out.println("Paquete registrado con exito.");
                        } else if (tipo == 3) {
                            paqueteenvio p = new paqueteenvio(nombre, peso, new EnvioInternacional());
                            empresaMensajeria.registrarPaquetes(p);
                            System.out.println("Paquete registrado con exito.");
                        } else {
                            System.out.println("Selecione una opccion del menu.");
                        }
                        break;
                    case 3:
                        empresaMensajeria.imprimirReporte();
                        break;
                    case 4:
                        System.out.println("Hasta pronto ...");
                        break;
                    default:
                        System.out.println("Seleccione una opccion del menu. ");
                        break;
                }
            }catch (Exception e) {
                System.out.println("Ingrese un dato válido.");
                teclado.nextLine();
                e.printStackTrace();
                opc = 0;
            }
        } while (opc != 4);
    }
}
