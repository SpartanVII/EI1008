package Practica01;

import java.util.Arrays;

public class Ej17hayRepetidos {
    public static void main(String[] args) {
        int[] prueba1= {2,3,4,5,6,1};
        int[] prueba2= {6,2,6,4,5,6};
        prueba(prueba1,false);
        prueba(prueba2,true);
    }
    private static boolean hayRepetidos(int[] vector){
        for (int i=0; i<vector.length; i++){
            for (int j=i+1; j<vector.length; j++){
                if (vector[i]==vector[j]){
                    return true;
                }
            }
        }
        return false;
    }
    private static void prueba (int[] vector, boolean esperado){
        boolean resultado = hayRepetidos(vector);
        System.out.format("Prueba con %s: ",Arrays.toString(vector));
        if (resultado==esperado)
            System.out.println("ok");
        else
            System.out.println("error");
    }
}
