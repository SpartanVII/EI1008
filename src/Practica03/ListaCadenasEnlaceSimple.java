package Practica03;

public class ListaCadenasEnlaceSimple implements ListaCadenas{

    private static class Nodo {
        String dato;
        Nodo sig;

        Nodo(String dato, Nodo sig) {
            this.dato = dato;
            this.sig = sig;
        }
    }

    private Nodo primero;
    private int talla;

    public boolean add(String s) {
        if (primero == null) {
            primero = new Nodo(s, primero);
        } else {
            Nodo anterior = primero;
            for (int i = 0; i < talla - 1; i++) {
                anterior = anterior.sig;
            }
            Nodo nuevo = new Nodo(s, anterior.sig);
            anterior.sig = nuevo;
        }
        talla++;
        return true;
    }

    public void add(int i,String s){
        if (i < 0 || i> talla) {
            throw new IndexOutOfBoundsException();
        }
        if (i == 0) {
            primero = new Nodo(s, primero);
        } else {
            Nodo anterior = primero;
            for (int t = 0; t < i - 1; t++){
                anterior = anterior.sig;
            }
            Nodo nuevo = new Nodo(s, anterior.sig);
            anterior.sig=nuevo;
        }
        talla++;
    }

    public void clear(){
        primero = null;
        talla = 0;
    }

    public String get(int i){
        if (i < 0 || i>= talla) {
            throw new IndexOutOfBoundsException();
        }
        else {
            Nodo anterior = primero;
            for (int t = 0; t <= i - 1; t++){
                anterior = anterior.sig;
            }
            return anterior.dato;
        }
    }

    public int indexOf(String s){
        int contador=-1;
        for (Nodo aux = primero; aux != null; aux = aux.sig){
            contador++;
            if (aux.dato.equals(s)){
                return contador;
            }
        }
        return -1;
    }

    public int lastIndexOf(String s){
        int posDefinitva=-1;
        int contador=-1;
        for (Nodo aux = primero; aux != null; aux = aux.sig){
            contador++;
            if (aux.dato.equals(s)){
                posDefinitva=contador;
            }
        }
        return posDefinitva;
    }

    public boolean isEmpty(){
        if (primero==null){
            return true;
        }
        return false;
    }

    public String remove(int i){
        if (i< 0 || i >= talla) {
            throw new IndexOutOfBoundsException();
        }
        if (i == 0) {
            String nuevoDato=primero.dato;
            primero = primero.sig;
            talla--;
            return nuevoDato;
        } else {
            Nodo anterior = primero;
            for (int t = 0; t < i - 1; t++){
                anterior = anterior.sig;
            }
            String nuevoDato=anterior.dato;
            anterior.sig = anterior.sig.sig;
            talla--;
            return nuevoDato;
        }
    }

    public boolean remove(String s) {
        Nodo anterior = null;
        Nodo actual = primero;
        while (actual != null){
            if (actual.dato.equals(s)){
                if (anterior != null){
                    anterior.sig = actual.sig;
                }
                else{
                    primero = actual.sig;
                }
                talla--;
                return true;
            }
            else {
                anterior = actual;
                actual = actual.sig;
            }
        }
        return false;
    }



    public String set(int i, String s){
        if (i < 0 || i >= talla) {
            throw new IndexOutOfBoundsException();
        }
        if (i == 0) {
            String nuevoDato=primero.dato;
            primero.dato=s;
            return nuevoDato;
        } else {
            Nodo anterior = primero;
            for (int t = 0; t < i; t++) {
                anterior = anterior.sig;
            }
            String nuevoDato=anterior.dato;
            anterior.dato=s;
            return nuevoDato;
        }

    }

    public int size(){
        return talla;
    }

    public String toString() {
        if (isEmpty()) {
            return "[]";
        } else {
            String resultado = "[" + primero.dato;
            for (Nodo aux = primero.sig; aux != null; aux = aux.sig) {
                resultado += ", " + aux.dato;
            }
            return resultado + "]";
        }
    }


}
