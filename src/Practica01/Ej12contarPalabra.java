package Practica01;

public class Ej12contarPalabra {
    public static void main(String[] args) {
        prueba("hola juan", 2);
        prueba("hola", 1);
        prueba("   no se que hacer  ", 4);
        prueba(" jajaja lol xd   ", 3);
        prueba(" ", 0);
        prueba("   ", 0);
    }

    private static int contarPalabras(String s1) {
        int palabras = 0;
        for (int i = 1; i < s1.length(); i++) {
            if (s1.charAt(i) != ' ' && s1.charAt(i - 1) == ' ') {
                palabras++;
            }
        }
        if (s1.charAt(0) != ' ') palabras++;

        return palabras;
    }


    private static void prueba (String s1,int esperado){
        int resultado = contarPalabras(s1);
        System.out.format("Prueba con %s: ", s1);
        if (resultado == esperado) System.out.println("ok");
        else System.out.println("error");
    }
}
