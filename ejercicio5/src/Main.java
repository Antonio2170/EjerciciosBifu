import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa tu contraseña: ");
        String contraseña = leer.nextLine();
        boolean tieneNumero = false;
        boolean tieneMayuscula = false;

        for (int i = 0; i < contraseña.length(); i++) {
            char c = contraseña.charAt(i);

            if (Character.isDigit(c)) {
                tieneNumero = true;
            }

            if (Character.isUpperCase(c)) {
                tieneMayuscula = true;
            }
        }

        if (contraseña.length() < 8) {
            System.out.println("Contraseña insegura");
        }
        else if (tieneNumero && tieneMayuscula) {
            System.out.println("Contraseña fuerte");
        }
        else if (tieneNumero) {
            System.out.println("Contraseña moderada");
        }
        else {
            System.out.println("Contraseña insegura");
        }
        leer.close();
    }
}