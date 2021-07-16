/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tarea1.progra2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Karla Flores
 */
public class Main {
//Creando constantes del precio de la divisas
    static final double dolares = 7.75;
    static final double euros = 9.16;
    static final double yuanes = 1.20;

    public static void main(String[] args) {

        //utilizacion del import scanner para la lectura de datos en la consola
        Scanner sc = new Scanner(System.in);

        //Creacion de variables a utilizar
        String nombre1, nombre2, apellido1, apellido2;
        double res, valor = 0;

        //Obtencion de datos
        System.out.println("Ingrese su primer nombre: ");

        nombre1 = sc.nextLine();
        System.out.println("Ingrese su segundo nombre: ");
        nombre2 = sc.nextLine();

        System.out.println("Ingrese su primer apellido: ");
        apellido1 = sc.nextLine();

        System.out.println("Ingrese su segundo apellido: ");
        apellido2 = sc.nextLine();

        System.out.println("Ingrese la cantidad que desea convertir: ");
        valor = sc.nextDouble();
        
        
        //creacion de un menu para la seleccion de la divisa a la que se desea
        //convertir
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario

        while (!salir) {
            System.out.println("Seleccione una divisa a convertir");

            System.out.println("1. Dolares");
            System.out.println("2. Euros");
            System.out.println("3. Yuanes");
            System.out.println("4. Salir");

            try {

                System.out.println("Escribe una de las opciones");
                opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        //dolares
                        System.out.println("Se ha seleccionado Quetzales a Dolares");
                        res = valor * dolares;
                        System.out.println("Su nombre es: " + nombre1 + ' ' + nombre2 + ' ' + apellido1 + ' ' + apellido2);
                        System.out.println("El resultado es: " + res);

                        break;
                    case 2:
                        //euros
                        System.out.println("Se ha seleccionado Quetzales a Euros");
                        res = valor * euros;
                        System.out.println("Su nombre es: " + nombre1 + ' ' + nombre2 + ' ' + apellido1 + ' ' + apellido2);
                        System.out.println("El resultado es: " + res);
                        break;
                    case 3:
                        //yuanes
                        System.out.println("Se ha seleccionado Quetzales a Yuanes");
                        res = valor * yuanes;
                        System.out.println("Su nombre es: " + nombre1 + ' ' + nombre2 + ' ' + apellido1 + ' ' + apellido2);
                        System.out.println("El resultado es: " + res);
                        break;
                    case 4:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sc.next();
            }
        }

    }

}
