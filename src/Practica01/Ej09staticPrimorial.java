package Practica01;

import java.util.Scanner;

public class Ej09staticPrimorial {
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
        int primorial=1;
        for (int i = 2; i <= n; i++) {
            if (esPrimo(i)){
                primorial*=i;
            }
        }
        System.out.println(n+"# = "+primorial);
    }
}
