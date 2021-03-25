package Practica01;

import java.util.Scanner;

public class Ej08staticPrimosMenores {


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
    System.out.print("Los números primos menores que " + n + " son:");
    for (int i = 2; i < n; i++) {
        if (esPrimo(i)){
            System.out.print(" "+i);
        }
    }
}

}

