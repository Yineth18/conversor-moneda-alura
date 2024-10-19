package com.alura.conversormoneda;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HistorialDivisas {

    private String monedaBase;
    private String monedaTarget;
    private double valorConvertido;
    private LocalDateTime fechaHora;

    public HistorialDivisas(String monedaBase, String monedaTarget, double valorConvertido) {
        this.monedaBase = monedaBase;
        this.monedaTarget = monedaTarget;
        this.valorConvertido = valorConvertido;
        this.fechaHora = LocalDateTime.now();
    }

    public String DetallesFecha() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return String.format("%s -> %s: $%.2f | %s", monedaBase, monedaTarget, valorConvertido, fechaHora.format(formatter));
    }
}
