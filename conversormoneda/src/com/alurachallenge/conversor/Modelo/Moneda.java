package com.alurachallenge.conversor.Modelo;
import com.alurachallenge.conversor.Conector.Divisa;

public class Moneda {
    public String monedaInicial;
    public String modenaFinal;
    public double cantidad;
    public double resultado;

    public void impresionResultado(Divisa divisa, double cantidadMoneda){
        this.monedaInicial = divisa.base_code();
        this.modenaFinal = divisa.target_code();
        this.cantidad = cantidadMoneda;
        this.resultado = divisa.conversion_result();

        System.out.println("Tipo de moneda ingresada a convertir: "+monedaInicial+"\nCantidad ingresada: "+modenaFinal+"\nTipo de moneda convertida: "+cantidad+"\nResultado: "+divisa.conversion_result());

    }

    public String getMonedaInicial() {
        return monedaInicial;
    }

    public void setMonedaInicial(String monedaInicial) {
        this.monedaInicial = monedaInicial;
    }

    public String getModenaFinal() {
        return modenaFinal;
    }

    public void setModenaFinal(String modenaFinal) {
        this.modenaFinal = modenaFinal;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
}
