public class Main {

    System.out.print("Nombre del destinatario: ");
    String nombreDestinatario = teclado.nextline();

    System.out.print("Peso del paquete en kg: ");
    double pesoKg = teclado.nextline();

    System.out.println("Seleccione el tipo de envio: ");
    System.out.println("Envio Estandar");
    System.out.println("Envio Express");
    System.out.println("Envio Internacional");

    int opcionEnvio = teclado.nextline();
}