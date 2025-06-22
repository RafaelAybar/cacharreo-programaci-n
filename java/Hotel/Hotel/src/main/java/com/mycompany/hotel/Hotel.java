/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.hotel;

import java.util.Scanner;

/**
 *
 * @author rafa
 */
public class Hotel {

    /* Pendiente de generar el menú de opciones*/
    public static void main(String[] args) {
        System.out.println("Bienvenido al hotel continental \n Selecciona tu opción");
        System.out.println("""
                           1: Crear reserva
                           2: Modificar reserva
                           3: Anular reserva
                           Cualquier otra númeo: Salir
                           """);
        Scanner menu = new Scanner(System.in);

        short respuesta;
        do {
            respuesta = menu.nextShort();
            switch (respuesta) {
                case 1 ->
                        System.out.println("Introduce los datos");
                case 2 -> {
                    System.out.println("Introduce el identificador de reservas");
                    String id_reserva = menu.next();
                    System.out.println("La reserva a modificar es:" + id_reserva);
                }
                case 3 ->
                        System.out.println("Introduce el identificador de reservas para anular");
                default ->
                        System.out.println("Adios");
            }
        } while (respuesta < 4);
    }
}
