package Fecha;

public class ValidoFecha {

    public static void main(String[] args) {

        int dia = 14, mes = 12, anio = 2006;
        boolean esValida = true;

        if (mes < 1 || mes > 12) {
            esValida = false;
        } else {
            int diasEnMes;
            switch (mes) {
                case 1,3,5,7,8,10,12 -> diasEnMes = 31;
                case 4,6,9,11 -> diasEnMes = 30;
                case 2 -> {
                    boolean bisiesto = (anio % 400 == 0) || (anio % 4 == 0 && anio % 100 != 0);
                    diasEnMes = bisiesto ? 29 : 28;
                }
                default -> diasEnMes = 0;
            }
            if (dia < 1 || dia > diasEnMes) {
                esValida = false;
            }
        }

        System.out.println(esValida ? "Fecha válida" : "Fecha inválida");
    }
}

