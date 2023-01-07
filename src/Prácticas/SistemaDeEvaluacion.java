package Prácticas;

import java.util.Scanner;

public class SistemaDeEvaluacion {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Escribe el numero de alumnos: ");
        int numAlum = scan.nextInt();

        int array[] = new int[numAlum];
        
        pedir(array);
    }

    public static void pedir(int array[]) {
        String name;
        double cali;
        int tareas, asistencia;

        for (int i = 0; i < array.length; i++) {
            
            System.out.print("Ingresa el nombre del alumno " + (i+1)+":");
            name = scan.next();
            System.out.print("Ingresa la calificacion de "+ name+" :");
            cali = scan.nextDouble();
           do {
              
              System.out.println("Cuantas asistencias de "+ name +" (1-10)");
            asistencia = scan.nextInt();
              
          }while (asistencia<0||asistencia>10);
           do {
               System.out.println("Cuantas tareas entrego "+ name + "?" );
               tareas = scan.nextInt();
           } while(tareas<0||tareas>5);     
        }
        
    }
}