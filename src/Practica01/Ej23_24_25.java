package Practica01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ej23_24_25 {
    public static void main(String[] args) throws FileNotFoundException {
        String[] equipos = {"Atlético_Madrid", "Real_Betis_F","Sporting_Huelva"};
        String nombreFichero = "src/Practica01/resultados";
        char matriz[][]=crearMatrizResultados(equipos, nombreFichero);
        System.out.println("El lider la clasificación es el "+obtenerLider(equipos,matriz));
        System.out.println("El número de equipos que no han sido derrotados en casa es: "+sinDerrotasEnCasa(matriz)+"\n");
        //Muestra la matriz por pantalla
        for (int x=0; x < matriz.length; x++) {
            System.out.print("|");
            for (int y=0; y < matriz[x].length; y++) {
                System.out.print (matriz[x][y]);
                if (y!=matriz[x].length-1) System.out.print("\t");
            }
            System.out.println("|");
        }

    }

    private static char[][] crearMatrizResultados(String[] vector, String nombreFichero) throws FileNotFoundException {
        //Creamos la matriz con el valor '-' como predeterminado
        char[][] matriz = new char[vector.length][vector.length];
        for (int i=0;i<matriz.length;i++){
            for(int z=0;z<matriz.length;z++) {
                matriz[i][z]='-';
            }
        }
        Scanner entrada = new Scanner(new File(nombreFichero));

        while (entrada.hasNextLine()) {
            int x=-1;
            int y=-1;
            String equipoLocal = entrada.next();
            int golesLocal = entrada.nextInt();
            String equipoVisitante = entrada.next();
            int golesVisitante = entrada.nextInt();

            //Bucle para saber en qué posición de la matriz almacenar el resultado
            for (int j = 0; j< vector.length; j++) {
                if (equipoLocal.equals(vector[j])) {
                     x = j;
                }
                else if (equipoVisitante.equals(vector[j])){
                     y = j;
                }
            }
            matriz[x][y]=(golesLocal>golesVisitante?'1':(golesVisitante>golesLocal?'2':'X'));
        }
            entrada.close();
            return matriz;
    }

    public static int sinDerrotasEnCasa(char[][] matriz){
        int sinDerrotas=matriz.length;
        for (char[] fila : matriz) {
            for (char y : fila) {
                if (y == '2') {
                    sinDerrotas--;
                    break;
                }
            }
        }
        return sinDerrotas;
    }

    private static String obtenerLider(String[] vector,char[][] matriz){
        String lider="";
        int puntosLider=-1;
        int[] puntos = new int[vector.length];

        for (int x=0; x < matriz.length; x++) {
            for (int y=0; y < matriz[x].length; y++) {
                if(matriz[x][y]=='1') puntos[x]+=3;
                if(matriz[x][y]=='X'){puntos[x]+=1;puntos[y]+=1;}
                if(matriz[x][y]=='2') puntos[y]+=3;
            }
        }
        for(int i=0;i<puntos.length;i++){
            if(puntos[i]>puntosLider){
                lider=vector[i];
                puntosLider=puntos[i];
            }
        }
        return lider;
    }
}






