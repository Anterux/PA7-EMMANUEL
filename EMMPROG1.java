/*    Emmanuel Lopez villatoro    23700162     4/11/20023
Escribe un programa que almacene 20 números enteros en un arreglo. El programa debe ser capaz
de pasar todos los números pares a las primeras posiciones del arreglo (del 0 en adelante) y todos
los números impares a las celdas restantes. Utiliza arreglos auxiliares si es necesario.
 */

// sacar lo numeros pares e impares con un  if y dejandoklo en otro vector
package PA7EMMANUEL;

import java.util.Scanner;

/**
 *
 * @author ANTERUX
 */
public class EMMPROG1 {
    public static void main(String[] args){
        Scanner atx= new Scanner (System.in);
        int t=5;
        int v1[]=new int[t];
        int par[]=new int [t];
        int inp[]= new int [t];
        int res[]=new int [t];       
        
        for (int i = 0; i < t ; i++) {
            v1[i]=0;
            par[i]=0;
            inp[i]=0;
            res[i]=0;
        }
        
        for (int i = 0; i < t; i++) {
            System.out.print("ingresa los valores del vector "+(i+1)+":");
            v1[i]=atx.nextInt();
        }
        int contp=0;
        int conim=0;
        for (int i = 0; i < v1.length; i++) {
            if (v1[i]%2==0) {
                par[contp]=v1[i];
                contp++;
            }else{
                inp[conim]=v1[i];
                conim++;
            }
        }
        res=par;
        for (int i = contp; i < res.length; i++) {
         res[i]=inp[i-contp];   
        }
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
            
        }
    }
}
