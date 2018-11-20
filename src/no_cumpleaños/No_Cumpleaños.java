/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no_cumpleaños;

/**
 *
 * @author Usuario
 */


import java.io.BufferedReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class No_Cumpleaños {
	
	//Declaro la entrada por escaner y las variables que utilizaré a lo largo del código.
	static Scanner scanner = new Scanner(System.in); 
	static int select = -1; 
	static Date fechaInicial;
        static Date fechaFinal;
	
	public static void main(String[] args) {
		while(select != 0){
			try{
				System.out.println("Elige opción:\n1.- Ingresar Fechas"+
						"\n0.- Salir");
				
				select = Integer.parseInt(scanner.nextLine()); 
				
				switch(select){
				case 1: 
					pideFecha();                 
					break;
				case 0: 
					System.out.println("Fin del programa");
					break;
				default:
					System.out.println("Número no reconocido");
					break;
				}			
				System.out.println("\n"); 			
			}catch(Exception e){
				System.out.println("Error!, seleccione 1 o 0 porvafor");
			}
		}

	}	
	
	public static void pideFecha() throws ParseException{
		//Aqui es donde le solicito al usuario la entrada de datos
		// y sus respectivas validaciones
                
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MM yyyy");
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una fecha formato dd MM YYYY");
        String fecha1 = sc.nextLine();
        if (fecha1.equals("000000")) {
            System.out.println("error de 000000");
        } else {
            Date fechaInicial = dateFormat.parse(fecha1);
            if (fechaInicial.getTime() < 1862) {
                System.out.println("Error no eres más viejo que el anciano");
            } else {
                System.out.println("Ingrese una fecha posterior formato dd MM YYYY");
                String fecha2 = sc.nextLine();
                Date fechaFinal = dateFormat.parse(fecha2);
                int dias = (int) ((fechaFinal.getTime() - fechaInicial.getTime()) / 86400000);
                System.out.println("Hay " + dias + " dias de No Cumpleaños");
            }
        }

    }



}
