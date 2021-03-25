package Practica01;

import java.util.List;
import java.util.Scanner;

public class Ej04PrimosMenores {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número entero: ");
        int n = sc.nextInt();

        System.out.print("Los números primos menores que " + n + " son:");
        for (int i = 2; i < n; i++) {
            boolean esPrimo = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    esPrimo=false;
                    break;
                }
            }
            if (esPrimo) System.out.print(" "+i);

        }
    }
}