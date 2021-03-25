package Practica01;

import java.util.Scanner;

public class EJ01Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número entero: ");
           int n = sc.nextInt();
           int factorial=1;

        for(int i=1;i<=n;i++)
            factorial*=i;

        System.out.println(n+"! = "+factorial);

    }
}
