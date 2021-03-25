package Practica01;

import java.util.Scanner;

public class Ej05Primorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número entero: ");
        int n = sc.nextInt();

        int primorial=1;
        for (int i = 2; i <= n; i++) {
            boolean esPrimo=true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    esPrimo=false;
                    break;
                }
            }
            if (esPrimo) primorial*=i;

        }
        System.out.println(n+"# = "+primorial);
    }
}
