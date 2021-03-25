/*package EJERCICIOS;

public class examen2 {

    public Agenda getAsuntos(Fecha fecha){
        Agenda agendaNueva= new Agenda();
        for(Nodo aux = primero; aux != null; aux = aux.siguiente){
            if (aux.fecha.equals(fecha)){
                Nodo nodoNuevo= new Nodo(aux.asunto,aux.fecha,aux.siguiente);
                if(nueva.primero!=null){
                    for(Nodo aux2=nueva.primero;aux2!=null;aux2=aux2.siguiente){
                        if(aux.siguiente==null){
                            aux2.siguiente==nodoNuevo;

                        }
                    }
                }
                else{
                    agendaNueva.primero=nodoNuevo;
                }

            }

        }
        return agendaNueva;
    }



    public void simplificar(){
        Articulo[] vectorNuevo=new Articulo[n]
        for(int i=0;i<n;i++){
            if(v[i]==null){
                break;
            }
            else{
                for(j=0;j<vectorNuevo.length){
                    if(vectorNuevo[j]==null){
                        vectorNuevo[j]=v[i];
                        break;
                    }
                    else{
                        if(v[i].getCódigo().equals(vectorNuevo[j])){
                            vectorNuevo[j].incrementarCantidad(v[i].getCantidad);
                            break
                        }
                    }

                }
            }



            public int cantidadMedicamentosNoComunes(AlmacenMedicamentos otroAlmacén){
                int noComunes=0;
                int j=0;
                int i=0;
                 while(j<this.cantidad){
                    if(this.medicamentos[i].getIdentificador()compareTo(otroAlmacén.medicamentos[i].getIdentificador())==0){
                        j++;
                    }
                    else if (this.medicamentos[j].getIdentificador()compareTo(otrAlmaén.medicamentos[i].getIdentificador())>0){
                        i++;
                    }
                    else{
                        j++;
                        i++;
                    }
                }
                return noComunes;
            }

            public void borrarMásAntiguo(){
                Fecha masAntigua=primero.fecha;
                for(Nodo aux=primero;aux!=null;aux=aux.siguiente){
                    if(aux.fecha.compareTo(masAntigua)<0){
                        masAntigua=aux.fecha;
                    }
                }
                Nodo anterior=null;
                for(Nodo aux2=primero;aux2!=null;aux2=aux2.siguiente){
                    if(aux2.fecha.compareTo(masAntigua)==0){
                        if(aux2==primero){
                            primero=primero.siguiente;
                        }
                        else{
                            anterior.siguiente=aux2.siguiente;


                        }
                    }
                    anterior=aux2;
                }
            }

        }




    }



}
*/
