package com.alura.conversormoneda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConvertirMoneda {

    private static List<HistorialDivisas> historial = new ArrayList<>();

    public static void convertir(String monedaBase, String monedaTarget, ConsultarMoneda consultar, Scanner teclado) {
        double valorConvertir = 0;
        double valorConvertido;
        String valorFormateado;

        Divisas divisa = consultar.buscarMoneda(monedaBase, monedaTarget);
        if (divisa == null) {
            System.out.println("No se encontró la conversión para las monedas ingresadas.");
            return;
        }

        System.out.println("Ingrese la cantidad que desea convertir: " + monedaBase);
        try {
            valorConvertir = Double.parseDouble(teclado.nextLine());
            if (valorConvertir < 0) {
                System.out.println("El valor a convertir no puede ser negativo.");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Por favor, ingrese un número válido.");
            return;
        }

        valorConvertido = valorConvertir * divisa.conversion_rate();
        valorFormateado = String.format("%.2f", valorConvertido);
        mostrarResultado(valorConvertir, monedaBase, valorFormateado, divisa.target_code());

        historial.add(new HistorialDivisas(monedaBase, divisa.target_code(), valorConvertido));
    }

    private static void mostrarResultado(double valorConvertir, String monedaBase, String valorFormateado, String monedaTarget) {
        System.out.println("$" + valorConvertir + " " + monedaBase + " equivalen a $" + valorFormateado + " " + monedaTarget);
    }

    public static void convertirOtraDivisa(ConsultarMoneda consultar, Scanner teclado) {
        System.out.println("Ingrese el acrónimo/abreviatura de la moneda base: ");
        String monedaBase = teclado.nextLine().toUpperCase();
        System.out.println("Ingrese el acrónimo/abreviatura de la moneda que desea convertir: ");
        String monedaConvertir = teclado.nextLine().toUpperCase();
        convertir(monedaBase, monedaConvertir, consultar, teclado);
    }

    public static void mostrarHistorial() {
        if (historial.isEmpty()) {
            System.out.println("No hay registros en el historial de conversiones.");
        } else {
            System.out.println("Historial de conversiones:");
            for (HistorialDivisas record : historial) {
                System.out.println(record.DetallesFecha());
            }
        }
    }
}
