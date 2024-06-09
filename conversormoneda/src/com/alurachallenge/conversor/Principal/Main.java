package com.alurachallenge.conversor.Principal;
import com.alurachallenge.conversor.Conector.Consulta;
import com.alurachallenge.conversor.Conector.Divisa;
import com.alurachallenge.conversor.Modelo.Moneda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Moneda moneda = new Moneda();
        String monedaInicial, monedaFinal;
        double cantidadMoneda = 0.0;
        Scanner scan = new Scanner(System.in);
        Menu menuOpcion = new Menu();
        //Consulta consulta = new Consulta();
        String pantallaF;
        int opcion = 0;
        System.out.println("¡Bienvenido/a al conversor de monedas!");
        while(opcion != 5) {
            try {
                pantallaF = """
                        ----------------------------------------------------------
                        Introduzca el un numero de acuerdo a la opcion que desee convertir:
                        1) Dolar Estadounidense a Peso Mexicano
                        2) Euro a Peso Mexicano
                        3) Euro a Dolar Estadounidense
                        4) Ingresar tipos de moneda manualmente
                        5) Salir
                        """;
                System.out.println(pantallaF);
                opcion = Integer.parseInt(scan.nextLine());

                switch (opcion) {
                    case 1:
                        System.out.println("Introduzca la cantidad a convertir:");
                        cantidadMoneda = Double.parseDouble(scan.nextLine());
                        monedaInicial = "USD";
                        monedaFinal = "MXN";
                        menuOpcion.menuOpcion(monedaInicial, monedaFinal, cantidadMoneda);
                        break;
                    case 2:
                        System.out.println("Introduzca la cantidad a convertir:");
                        cantidadMoneda = Double.parseDouble(scan.nextLine());
                        monedaInicial = "EUR";
                        monedaFinal = "MXN";
                        menuOpcion.menuOpcion(monedaInicial, monedaFinal, cantidadMoneda);
                        break;
                    case 3:
                        System.out.println("Introduzca la cantidad a convertir:");
                        cantidadMoneda = Double.parseDouble(scan.nextLine());
                        monedaInicial = "EUR";
                        monedaFinal = "USD";
                        menuOpcion.menuOpcion(monedaInicial, monedaFinal, cantidadMoneda);
                        break;
                    case 4:
                        pantallaF = """
                        Dejamos de referencia las siguientes tipos monedas:
                        USD - Dolar Estadounidense | VES - Bolivar Venezolano
                        CAD - Dolar Canadiense     | JPY - Yen Japones
                        MXN - Peso Mexicano        | RUB - Rublo Ruso
                        ARS - Peso Argentino       | EUR - Euro
                        BRL - Real Brasileño       | CNY - Yuan Chino (Renminbi)
                        """;
                        System.out.print(pantallaF);
                        menuOpcion.menuConsola();
                        break;
                    case 5:
                        break;
                    default:
                        break;
                }
            } catch (IllegalArgumentException e) {
                System.out.println("El nombre de la o las monedas fue ingresado de forma incorrecta o la cantidad ingresada no es de tipo numerico.");

            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }
}