package com.alura.conversormoneda;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ConsultarMoneda consultar = new ConsultarMoneda();

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
                7) Convertir otra Divisa
                8) Salir """;


        while (opcion != 8){
            System.out.println("********************************");
            System.out.println("\n" + menu);
            System.out.println("\n ********************************");
            System.out.println("Ingrese la opcion que desea realizar: ");

            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion){
                case 1:
                    ConvertirMoneda.convertir("USD", "COP", consultar, teclado);
                    break;
                case 2:
                    ConvertirMoneda.convertir("COP", "USD", consultar, teclado);
                    break;
                case 3:
                    ConvertirMoneda.convertir("USD", "BRL", consultar, teclado);
                    break;
                case 4:
                    ConvertirMoneda.convertir("BRL", "USD", consultar, teclado);
                    break;
                case 5:
                    ConvertirMoneda.convertir("USD", "ARS", consultar, teclado);
                    break;
                case 6:
                    ConvertirMoneda.convertir("ARS", "USD", consultar, teclado);
                    break;
                case 7:
                    ConvertirMoneda.convertirOtraDivisa(consultar, teclado);
                    break;
                case 8:
                    System.out.println("Saliendo del conversor de moneda, Gracias por utilizar nuestros servicios");
                    break;
                default:
                    System.out.println("Opcion no valida!");
            }

        }

    }
}
