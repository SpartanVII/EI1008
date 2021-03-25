package Practica01;

import java.util.Arrays;

public class Ej14últimaPosición {
    public static void main(String[] args) {
        int[] prueba1= {2,2,4,2,6,1};
        int[] prueba2= {1,2,3,5,6};
        prueba(prueba1,2,3);
        prueba(prueba2,4,-1);
    }
    private static int últimaPosición(int[] vector,int n){
        int posicion=-1;
        for (int i=0; i<vector.length;i++){
            if (vector[i]==n){
                posicion=i;
            }

        }
        return posicion;
    }
    private static void prueba (int[] vector, int n,int esperado){
        int resultado = últimaPosición(vector, n);
        System.out.format("Prueba con %s y %s: ", Arrays.toString(vector), n);
        if (resultado==esperado)
            System.out.println("ok");
        else
            System.out.println("error");
    }
}
