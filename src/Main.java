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

            switch(opcion){
                case 1:
                    break;
                case 2:
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