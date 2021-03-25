package EJERCICIOS;
/*
public class Examen {

    public int borrarFechas(fechas[] fecha){
        Nodo actual = primero;
        Nodo anterior = null;
        int contador = 0;
        while (actual!=null){
            for (int i=0; i<fecha.length;i++){
                if (actual.fechaGasto.equals(fecha[i])){
                    if(actual==primero){
                        primero=actual.siguiente;
                        contador++;
                        break;
                    }
                    else if(actual.siguiente==null){
                        anterior.siguiente=null;
                        contador++;
                        break;
                    }
                    else{
                        anterior.siguiente = actual.siguiente;
                        contador++;
                        break;
                    }
                }
            }
            anterior=actual;
            actual=actual.siguiente;
        }
        return contador;
    }





    public int getStock(String descripcion){
        int inicio = 0;
        int fin = n;
        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;
            if (v[medio].getDescripción().compareTo(descripcion)<0){
                inicio = medio + 1;}
            else if (v[medio].getDescripcion().compareTo(descripcion)>0){
                fin = medio - 1;}
            else{
                return v[medio].getCantidad();}
        }
        return -1;
    }


    public Fecha[] getFecha(String persona){
        int contador=0;
        for(int i=0;i<reservas.length;i++){
            if (reservas[i].getPersona().compareTo(persona)==0){
                contador++;
            }
        }
        Fecha[] fechas=new Fecha[contador];
        int j=0;
        for(int x=0;x<reservas.length;x++){
            if (reservas[x].getPersona().compareTo(persona)==0){
                fechas[j]=reservas[x].getFecha();
                j++;
            }
        }
        return fechas;
    }





    public boolean añadir(Pelicula pelicula,int cantidad){
        if(primero==null){
            Nodo primero=new Nodo(pelicula,cantidad,null);
            return true;
        }
        for(Nodo aux=primero;aux!=null;aux=aux.siguiente){
            if(aux.pelicula.equals(pelicula)){
                aux.vecesProyectada+=cantidad;
                return false;
            }
            if(aux.siguiente==null){
                Nodo nuevo= new Nodo(pelicula,cantidad,null);
                aux.siguiente=nuevo;
                return true;
            }
        }

    }




*/



