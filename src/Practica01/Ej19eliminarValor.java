package Practica01;

import java.util.Arrays;

public class Ej19eliminarValor {
    public static void main(String[] args) {
        int[] prueba1= {2,3,4,5,6,1};
        int[] sol1= {3,4,5,6,1};
        int[] prueba2= {1,2,3,4,5,6};
        int[] sol2= {1,2,3,5,6};
        prueba(prueba1,2,sol1);
        prueba(prueba2,4,sol2);
    }

    private static int[] eliminarValor(int[] vector,int n){
        int contadorIguales=0;
       for (int i=0; i<vector.length;i++){
           if (vector[i]==n){
               contadorIguales++;
           }
       }
       int[] vfinal= new int[vector.length-contadorIguales];
       int contadorVFinal=0;
           for (int j=0; j<vector.length;j++){
               if (vector[j]!=n){
               vfinal[contadorVFinal]=vector[j];
               contadorVFinal++;
               }
           }
           return vfinal;
       }

    private static void prueba (int[] vector, int n,int[] esperado){
        int[] resultado = eliminarValor(vector, n);
        System.out.format("Prueba con %s y %s: ",Arrays.toString(vector), n);
        if (Arrays.equals(resultado,esperado))
            System.out.println("ok");
        else
            System.out.println("error");
    }
}


