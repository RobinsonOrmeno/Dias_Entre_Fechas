
import java.text.ParseException;

import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.Scanner;

public class test {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MM yyyy");
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese fecha 1 formato dd MM YYYY");
        String fecha1 = sc.nextLine();
        if (fecha1.equals("000000")) {
            System.out.println("error de 000000");
        } else {
            Date fechaInicial = dateFormat.parse(fecha1);
         
            if (fechaInicial.getTime() < 1862 ) {
                System.out.println("Error al ingresar este año");
               
            } else {
                System.out.println("Ingrese fecha posterior formato dd MM YYYY");
                String fecha2 = sc.nextLine();
                Date fechaFinal = dateFormat.parse(fecha2);
                int dias = (int) ((fechaFinal.getTime() - fechaInicial.getTime()) / 86400000);
                System.out.println("Hay " + dias + " dias de No Cumpleaños");
            }
        }

    }

}
