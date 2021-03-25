package EJERCICIOS;

import java.util.Calendar;

public class Fecha {
    private int dia;
    private int mes;
    private int año;

    public Fecha(int elDía, int elMes, int elAño) {
        this.dia = elDía;
        this.mes = elMes;
        this.año = elAño;
    }

    public Fecha(Fecha otraFecha){
       otraFecha.dia = dia;
       otraFecha.mes = mes;
       otraFecha.año = año;
    }

    public String toString() {
        return dia + "/" + mes + "/" + año;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Fecha))
            return false;
        Fecha otraFecha = (Fecha) obj;
        return dia == otraFecha.dia &&
                mes == otraFecha.mes &&
                año == otraFecha.año;
    }

    public int getDía() {
        return dia;
    }
    public int getMes() {
        return mes;
    }
    public int getAño() {
        return año;
    }

    public int compareTo(Fecha otraFecha){
        if (otraFecha.año==año && otraFecha.mes==mes && otraFecha.dia==dia){
            return 0;}
        else if (año<otraFecha.año) {
            return -1;}
        else if (año==otraFecha.año && mes<otraFecha.mes) {
            return -1;}
        else if (año==otraFecha.año && mes==otraFecha.mes && dia<otraFecha.dia){
            return -1;}
        else {
            return 1;}
    }

    public boolean añoBisiesto(int año){
        if (año%400==0){
           return true;
        }
        return false;
    }

    public int díasMes(int mes, int año){
        int dias;
        if (mes == 1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12){
            return dias=31;
        } else if (mes==2 && año%400==0){
            return dias=29;
        } else if (mes==2 && año%400!=0){
        return dias=28;
        }else{return dias=30;}
    }

    public static Fecha hoy(){
        Calendar calendario = Calendar.getInstance();
        int dia = calendario.get(Calendar.DAY_OF_MONTH);
        int mes = calendario.get(Calendar.MONTH) + 1;
        int año = calendario.get(Calendar.YEAR);
        return new Fecha(dia, mes, año);
    }

    public Fecha díaSiguiente(){
        if (this.dia==díasMes(mes, año) && mes!=12) {
            int Día = 1;
            int Mes = this.mes + 1;
            int Año = this.año;
            return new Fecha(Día, Mes, Año);
        }
        else if(this.dia==díasMes(mes, año) && mes==12) {
            int Día = 1;
            int Mes = 1;
            int Año = this.año + 1;
            return new Fecha(Día, Mes, Año);
        }
        else {
            int Día = this.dia+1;
            int Mes = this.mes;
            int Año = this.año;
            return new Fecha(Día,Mes,Año);
}}}


