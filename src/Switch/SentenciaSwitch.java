package Switch;

public class SentenciaSwitch {

    public static void main(String[] args) {

        int dia = 6;

        String diaSemana = switch (dia) {
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miércoles";
            case 4 -> "Jueves";
            case 5 -> "Viernes";
            case 6 -> "Sábado";
            case 7 -> "Domingo";
            default -> "Desconocido";
        };

        System.out.println("Hoy es: " + diaSemana);

    }
}
