import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        EmpresaMensajeria empresa = new EmpresaMensajeria();

        int opcion = 0;

        do {
            try {
                System.out.println("MENU");
                System.out.println("1. Consultar tipos de envio");
                System.out.println("2. Registrar paquete");
                System.out.println("3. Imprimir reporte");
                System.out.println("4. Salir");

                opcion = teclado.nextInt();
                teclado.nextLine();

                switch (opcion) {
                    case 1:
                        System.out.println("TIPOS DE ENVIO");
                        System.out.println(" ");

                        System.out.println("Envio estandar:");
                        System.out.println("$2.00 USD por kg (entrega en 5 a 7 días hábiles).");
                        System.out.println(" ");

                        System.out.println("Envio express");
                        System.out.println("$4.50 USD por kg + un cargo fijo de $3.00 USD por manejo prioritario (entrega\n" +
                                "en 24 a 48 horas).");
                        System.out.println(" ");

                        System.out.println("Envio internacional");
                        System.out.println("$6.00 USD por kg + un recargo único de $10.00 USD en la primera factura\n" +
                                "por trámites aduaneros y seguro obligatorio.");
                        System.out.println(" ");
                        break;
                    case 2:
                        System.out.println("Nombre del destinatario: ");
                        String nombre = teclado.nextLine();

                        System.out.println("Peso en kg: ");
                        double peso = teclado.nextDouble();

                        System.out.println("Tipo de envio: ");
                        System.out.println("1) Envio estandar");
                        System.out.println("2) Envio express");
                        System.out.println("3) Envio internacional");
                        int tipo = teclado.nextInt();
                        if (tipo == 1) {
                            paqueteenvio paquete = new paqueteenvio(nombre, peso, new EnvioEstandar());
                            empresa.registrarPaquete(paquete);
                            System.out.println("Su paquete se registro con exito.");
                        } else if (tipo == 2) {
                            paqueteenvio paquete = new paqueteenvio(nombre, peso, new EnvioExpress());
                            empresa.registrarPaquete(paquete);
                            System.out.println("Su paquete se registro con exito.");
                        } else if (tipo == 3) {
                            paqueteenvio paquete = new paqueteenvio(nombre, peso, new EnvioInternacional());
                            empresa.registrarPaquete(paquete);
                            System.out.println("Su paquete se registro con exito.");
                        } else {
                            System.out.println("Seleccione una opccion el menu.");
                        }
                        break;
                    case 3:
                        empresa.imprimirReporte();
                        break;
                    case 4:
                        System.out.println("Hasta luego...");
                        break;
                    default:
                        System.out.println("Opcion invalida");

                }
            } catch (Exception e) {
                System.out.println("Ingrese un dato válido.");
                teclado.nextLine();
            }

        } while (opcion != 4);
    }
}
