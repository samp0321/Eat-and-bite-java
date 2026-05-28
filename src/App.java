import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        ArrayList<String> carrito = new ArrayList<>();

        System.out.print("**********************************************\n");
        System.out.print("*                                            *\n");
        System.out.print("*         Bienvenido a Eat and Bite!         *\n");
        System.out.print("*                                            *\n");
        System.out.print("**********************************************\n");
        System.out.print("\n");
        System.out.print("¡Tu camino hacia una alimentación saludable comienza aquí!\n");
        System.out.print("\n");
        System.out.print("Es necesario que ingreses sección de cuenta para acceder a tu perfil y realizar tus pedidos.\n");
        System.out.print("\n");
        System.out.print("Elige una opción:\n");
        System.out.print("1. Iniciar sesión\n");
        System.out.print("2. Registrarse\n");
        System.out.print("3. Salir\n");
        System.out.print("\n");
        System.out.print("Opción: ");
        
        int opcionLogin = scan.nextInt();
        String usuario = "";
        String contrasena = "";


            switch (opcionLogin) {
                case 1:
                    System.out.print("\n");
                    System.out.print("**********************************************\n");
                    System.out.print("                                             \n");
                    System.out.print("              Iniciar sesión                \n");
                    System.out.print("                                             \n");
                    System.out.print("**********************************************\n");
                    System.out.print("\n");
                    System.out.print("Ingresa tu usuario: ");
                    usuario = scan.next();
                    System.out.print("Ingresa tu contraseña: ");
                    contrasena = scan.next();
                    System.out.print("Iniciando sesión...\n");
                    Thread.sleep(5000);
                    System.out.print("\n");
                    System.out.print("¡Inicio de sesión exitoso!\n");
                    System.out.print("\n");
                    System.out.print("Cargando tu perfil...\n");
                    Thread.sleep(2000);
                    System.out.print("\n");
                    System.out.print("***********************************************\n");
                    System.out.print("                                             \n");
                    System.out.print("         ¡Bienvenido, " + usuario + "!       \n");
                    System.out.print("                                             \n");
                    System.out.print("***********************************************\n");
                    System.out.print("\n");
                    break;
                case 2:
                    System.out.print("**********************************************\n");
                    System.out.print("                                             \n");
                    System.out.print("              Registrarse                   \n");
                    System.out.print("                                             \n");
                    System.out.print("**********************************************\n");
                    System.out.print("\n");
                    System.out.print("Crea tu nombre de usuario: ");
                    usuario = scan.next();
                    System.out.print("Ingresa una contraseña: ");
                    contrasena = scan.next();
                    System.out.print("Registrando usuario...\n");
                    Thread.sleep(8000);
                    System.out.print("\n");
                    System.out.print("¡Registro exitoso!\n");
                    System.out.print("\n");
                    System.out.print("Cargando tu perfil...\n");
                    Thread.sleep(2500);
                    System.out.print("\n");
                    System.out.print("***********************************************\n");
                    System.out.print("                                             \n");
                    System.out.print("         ¡Bienvenido, " + usuario + "!       \n");
                    System.out.print("                                             \n");
                    System.out.print("     Por ser usuario nuevo te regalamos      \n");
                    System.out.print("     un descuento del 10% en tu primer       \n");
                    System.out.print("     pedido. ¡Aprovecha esta oferta!        \n");
                    System.out.print("                                             \n");
                    System.out.print("     Código de descuento: BMDFK10            \n");
                    System.out.print("                                             \n");
                    System.out.print("***********************************************\n");
                    System.out.print("\n");
                    break;
                case 3:
                    System.out.print("\n");
                    System.out.print("Saliendo...\n");
                    break;
                default:
                    System.out.print("\n");
                    System.out.print("Opción no válida.\n");
                    break;
            }

        System.out.print("\n");
        System.out.print("***********************************************\n");
        System.out.print("                                             \n");
        System.out.print("         Catalogo de productos               \n");
        System.out.print("                                             \n");
        System.out.print("***********************************************\n");
        System.out.print("\n");
            String[] productos = {
                                "Ensalada César",
                                "Bowl de Quinoa",
                                "Wrap Integral",
                                "Sopa de Lentejas",
                                "Smoothie Verde"
                            };
            
            int total = 0;

            int[] precios = {
                    23000, 
                    29000, 
                    24000, 
                    13000, 
                    15000
                };

            for (int i = 0; i < productos.length; i++) {
                System.out.print((i + 1) + ". " + productos[i] + "\n");
            }

            System.out.print("\n");
            boolean seguirComprando = true;

            while (seguirComprando) {
                System.out.print("***********************************************\n");
                System.out.print("Ingresa el número del producto que deseas agregar al carrito: ");
                int opcionProducto = scan.nextInt();

                String productoElegido = productos[opcionProducto - 1];
                int precioProducto = precios[opcionProducto - 1];
                carrito.add(productoElegido + " - $" + precioProducto);

                total = total + precioProducto;

                System.out.print("***********************************************\n");
                System.out.print("Producto agregado al carrito: " + productoElegido + "\n");
                System.out.print("***********************************************\n");
                System.out.print("¿Deseas agregar otro producto? (s/n): ");
                String agregarOtro = scan.next();

                if (agregarOtro.equalsIgnoreCase("n")) {
                    seguirComprando = false;
                }
                System.out.print("\n");
            }

        System.out.print("***********************************************\n");
        System.out.print("                                             \n");
        System.out.print("         Resumen de tu pedido               \n");
        System.out.print("                                             \n");
        System.out.print("***********************************************\n");
        System.out.print("\n");

        for (String producto : carrito) {
            System.out.print("- " + producto + "\n");
            System.out.print("\n");
        }

        System.out.print("***********************************************\n");
        System.out.print("Total: $" + total + "\n");
        System.out.print("***********************************************\n");
        System.out.print("\n");

            System.out.print("***********************************************\n");
            System.out.print("                                             \n");
            System.out.print("      Pago con tarjeta de crédito/debito     \n");
            System.out.print("                                             \n");
            System.out.print("***********************************************\n");

            System.out.print("Ingresa el número de tu tarjeta: ");
            String numeroTarjeta = scan.next();
            System.out.print("Ingresa la fecha de vencimiento (MM/AA): ");
            String fechaVencimiento = scan.next();
            System.out.print("Ingresa el código de seguridad (CVV): ");
            String cvv = scan.next();

            System.out.print("Por tu seguridad, ingresa tu contraseña para confirmar el pago: ");
            if (scan.next().equals(contrasena)) {
                System.out.print("Contraseña correcta.\n");

                System.out.print("\n");
                System.out.print("************************************************\n");
                System.out.print("                                                \n");
                System.out.print("         Tarjeta: "    + numeroTarjeta + "          \n");
                System.out.print("         Fecha de vencimiento: "    + fechaVencimiento + "\n");
                System.out.print("         CVV: "    + cvv + "                        \n");
                System.out.print("                                                \n");
                System.out.print("************************************************\n");
                System.out.print("\n");
                System.out.print("¿Tienes algun cupon de descuento? (s/n):");

                if (scan.next().equalsIgnoreCase("s")) {
                    System.out.print("Ingresa tu código de descuento: ");
                    if (scan.next().equalsIgnoreCase("BMDFK10")) {
                        total = total - (total * 10 / 100);
                        System.out.print("Código de descuento aplicado. Nuevo total: $" + total + "\n");
                        System.out.print("\n");
                        System.out.print("Realizando pago...\n");

                        } else {
                            System.out.print("Código de descuento inválido. No se aplicará ningún descuento.\n");
                            System.out.print("\n");
                            System.out.print("Realizando pago...\n");
                    }
                    } else {
                        System.out.print("No tienes un cupón de descuento. Realizando pago...\n");
                }

                Thread.sleep(5000);
                System.out.print("\n");
                System.out.print("************************************************\n");
                System.out.print("                                              \n");
                System.out.print("         ¡Pago exitoso! Gracias por tu compra.    \n");
                System.out.print("                                              \n");
                System.out.print("************************************************\n");
                System.out.print("\n");

                scan.nextLine(); // Limpiar el buffer

                    System.out.print("Digite su dirección de entrega: ");
                    String direccion = scan.nextLine();
                    System.out.print("************************************************\n");
                    System.out.print("                                                \n");
                    System.out.print("                 Factura de compra              \n");
                    System.out.print("                                                \n");
                    for (String producto : carrito) {
                        System.out.print("         " + producto + "\n");
                        System.out.print("\n");
                    }
                    System.out.print("                                                \n");
                    System.out.print("         Total: $" + total + "                    \n");
                    System.out.print("                                               \n");
                    System.out.print("         Dirección de entrega: " + direccion + "  \n");
                    System.out.print("                                                \n");
                    System.out.print("************************************************\n");
            } else {
                System.out.print("Contraseña incorrecta. Pago cancelado.\n");
            }
            scan.close();
    }
}
