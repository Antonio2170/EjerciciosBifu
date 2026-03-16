package Inventario;

public class DilemaInventario {

    public static void main(String[] args) {

        int peso = 60;
        int distancia = 120;
        String producto = "Frágil";
        String metodoEnvio;

        if (peso > 50 && distancia > 100) {
            metodoEnvio = "Transporte pesado";
        } else if (peso < 50 && producto.equals("Frágil")) {
            metodoEnvio = "Envío Premium";
        } else if (peso < 10 && distancia < 20) {
            metodoEnvio = "Dron";
        } else {
            metodoEnvio = "Envío estándar";
        }

        System.out.println("Método elegido: " + metodoEnvio);



    }
}