package Practica02;

public class Agenda {
    private Tarea []vector=new Tarea[0];

    public Agenda(){
         Tarea[]vector=new Tarea[10];
    }

    public void añadir(Tarea tarea) {
        if (vector.length==0){
            Tarea[] aux = new Tarea[1];
            aux[0]=tarea;
            vector=aux;
        }
        else{
            int numTareas=0;
            for (int i=0;i<vector.length;i++){
                if (vector[i]!=null){
                    numTareas+=1;
                }
            }
            if (numTareas==vector.length){
                Tarea[] aux=new Tarea[vector.length*2];
                for (int i=0; i<vector.length;i++){
                    aux[i]=vector[i];
                    vector=aux;
                }
            }
            int posLimite=0;
            for(int i=1;i<vector.length;i++){
                if(vector[i]!=null && tarea.getFecha().compareTo(vector[i-1].getFecha())>=0 && tarea.getFecha().compareTo(vector[i].getFecha())<0){
                    posLimite=i;
                }
            }
            for (int i=posLimite+1;i<vector.length;i++){
                vector[i]=vector[i-1];
            }
            vector[posLimite]=tarea;
            }
        }


    public int cantidad(){
        return vector.length;
    }

    public Tarea[] consultar(Fecha fecha){
        int numTareas=0;
        for (int i=0; i<vector.length;i++){
            if (vector[i].getFecha()==fecha){
                numTareas+=1;
            }
        }
        Tarea[] vecConsultar= new Tarea[numTareas];
        int t=0;
        for (int i=0; i<vector.length;i++){
            if (vector[i].getFecha()==fecha){
                vecConsultar[t]=vector[i];
                t+=1;
            }
        }
        return vecConsultar;
    }

    public void borrarPasadas(Fecha fecha){
        if(vector.length>0){
        for (int i=0; i<vector.length;i++){
            if (vector[i]!=null && vector[i].getFecha().compareTo(fecha)<0){
                vector[i]=null;
            }
            }
        }
    }

    void borrar(){
        borrarPasadas(Fecha.hoy());
    }

    public String toString(){
        String cadTareas="";
        for (int i=0; i<vector.length;i++){
            cadTareas+=vector[i]+"\n";
        }
        return cadTareas;
    }
}
