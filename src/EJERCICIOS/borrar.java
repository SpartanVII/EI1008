package EJERCICIOS;

public class borrar {

    //BORRAR EN UNA POSICION NODOS

    /* public String remove(int i){
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
    }*/




    //BORRAR UNA PALABRA EN TODOS LOS NODOS

    /*public boolean remove(String s){
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
    }*/




    //BORRAR EN UNA POSICION VECTORES

    /*public void quitar(int posicion){
        if(posicion>-1 && posicion<puntos) {
            for(int i=posicion;i<puntos;i++ ){
                if(i==puntos-1){
                    vector[i]=null;
                    break;
                }
                vector[i]=vector[i+1];
            }
            puntos--;
        }
    }*/




    //BORRAR UN PUNTO USANDO METODO ANT VECTORES

    /*    public void quitar(Punto punto){
        for(int i = 0;i<puntos;i++){
            if(vector[i].equals(punto)){
                quitar(i);
                break;
            }
        }
    }*/

}
