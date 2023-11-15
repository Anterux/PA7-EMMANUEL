/*
Hacer un programa que almacene en una matriz M (30,5) la información sobre las calificaciones de
las 3 unidades de la materia de PROGRAMACIÓN. El programa debe imprimir:
a) Cantidad de alumnos que aprobaron la materia (70 es la calificación mínima aprobatoria).
b) Cantidad de alumnos que tienen derecho a segunda oportunidad (quien tenga 2 o más unidades
reprobadas NO tiene derecho a segunda oportunidad).
c) El número o números de lista de estudiante o estudiantes que hayan obtenido el máximo
promedio.
 */
package PA7EMMANUEL;

import java.util.Scanner;

/**
 *
 * @author ANTERUX
 */
public class EMMPROG4 {
    public static void main(String [] args){
        Scanner atx= new Scanner(System.in);
         //declaracion de matriz
        int ren=30,col=5; 
        int [][] m1= new int[ren][col];
        
        for (int ren = 0; ren < 10; ren++) {
            for (int col= 0; col < 2; col++) {
                int m1[ren][col]=0;
            }
    
        }
        
    }
    
}
