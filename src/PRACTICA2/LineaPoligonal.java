package PRACTICA2;

import java.util.Locale;

public class LineaPoligonal {
    private int puntos=0;
    Punto[] vector =new Punto[8];


    public LineaPoligonal() {
    }

    public LineaPoligonal(Punto[] vector) {
        this.vector = vector;
    }

    public void añadir(Punto punto){
        if(puntos==vector.length){
            Punto[] vectorx =new Punto[vector.length*2];
            for(int i=0;i<vector.length;i++){
                vectorx[i]=vector[i];
            }
            vector=vectorx;
        }
        vector[puntos]=punto;
        puntos++;
    }

    public void quitar(int posicion){
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
    }

    public void quitar(Punto punto){
        for(int i = 0;i<puntos;i++){
            if(vector[i].equals(punto)){
                quitar(i);
                break;
            }
        }
    }

    public void trasladar(double desplazamientoX, double desplazamientoY){
        for(int i=0;i<puntos;i++){
            vector[i]=vector[i].desplazar(desplazamientoX,desplazamientoY);
        }
    }

    public double longitud(){
        double distancia=0;
        if(puntos>1){
            for(int i=0;i<puntos-1;i++){
                distancia+=vector[i].distancia(vector[i+1]);
            }
        }
        return distancia;
    }

    public String toString() {
        String cadena= "";
        for(int i= 0;i<puntos;i++){
            cadena+=vector[i].toString();
            if(i!=puntos-1){
                cadena+="--";
            }
        }
        return cadena;
    }

    public boolean equals(Object otroObjeto) {
        return this.toString().equals(otroObjeto.toString());
    }

    public LineaPoligonal unir(LineaPoligonal otraLinea){
        LineaPoligonal nueva= new LineaPoligonal();
        for(int i=0;i<this.vector.length;i++){
            nueva.añadir(otraLinea.vector[i]);
        }
        for(int i=0;i<otraLinea.vector.length;i++){
            nueva.añadir(otraLinea.vector[i]);
        }
        return nueva;
    }
}
