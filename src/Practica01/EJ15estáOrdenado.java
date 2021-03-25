package Practica01;

import java.util.Arrays;

public class EJ15estáOrdenado {
    public static void main(String[] args) {
        String[] prueba1= {"Ahora","eres","mago","profesional"};
        String[] prueba2= {"No","debo","dar","true"};
        prueba(prueba1,true);
        prueba(prueba2,false);
    }
    private static boolean estáOrdenado(String[] vector){
        for (int i=1; i<vector.length;i++){
            if (vector[i].compareTo(vector[i-1])<0){
                    return false;
            }
        }
        return true;
    }
    private static void prueba (String[] vector,boolean esperado){
        boolean resultado = estáOrdenado(vector);
        System.out.format("Prueba con %s : ", Arrays.toString(vector));
        if (resultado==esperado)
            System.out.println("ok");
        else
            System.out.println("error");
    }
}
