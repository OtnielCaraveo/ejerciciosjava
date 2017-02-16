/*
Escribir un programa que pida un número e imprima por pantalla su tabla de sumar. 
Por ejemplo si el número fuera el 3 la tabla deberia ser
 */
package ejerciciospractico;

import java.util.Scanner;

/**
 *
 * @author Otniel
 */
class ejercicio50 {
    int x;
    int y;
    int[][] suma;
    public void tabla(){
    
        Scanner teclado=new Scanner(System.in);
        System.out.print("¿Sumar tabla de #?:");
        x=teclado.nextInt();
        x=x+1;
        y=x;
        suma =new int[x][y];  
        System.out.print("+ ");
        for(int x=0; x < suma.length; x++) {
            System.out.print(x+ " ");
            for (int y=0; y < suma[x].length; y++) {
            }
            }
        System.out.println("");
        for(int x=0; x < suma.length; x++) {
            System.out.print(x+ " ");
            for (int y=0; y < suma[x].length; y++) {
                suma[x][y]=(int)(x+y);
                System.out.print(suma[x][y]+" ");
        }
            System.out.println("");
    }
    }
    
}
