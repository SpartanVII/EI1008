package Practica02;

public class Tarea {
    private Fecha fecha;
    private String descripción;

    public Tarea(Fecha fecha,String descripción){
        this.fecha=fecha;
        this.descripción=descripción;
    }

    public Fecha getFecha(){
        return this.fecha;
    }
    public String getDescripción(){
        return this.descripción;
    }

    public String toString(){
        return this.fecha +": " + this.descripción;
    }
}
