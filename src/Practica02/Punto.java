package Practica02;
import java.util.Locale;

public class Punto {
    private double x;
    private double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Punto() {
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Punto desplazar(double desplazamientoX, double desplazamientoY) {
        double otraX = x + desplazamientoX;
        double otraY = y + desplazamientoY;
        return  new Punto(otraX, otraY);
    }

    public double distancia(Punto otroPunto) {
        return Math.sqrt(Math.pow(otroPunto.x - this.x, 2) + Math.pow(otroPunto.y - this.y, 2));
    }

    public String toString() {
        return String.format(Locale.US, "( %.2f, %.2f)", x, y);
    }

    public boolean equals(Object otroObjeto) {
        if (this == otroObjeto) {
            return true;
        }
        if (!(otroObjeto instanceof Punto)) {
            return false;
        }
        Punto otroPunto = (Punto) otroObjeto;
        return x == otroPunto.x && y == otroPunto.y;

    }

}








