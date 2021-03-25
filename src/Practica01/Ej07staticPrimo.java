package Practica01;

import java.util.Scanner;

public class Ej07staticPrimo {

    private static boolean esPrimo(int n) {

        for(int i=2;i<n;i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero: ");
        int n = sc.nextInt();

        System.out.println(esPrimo(n));
    }
}
