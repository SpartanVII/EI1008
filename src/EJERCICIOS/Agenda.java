package EJERCICIOS;

/*public class Agenda {
    private Tarea[] vector=new Tarea[0];

    public Agenda(){
        Tarea[] vector=new Tarea[0];
    }

    private int posiciónInserción(Tarea tarea){
        if (vector.length==0){
            return 0;
        }
        else{
            int numtareas=0;
            for(int i=0;i<vector.length;i++){
                if(vector[i]!=null){
                    numtareas+=1;
                }
            }
            if (numtareas==vector.length){
                Tarea[] aux=new Tarea[vector.length*2];
                for(int i=0;i<vector.length;i++){
                    aux[i]=vector[i];
                    vector=aux;
                }
            }
            int posicion=0;
            for (int i=0; i<vector.length;i++){
                if(vector[i]!=null && tarea.getFecha().compareTo(vector[i-1].getFecha())>=0 && tarea.getFecha().compareTo(vector[i].getFecha())<0){
                    posicion=i;
                }
            }
            return posicion;
        }
    }

    public void añadir(Tarea tarea){
        Tarea[] aux=new Tarea[vector.length];
        for (int i=0,j=0;i<vector.length;i++){
            if (vector[i].equals(posiciónInserción(tarea))){
                aux[j]=tarea;
                j++;
            }
            else{
                aux[j]=vector[i];
                j++;
            }
        }
        vector[posLimite]=tarea;
    }
}
*/