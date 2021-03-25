package EJERCICIOS;

public class Tarea {
    private Fecha fecha;
    private String descripcion;

    public Tarea(Fecha fecha, String descripcion){
        this.fecha=fecha;
        this.descripcion=descripcion;
    }

    public Fecha getFecha(){
        return this.fecha;
    }

    public String getDescripcion(){
        return this.descripcion;
    }

    public String toStrting(){
        return (this.fecha+": "+this.descripcion);
    }

}

