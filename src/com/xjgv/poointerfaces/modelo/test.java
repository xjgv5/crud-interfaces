package com.xjgv.poointerfaces.modelo;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;

        System.out.println("juego del ahorcado");
        System.out.println("¿que deseas hacer");
        System.out.println("1. iniciar un juego");
        System.out.println("2. configuracion ");
        System.out.println("3. salir");

        opcion = sc.nextInt();

        System.out.println("Gracias por jugar");

    }
}
