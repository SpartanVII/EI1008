package Practica01;

import java.util.Scanner;

public class Ej03Primo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número entero: ");
        int n = sc.nextInt();
        String primo = "Es primo";

        for(int i=2;i<n;i++) {
            if (n % i == 0) {
                primo = "No es primo";
                break;
            }
        }
        System.out.println(primo);
    }
}
