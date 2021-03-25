package EJERCICIOS;

public class ListaCadenasEnlaceSimple {

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

    public boolean add(String s){
        if(primero==null){
            primero=new Nodo(s,null);
        }
        else{
            Nodo aux=primero;
            for(int i=0;i<talla-1;i++){
                aux=aux.sig;
            }
            Nodo nuevo=new Nodo(s,null);
            aux.sig=nuevo;
        }
        talla++;
        return true;
    }
    public void add(int i,String s){
        if(i<0 || i>=talla){
            throw new IndexOutOfBoundsException();
        }
        if(i==0){
            primero=new Nodo(s,primero);
        }
        else{
            Nodo aux=primero;
            for(int x=0;x<i-1;x++){
                aux=aux.sig;
            }
            Nodo nuevo=new Nodo(s,aux.sig);
            aux.sig=nuevo;

        }
        talla++;
    }

    public void clear(){
        primero=null;
        talla=0;
    }

    public String get(int i){
        if(i<0 || i>=talla){
            throw new IndexOutOfBoundsException();
        }
        else{
            Nodo aux=primero;
            for (int x=0;x<i-1;x++){
                aux=aux.sig;
            }
            return aux.sig.dato;
        }
    }

    public int indexOf(String s){
        int contador=-1;
        for(Nodo aux=primero;aux!=null;aux=aux.sig){
            contador++;
            if(aux.dato.equals(s)){
                return contador;
            }
        }
        return -1;
    }

    public int lastIndexOf(String s){
        int contador=-1;
        int posf=0;
        for(Nodo aux=primero;aux!=null;aux=aux.sig){
            contador++;
            if(aux.dato.equals(s)){
                posf=contador;
            }
        }
        return contador;
    }

    public boolean isEmpty(){
        if(primero==null){
            return true;
        }
        else{
            return false;
        }
    }

    public String remove(int i){
        if(i<0 || i>=talla){
            throw new IndexOutOfBoundsException();
        }
        if(i==0){
            String borrado=primero.dato;
            primero=primero.sig;
            talla--;
            return borrado;
        }
        else{
            Nodo aux=primero;
            for(int x=0;x<i-1;x++){
                aux=aux.sig;
            }
            String borrado=aux.sig.dato;
            aux.sig=aux.sig.sig;
            talla--;
            return borrado;
        }
    }
    public boolean remove(String s){
        Nodo anterior=null;
        Nodo actual=primero;

        while(actual!=null){
            if(actual.dato.equals(s)){
                if(anterior!=null){
                    anterior.sig=actual.sig;
                }
                else{
                    primero=actual.sig;
                }
                talla--;
                return true;
            }
            else{
                anterior=actual;
                actual=actual.sig;
            }
        }
        return false;
    }

    public String set(int i,String s){
        if(i<0 || i>=talla){
            throw new IndexOutOfBoundsException();
        }
        if (i == 0) {
            String nuevoDato=primero.dato;
            primero.dato=s;
            return nuevoDato;
        }
        else{
            Nodo aux=primero;
            for(int x=0;x<i-1;x++){
                aux=aux.sig;
            }
            String sustituido=aux.sig.dato;
            aux.sig.dato=s;
            return sustituido;
        }

    }

    public int size(){
        return talla;
    }

    public String toString(){
        Nodo aux=primero;
        String resultado="["+aux.dato;
        for(int i=1;i<talla;i++){
            aux=aux.sig;
            resultado+=","+aux.dato;
        }
        resultado+="]";
        return resultado;
    }



}
