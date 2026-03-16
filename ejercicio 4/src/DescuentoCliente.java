//El patrón de estrategia
//Tiene un if…else de 10 niveles para calcular descuentos según el tipo de cliente. Investigue
//porque los desarrolladores dicen que “muchos if seguidos son olor de código (code smell)” y
//proponga una alternativa inicial usando un switch mejorado o discutir como los objetos
//podrían reemplazar estas decisiones en el futuro.

// se refieren a que el diseño del programa puede tener problemas de mantenibilidad, legibilidad y escalabilidad.
// No significa que el código esté necesariamente mal, pero es una señal de que podría mejorarse.
import java.util.Scanner;

public class DescuentoCliente {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el tipo de cliente:");
        System.out.println("NORMAL / PREMIUM / VIP / EMPRESA");

        String tipoCliente = sc.nextLine().toUpperCase();

        System.out.println("Ingrese el monto de la compra:");
        double monto = sc.nextDouble();

        double descuento;

        switch (tipoCliente) {
            case "NORMAL":
                descuento = 0.05;
                break;

            case "PREMIUM":
                descuento = 0.10;
                break;

            case "VIP":
                descuento = 0.20;
                break;

            case "EMPRESA":
                descuento = 0.15;
                break;

            default:
                descuento = 0;
        }

        double montoDescuento = monto * descuento;
        double total = monto - montoDescuento;

        System.out.println("Descuento aplicado: " + (descuento * 100) + "%");
        System.out.println("Monto de descuento: $" + montoDescuento);
        System.out.println("Total a pagar: $" + total);

        sc.close();
    }
}