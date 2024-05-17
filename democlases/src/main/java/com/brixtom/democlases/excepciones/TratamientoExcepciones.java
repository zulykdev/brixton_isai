package com.brixtom.democlases.excepciones;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TratamientoExcepciones {
    public static void main(String[] args) {
        //Solicitar entrada de datos de usuario, debe de ser de tipo entero
        //Mostrar el dato ingresado
        /*
        Scanner sc = new Scanner(System.in);
        int age;
        String iniciar= "y";

        while (iniciar.equals("y")){
            System.out.println("INGRESE el año de nacimiento: ");
            try {
                age =sc.nextInt();
                System.out.println("Año de nacimiento: " + age);
            } catch (Exception e) {
                System.out.println("información incorrecta: " + e.getMessage());
        }
            System.out.println("=============");
            System.out.println("Desea continuar?: y/n");
            iniciar = sc.next();

        }*/
        // ejercicio 2 - 3
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>(); // Lista para almacenar los números ingresados
        boolean continuar = true;

        do {
            try {
                System.out.print("Ingrese un número (o 'c' para continuar): ");
                String entrada = scanner.next();

                if (entrada.equalsIgnoreCase("c")) {
                    continuar = false; // Salir del ciclo si se ingresa 'c'
                } else {
                    int numero = Integer.parseInt(entrada);
                    numeros.add(numero); // Agregar el número a la lista
                    System.out.println("Número agregado: " + numero);
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada no válida. Por favor, ingrese un número o 'c'.");
                scanner.next(); // Limpiar la entrada no válida del búfer del escáner
            }
        } while (continuar);

        System.out.println("Números ingresados:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }



    }
}
