package Practica01;

public class Ej11EsSufijo {
    public static void main(String[] args) {
        prueba("hola", "ola", true);
        prueba("hola", "osa", false);
        prueba("hola", "hola", true);
        prueba("hola", "", true);
        prueba("hola", "holaa", false);
    }

    private static boolean esSufijo(String s1, String s2) {
        if (s1.length() >= s2.length()) {
            for (int i1 = s1.length() - 1, i2 = s2.length() - 1; i2 >= 0; i1--, i2--) {
                if (s1.charAt(i1) != s2.charAt(i2)) {
                    return false;
                }
            }
            return true;
        }

        return false;
    }

    private static void prueba (String s1, String s2,boolean esperado){
        boolean resultado = esSufijo(s1, s2);
        System.out.format("Prueba con %s y %s: ", s1, s2);
        if (resultado == esperado) System.out.println("ok");
        else System.out.println("error");
    }
}
