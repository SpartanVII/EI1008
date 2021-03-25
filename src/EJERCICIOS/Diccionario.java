package EJERCICIOS;

public class Diccionario {

    private static class Nodo{
        String cadena;
        int cantidad;
        Nodo sig;
        Nodo ant;

        public Nodo(String cadena,int cantidad,Nodo sig,Nodo ant){
            this.cadena=cadena;
            this.cantidad=cantidad;
            this.sig=sig;
            this.ant=ant;
        }
    }

    private Nodo primero=null;


}
