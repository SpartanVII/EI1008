package Practica01;

import java.util.Scanner;

public class Ej10staticMasDivisores {

    private static int contarDivisores(int n){

        int divisores = 0;
        for (int i = 1; i <= n; i++){
            if (n % i == 0) {
                ++divisores;
            }
        }
        return divisores;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número entero: ");
        int n = sc.nextInt();

        int num=0;
        int mdiv=0;
        for (int x = 1; x <= n; x++) {
            int div = contarDivisores(x);

            if (div >= mdiv) {
                mdiv = div;
                num = x;
            }
        }
        System.out.println("El número con más divisores es "+num+" ("+mdiv+" divisores)");
    }
}

