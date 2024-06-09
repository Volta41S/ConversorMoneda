package com.alurachallenge.conversor.Conector;
import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Consulta {
    public Divisa consultarDivisa(String monedaInicial, String monedaFinal, double cantidad){
    URI direccion = URI.create("https://v6.exchangerate-api.com/v6/1e596e9cac9e254dc24a214c/pair/"+monedaInicial+"/"+monedaFinal+"/"+cantidad);
    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion).build();

    HttpResponse<String> response = null;
    try {
        response = client.send(request, HttpResponse.BodyHandlers.ofString());
        return new Gson().fromJson(response.body(), Divisa.class);
    }catch (Exception e){
        throw new RuntimeException("No se encontro la divisa");
    }

    }
}
