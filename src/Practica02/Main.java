package Practica02;

import Practica02.Fecha;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Probando la clase Tarea
        Tarea tarea1 = new Tarea(new Fecha(21, 11, 1924), "Programacion");
        Tarea tarea2 = new Tarea(new Fecha(3, 12, 1934), "Matematicas");
        Tarea tarea3 = new Tarea(new Fecha(3, 2, 1982), "Arquitectura");
        Tarea tarea4 = new Tarea(new Fecha(1, 4, 1954), "Fisica");
        Tarea tarea5 = tarea2;

        System.out.println(tarea1.getFecha() + " | " + tarea1.getDescripción() + " | " + tarea1.toString());
        System.out.println(tarea2.getFecha() + " | " + tarea2.getDescripción() + " | " + tarea2.toString());
        System.out.println(tarea3.getFecha() + " | " + tarea3.getDescripción() + " | " + tarea3.toString());
        System.out.println(tarea4.getFecha() + " | " + tarea4.getDescripción() + " | " + tarea4.toString());
        System.out.println(tarea5.getFecha() + " | " + tarea5.getDescripción() + " | " + tarea5.toString());


        //Probando la clase Agenda
        System.out.println("\n\t\t\t\t\t↑↑ Clase Tarea ↑↑\n----------------------------------------------------------\n\t\t\t\t\t↓↓ Clase Agenda ↓↓\n");
        Agenda agenda = new Agenda();
        agenda.añadir(tarea1);
        agenda.añadir(tarea2);
        agenda.añadir(tarea3);
        agenda.añadir(tarea4);
        agenda.añadir(tarea5);
        System.out.print(agenda.toString() + "\nCantidad de elementos: " + agenda.cantidad() + "\n\nConsulta:" + Arrays.toString(agenda.consultar(tarea2.getFecha())) + "\n\nConsulta:" + Arrays.toString(agenda.consultar(Fecha.hoy())) +"\n");
        agenda.borrarPasadas(tarea2.getFecha());
        System.out.println("\nSe han borrado todas excepto:(BorrarTodas) \n" + agenda);
        agenda.borrar();
        System.out.println("Se han borrado todas excepto:(Borrar) \n" + agenda);

        Agenda agendaVacia = new Agenda();
        agendaVacia.borrar();
        agendaVacia.borrarPasadas(new Fecha(2, 2, 2000));
    }
}
