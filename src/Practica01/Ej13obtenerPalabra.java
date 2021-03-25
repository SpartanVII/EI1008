package Practica01;

import javax.swing.plaf.InsetsUIResource;
import java.util.ArrayList;
import java.util.List;

public class Ej13obtenerPalabra{
    public static void main(String[] args) {
        prueba("hola que tal", 2, "que");
        prueba("la desa q me desteó", 5, "desteó");
        prueba("hola", 2, null);
        prueba("  si no 333 la q no tal", 1, "si");

    }
    private static List<String> contarPalabras(String s1) {
        List<Integer> indices = new ArrayList<>();
        List<String> palabrasE = new ArrayList<>();
        boolean nuevPal=false;
        for (int i = 1; i < s1.length(); i++) {
            if (s1.charAt(i) != ' ' && s1.charAt(i - 1) == ' ') {
                indices.add(i);
            }
            if (s1.charAt(i) == ' ' && s1.charAt(i - 1) != ' ') {
                indices.add(i);
            }
        }
        if (s1.charAt(0) != ' ') {

            palabrasE.add(s1.substring(0, indices.get(0)));
            indices.remove(0);
        }

        if(indices.size()>0) {
            for (int i = 0; i <= indices.size(); i += 2) {
                if (i == indices.size() - 1) break;
                palabrasE.add(s1.substring(indices.get(i), indices.get(i + 1)));
                if (i == indices.size() - 2) break;
            }
            palabrasE.add(s1.substring(indices.get(indices.size() - 1)));
        }
        return palabrasE;
    }

    public static String obtenerPalabra(String cadena,int n){
        List<String> palabras = contarPalabras(cadena);
        System.out.println(palabras);
        if(n>palabras.size() || n<1){return null;}
        return palabras.get(n-1);
    }
    private static void prueba (String s1, int n,String esperado){
        String resultado = obtenerPalabra(s1, n);
        System.out.format("Prueba con %s y %s: ", s1, n);
        System.out.println(resultado);
        assert resultado != null;
        if (resultado.equals(esperado))
            System.out.println("ok");
        else
            System.out.println("error");
    }
}

