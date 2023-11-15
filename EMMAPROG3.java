/*    EMMANUEL LOPEZ VILLATORO    23700162     4/11/2023
Hacer un programa que gestione las calificaciones de los estudiantes de Secundaria en la materia
de Matemáticas. Almacenar en vectores el Número de lista, Nombre del estudiante, calificación de
la unidad 1, calificación de la unidad 2, calificación de la unidad 3, y Promedio final (calculado). La
calificación en cada unidad debe ser entre 0 y 10, el promedio mínimo aprobatorio es 6. El programa
debe controlar que el usuario ingrese una calificación valida (entre 0 y 10). Determinar:
a) Cuántos estudiantes Reprobaron.
b) Cuántos estudiantes Aprobaron.
c) El número de lista, nombre y promedio del estudiante que obtuvo el promedio más Bajo
d) El número de lista, nombre y promedio del estudiante que obtuvo el promedio más Alto
 */
package PA7EMMANUEL;

import java.util.Scanner;

/**
 *
 * @author ANTERUX
 */
public class EMMAPROG3 {
    public static void main (String[] args){
        Scanner atx=new Scanner(System.in);
        //declacion de variables :)
        int E,apro=0,repro=0;
        //declaracion de variables para almacenar mayor y menor promedio
        int mayo=Integer.MIN_VALUE,meno=Integer.MAX_VALUE;
        //declaracion para saber la posicion de un dato del vector
        int almay=-1,almen=-1;
        
        //pedir el # de estudiantes para tener el tamaño del vector
        System.out.print("ingresa el numero de estudiantes de la materia: "); 
        E =atx.nextInt();
        
        //declaracion del vector
        int [] nl = new int [E];//numero de lista *
        String [] ne = new String[E];//nombre del estudiante*
        int [] c1 = new int [E];//calificacion de la unidad 1
        int [] c2 = new int [E];//calificacion de la unidad 2
        int [] c3 = new int [E];//calificacion de la unidad 3
        int [] cf = new int [E];//calificacion final
        
        //limpiar vectores
        for (int i = 0; i < E; i++) {
            nl[i]=0;
            c1[i]=0;
            c2[i]=0;
            c3[i]=0;
            cf[i]=0;
        }
        //solicitamos nombre 
        for (int i = 0; i < E; i++) {
            System.out.println("ingresa tu nombre");
            ne[i]=atx.next();
         //solicita numero de lista de cada alumno
           do {        
             System.out.println("ingresa el numero de lista: ");
             nl[i]=atx.nextInt();
                if (nl[i]>E || nl[i]==0 ) {
                   System.out.println("digito no valido");
                }   
            } while (nl[i]==0|| nl[i]>E); 
        
            do {
                System.out.println("NL:"+nl[i]+"-.Ingresa la calificacion de la primera unidad de "+ne[i]);
                c1[i]=atx.nextInt();
                if (c1[i]==0 || c1[i]>10) {
                    System.out.println("Calificacion no valida ");
                }
            } while (c1[i]==0 || c1[i]>10);
            
            do{
                System.out.println("NL:"+nl[i]+"-.Ingresa la calificacion de la segunda unidad de "+ne[i]);
                c2[i]=atx.nextInt();
                if (c2[i]==0 || c2[i]>10) {
                    System.out.println("Calificacion no valida ");
                }
            }while (c2[i]<-1 || c2[i]>10);
            
           do{
                System.out.println("NL:"+nl[i]+"-.Ingresa la calificacion de la tercera unidad de "+ne[i]);
                c3[i]=atx.nextInt();
                if (c3[i]==0 || c3[i]>10) {
                    System.out.println("Calificacion no valida ");
                }              
            } while (c3[i]==0 || c3[i]>10);

           cf[i]=(c1[i]+c2[i]+c3[i])/3;
            if (cf[i]>=6) {
              apro++;
            }else
                repro++;
            
            if(cf[i]>mayo){
                mayo=cf[i];
                almay=i;
            }
            if(cf[i]< meno){
                meno=cf[i];
                almen=i;
            }  
         }

        System.out.println("reprobados: "+repro);
        System.out.println("aprovados: "+apro);
        System.out.println("el estudiante "+ne[almen]+"numero de lista: "+nl[almen]+" que obtuvo el promedio más Bajo de: " +meno);
        System.out.println("el estudiante "+ne[almay]+" que obtuvo el promedio más alto: "+nl[almay]+""+mayo);
    }
    
    
}
