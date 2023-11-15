/*     EMMANUEL LOPEZ VILLATORO  23700162       4/11/2023
 Escribe un programa que lea 15 números por teclado y que los almacene en un arreglo. Rota los
elementos de ese arreglo, es decir, el elemento de la posición 0 debe pasar a la posición 1, el de la
1 a la 2, etc. El número que se encuentra en la última posición debe pasar a la posición 0.
Finalmente, mostrar el arreglo original y el arreglo rotado.
 */
package PA7EMMANUEL;

import java.util.Scanner;

/**
 *
 * @author ANTERUX
 */
public class EMMPROG2 {

    public static void main(String[] args) {
        Scanner atx = new Scanner(System.in);

        // declaracion de los vectores
        int N = 15;
        int[] v1 = new int[N];
        int vi, vu;

        //limpiar los vectores e igualarlos a 0
        for (int i = 0; i < N; i++) {
            v1[i] = 0;
        }

        //llenado de vectores
        for (int i = 0; i < N; i++) {
            System.out.print("ingresa el numero " + (i + 1) + ":");//    :(
            v1[i] = atx.nextInt();
        }
        
         System.out.println("\n---------vector original------------\n");
        for (int i = 0; i < N; i++) {
        System.out.print(v1[i]+",");
        }
        
        vi = v1[0];//guardamos el primer digito
        vu = v1[N - 1]; //guardamos el ultimo digito del vector

        for (int i = N - 2; i > 0; i--) { // avanzar una posicion 
            v1[i + 1] = v1[i];
        }
        
        //establecer los valores en su respectiva posicion en el vector
        v1[0] = vu;//se declara la posicion 0 el numero guardado en vu
        v1[1] = vi;//se declara la posicion 1
        
        //imprecion del vector
        System.out.println("\n--------vector rotado---------------\n");
        for (int i = 0; i < N; i++) {
            System.out.print(v1[i] + ",");
        }

    }
}
