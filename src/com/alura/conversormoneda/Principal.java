package com.alura.conversormoneda;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        double valorMoneda = 0;
        double valorConvertido = 0;
        int opcion = 0;

        String menu = """ 
                Sea Bienvenido/a al Conversor de Moneda =]
                \nElija una opcion:
                1) Dolar [USD] =>> Peso Colombiano [COP]
                2) Peso Colombiano [COP] =>> Dolar [USD]
                3) Dolar [USD] =>> Real Brasileño [BRL]
                4) Real Brasileño [BRL] =>> Dolar [USD]
                5) Dolar [USD] =>> Peso Argentino [ARS]
                6) Peso Argentino [ARS] =>> Dolar [USD]
                7) Salir """;

        System.out.println("********************************");
        System.out.println("\n" + menu);
        System.out.println("\n ********************************");

        Scanner teclado = new Scanner(System.in);

        while (opcion != 7){
            System.out.println("Ingrese la opcion de conversion: ");
            opcion = teclado.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("$" + valorMoneda + " [USD] Equivalen a " + "$" + valorConvertido + " [COP]");
                    break;
                case 2:
                    System.out.println("$" + valorMoneda + " [COP] Equivalen a " + "$" + valorConvertido + " [USD]");
                    break;
                case 3:
                    System.out.println("$" + valorMoneda + " [USD] Equivalen a " + "$" + valorConvertido + " [BRL]");
                    break;
                case 4:
                    System.out.println("$" + valorMoneda + " [BRL] Equivalen a " + "$" + valorConvertido + " [USD]");
                    break;
                case 5:
                    System.out.println("$" + valorMoneda + " [USD] Equivalen a " + "$" + valorConvertido + " [ARS]");
                    break;
                case 6:
                    System.out.println("$" + valorMoneda + " [ARS] Equivalen a " + "$" + valorConvertido + " [USD]");
                    break;
                case 7:
                    System.out.println("Saliendo del conversor de moneda, Gracias por utilizar nuestros servicios");
                    break;
                default:
                    System.out.println("Opcion no valida!");
            }



        }


    }
}
