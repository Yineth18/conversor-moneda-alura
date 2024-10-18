package com.alura.conversormoneda;

import java.util.Scanner;

public class ConvertirMoneda {

    public static void convertir(String monedaBase, String monedaTarget, ConsultarMoneda consultar, Scanner teclado) {
        double valorConvertir;
        double valorConvertido;
        String valorFormateado;

        Divisas divisa = consultar.buscarMoneda(monedaBase,monedaTarget);
        System.out.println("Ingrese la cantidad que desea convertir: " + monedaBase);
        valorConvertir = Double.parseDouble(teclado.nextLine());
        valorConvertido = valorConvertir * divisa.conversion_rate();
        valorFormateado = String.format("%.2f",valorConvertido);
        System.out.println("$" + valorConvertir + " " +monedaBase+ " Equivalen a " + "$" + valorFormateado + " " +divisa.target_code());

    }

    public static void convertirOtraDivisa(ConsultarMoneda consultar, Scanner teclado) {
        System.out.println("Ingrese el Acronimo/Abreviatura de la moneda base: ");
        String monedaBase = teclado.nextLine().toUpperCase();
        System.out.println("Ingrese el Acronimo/Abreviatura de la moneda que desea convertir: ");
        String monedaConvertir = teclado.nextLine().toUpperCase();
        convertir(monedaBase, monedaConvertir, consultar, teclado);

    }
}
