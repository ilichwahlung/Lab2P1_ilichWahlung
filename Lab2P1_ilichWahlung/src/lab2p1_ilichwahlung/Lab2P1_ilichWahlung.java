/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p1_ilichwahlung;

import java.util.Scanner;

public class Lab2P1_ilichWahlung {

    public static void main(String[] args) {
        Scanner w = new Scanner(System.in);
        int resp = 1;
        int Opcion;
        while (resp == 1) {
            int num;
            int i = 0;
            int j = 1;
            int num2;
            int cont = 0;
            double sumatoria = 0.0;
            int sum = 0;
            System.out.println("===========================");
            System.out.println("1. Ejercicio 1");
            System.out.println("2. Ejercicio 2");
            System.out.println("3. Ejercicio 3");
            System.out.println("4. Salir");
            System.out.println("===========================");
            Opcion = w.nextInt();

            switch (Opcion) {
                case 1:

                    String divisores = "";
                    boolean esprimo = true;
                    System.out.println("ingrese un numero");
                    num = w.nextInt();
                    while (j < num) {

                        if (num % j == 0) {
                            divisores += j + " ";

                            sum += j;
                            if (j > 1) {
                                esprimo = false;

                            }
                        }
                        j++;

                    }
                    if (esprimo) {
                        System.out.println("Es primo, no se pudo realizar el calculo por falta de divisores");
                    } else if (sum == num) {

                        System.out.println(" es un numero perfecto");
                        System.out.print(" divisores: " + divisores);

                    } else {
                        System.out.println(" no es un numero perfecto");
                    }
                    System.out.println("");
                    break;
                case 2:

                    System.out.println("ingrese un numero");
                    num = w.nextInt();
                    while (j <= num) {

                        double partearriba = ((2 * j) - 1);
                        double parteabajo = ((j + 1) * j);
                        sumatoria += (partearriba / parteabajo);
                        j++;

                    }
                    System.out.println(" la sumatoria es " + sumatoria);
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("ingrese un numero");
                    num = w.nextInt();
                    System.out.println("ingrese la cantidad de veces que se va repetir");
                    num2 = w.nextInt();
                    while (i < num2 + 2) {
                        if (i < 2) {
                            System.out.print(i + " ");
                        } else {
                            cont += num;
                            int temp = cont;
                            if ((i % 2) == 0) {
                                temp = temp * (-1);
                            }
                            System.out.print(temp + " ");

                        }
                        i++;
                    }
                    System.out.println("");
                    break;

                default:
                    resp = 0;
                    break;
            }

        }

    }
}
