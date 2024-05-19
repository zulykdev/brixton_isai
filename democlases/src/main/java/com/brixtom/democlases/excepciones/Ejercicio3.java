package com.brixtom.democlases.excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a;
        double b;
        String continuar = "y";
        while (continuar.equalsIgnoreCase("y")) {
            try {
                System.out.println("INGRESE 1ER NUMERO: ");
                a = sc.nextDouble();
                System.out.println("INGRESE 2DO NUMERO: ");
                b = sc.nextDouble();
                //suma
                System.out.println("RESULTADO de la Suma: " + (a+b));
                //System.out.println("RESULTADO de la División: " + (a/b));
            } catch (InputMismatchException e) {
                System.out.println("Error D001: " + e.getClass());
                sc.nextLine();
            } catch (Exception e) {
                System.out.println("Error ME001: " + e.getClass());
                sc.nextLine();
            }
            //System.out.println("=============");
            System.out.println("Desea continuar?: y/n");
            continuar = sc.next();
            while (!continuar.equalsIgnoreCase("y") && !continuar.equalsIgnoreCase("n")){
                System.out.println("favor de ingresar 'y' para continuar o 'n' para salir de la aplicación");
                continuar = sc.next();
            }
        }
    }
}
