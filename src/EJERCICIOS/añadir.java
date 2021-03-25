package EJERCICIOS;

import PRACTICA2.Punto;

public class añadir {




    //AÑADIR PUNTO EN VECTOR

    /*public void añadir(PRACTICA2.Punto punto){
        if(puntos==vector.length){
            PRACTICA2.Punto[] vectorx =new Punto[vector.length*2];
            for(int i=0;i<vector.length;i++){
                vectorx[i]=vector[i];
            }
            vector=vectorx;
        }
        vector[puntos]=punto;
        puntos++;
    }*/




    //AÑADIR EN LA POSICION I LA CADENA S EN NODOS

    /*public void add(int i,String s){
        if(i<0 || i>=talla){
            throw new IndexOutOfBoundsException();
        }
        if(i==0){
            primero=new ListaCadenasEnlaceSimple.Nodo(s,primero);
        }
        else{
            ListaCadenasEnlaceSimple.Nodo aux=primero;
            for(int x=0;x<i-1;x++){
                aux=aux.sig;
            }
            ListaCadenasEnlaceSimple.Nodo nuevo=new ListaCadenasEnlaceSimple.Nodo(s,aux.sig);
            aux.sig=nuevo;

        }
        talla++;
    }*/





    //AÑADIR UNA CADENA Y UNA CANTIDAD AL NODO

    /*void añadir(String unaCadena, int unaCantidad) {
        if (primero == null) {
            primero = new Nodo(unaCadena, unaCantidad, null, null);
        }

        else if (primero.siguiente == null && primero.cadena.compareTo(unaCadena) <= -1) {
            primero.siguiente=new Nodo(unaCadena, unaCantidad, null, primero);
        }

        else if (primero.cadena.compareTo(unaCadena) >= 1) {
            Nodo aux = primero;
            primero = new Nodo(unaCadena, unaCantidad, aux, null);
            aux.anterior = primero;
        }

        else {

            for(Nodo aux = primero; aux != null; aux = aux.siguiente){

                if (aux.cadena.compareTo(unaCadena) >= 1) {
                    Nodo nuevo = new Nodo(unaCadena, unaCantidad, aux, aux.anterior);
                    aux.anterior.siguiente = nuevo;
                    aux.anterior = nuevo;
                    break;
                }

                if(aux.cadena.compareTo(unaCadena) == 0){
                    aux.cantidad+=unaCantidad;
                    break;
                }

                if(aux.cadena.compareTo(unaCadena) <= -1 && aux.siguiente == null){
                    Nodo n = new Nodo(unaCadena,unaCantidad,null,aux);
                    aux.siguiente = n;
                }
            }
        }
    }*/
}
