package PRACTICA3;

public class Diccionario {
    private static class Nodo {
        String cadena;
        int cantidad;
        Nodo siguiente;
        Nodo anterior;

        public Nodo(String cadena, int cantidad, Nodo siguiente, Nodo anterior) {
            this.cadena = cadena;
            this.cantidad = cantidad;
            this.siguiente = siguiente;
            this.anterior = anterior;
        }
    }

    private Nodo primero = null;

    void añadir(String unaCadena, int unaCantidad) {
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
    }

    public String cadenaConMayorCantidad(){
        if(primero == null) return "No hay resultado";
        else{
            String cadenam = null;
            int m = -1;

            for(Nodo aux = primero; aux != null; aux = aux.siguiente){
                if(aux.cantidad >= m){
                    cadenam = aux.cadena;
                    m = aux.cantidad;

                }
            }
            return cadenam;
        }
    }

    public int cantidad(String unaCadena){
        if(primero == null)
            return 0;

        else{
            for(Nodo aux = primero; aux != null; aux = aux.siguiente){
                if(aux.cadena.compareTo(unaCadena) == 0) return aux.cantidad;
            }
        }
        return 0;
    }

    public String toString() {
        String pantalla = "{ " + primero.cadena+"-->"+primero.cantidad;;

        for (Nodo aux = primero.siguiente; aux != null; aux = aux.siguiente) {
            pantalla += ", " + aux.cadena+"-->"+aux.cantidad;;
        }

        return pantalla + "}";
    }

}

