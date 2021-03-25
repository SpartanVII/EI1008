package PRACTICA2;

public class lala{

    public static void main (String args[]){
        LineaPoligonal prueba= new LineaPoligonal();
        LineaPoligonal prueba2= new LineaPoligonal();
        prueba.añadir(new Punto(1,0));
        prueba.añadir(new Punto(2,0.5));
        prueba.añadir(new Punto(1,1));
        prueba2.añadir(new Punto(0.5,2));
        prueba2.añadir(new Punto(1,1));
        System.out.println(prueba.unir(prueba2).toString());
    }
}
