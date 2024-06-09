package com.alurachallenge.conversor.Principal;

import com.alurachallenge.conversor.Conector.Consulta;
import com.alurachallenge.conversor.Conector.Divisa;
import com.alurachallenge.conversor.Modelo.Moneda;

import java.util.Scanner;

import static java.lang.Thread.sleep;

public class Menu {
    public void menuConsola () throws InterruptedException {
        String monedaInicial, monedaFinal;
        double cantidadMoneda = 0.0;
        System.out.println("Escriba la moneda a convertir:");
        Moneda moneda = new Moneda();
        Scanner scan = new Scanner(System.in);
        Consulta consulta = new Consulta();

        monedaInicial = scan.nextLine();
        System.out.println("Escriba la 2da modena a la que desee convertir");
        monedaFinal = scan.nextLine();
        System.out.println("Escriba la cantidad a convertir");
        cantidadMoneda = Double.parseDouble(scan.nextLine());
        Divisa divisa = consulta.consultarDivisa(monedaInicial, monedaFinal, cantidadMoneda);
        moneda.impresionResultado(divisa, cantidadMoneda);
        Thread.sleep(5000);
    }
    public void menuOpcion(String monedaInicial, String monedaFinal, double cantidad) throws InterruptedException {
        Consulta consulta = new Consulta();
        Moneda moneda = new Moneda();
        Divisa divisa = consulta.consultarDivisa(monedaInicial, monedaFinal, cantidad);
        moneda.impresionResultado(divisa, cantidad);
        Thread.sleep(5000);
    }
}
