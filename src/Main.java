import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        EmpresaMensajeria empresa = new EmpresaMensajeria();

        int opcion;

        do {
            System.out.println("MENU");
            System.out.println("1. Consultar tipos de envio");
            System.out.println("2. Registrar paquete");
            System.out.println("3. Imprimir reporte");
            System.out.println("4. Salir");

            opcion = teclado.nextInt();
            teclado.nextLine();

            switch(opcion) {
                case 1:
                    System.out.println("Envio estandar");
                    System.out.println("$2 * kg");

                    System.out.println("Envio express");
                    System.out.println("$4.5 * kg + $3 recargo fijo");

                    System.out.println("Envio internacional");
                    System.out.println("$6 * kg + $10 pago unico en la primera factura");
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

                    EstrategiaEnvio estrategia;

                    switch(tipo) {
                        case 1:
                            estrategia = new EnvioEstandar();
                            break;
                        case 2:
                            estrategia = new EnvioExpress();
                            break;
                        case 3:
                            estrategia = new EnvioInternacional();
                            break;
                        default:
                            System.out.println("Opcion invalida.");
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

            } while (opcion != 4);
    }

}