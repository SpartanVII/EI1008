package Practica01;

import java.util.Scanner;

public class Ej02DobleFactorial {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce un número entero: ");
    int n = sc.nextInt();
    int factorial=1;
    int num=(n%2==0?2:1);
    for(int i=num; i<=n;i+=2)
        factorial*=i;
    
    System.out.println(n+"!! = "+factorial);

}
}
