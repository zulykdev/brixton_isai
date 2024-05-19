package com.brixtom.democlases.excepciones;

import java.time.LocalDate;
import java.util.Scanner;

public class TratamientoExcepciones {
    public static void main(String[] args) {
        //Solicitar entrada de datos de usuario, debe de ser de tipo entero
        //Mostrar el dato ingresado

        Scanner sc = new Scanner(System.in);
        int age;
        String iniciar= "y";
        while (iniciar.equalsIgnoreCase("y")){
            try {
                System.out.println("Ingresa tu año de nacimiento: ");
                age =sc.nextInt();
                System.out.println("Año de nacimiento: " + age);
                LocalDate uno = LocalDate.now();
                int ageActual = uno.getYear();
                System.out.println("Tu posible edad actual es: " + (ageActual - age));

            } catch (Exception e) {
                System.out.println("información incorrecta: " + e.getClass());
                sc.nextLine();
            }
            System.out.println("=============");
            iniciar = preguntarContinuar(sc);
        }
        System.out.println("Gracias por usar el aplicativo. Fin del programa.");
    }
    private static String preguntarContinuar(Scanner scanner) {
        System.out.print("¿Desea continuar ingresando números? (y/n): ");
        String respuesta = scanner.next();
        while (!respuesta.equalsIgnoreCase("y") && !respuesta.equalsIgnoreCase("n")){
            System.out.println("favor de ingresar 'y' para continuar o 'n' para salir de la aplicación");
            respuesta = scanner.next();
        }
        return respuesta;
    }
}

