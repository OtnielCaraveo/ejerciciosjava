/*
Escribir un programa que lea tres números y los guarde en un vector. 
A continuación los ordenará y guardará los valores ordenados en otro vector.
Finalmente sacará ambas listas de números por la pantalla
 */
package ejerciciospractico;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Otniel
 */
class ejercicio47 {
    
 
    int[] orden= new int[3];
    
    public void tres(){
        for( int i=0; i<orden.length; i++){
            Scanner in = new Scanner(System.in);
        System.out.println("Digite valor "+ i);
        orden[i]=in.nextInt();
//        orden[i]=(int)(Math.random()*9+1);
        }
        for( int i=0; i<orden.length; i++){
         System.out.println("["+i+"]"+orden[i]);
        }
               System.out.println(" ");
    Arrays.sort(orden);
        for( int i=0; i<orden.length; i++){
         System.out.println("["+i+"]"+orden[i]);
        }

        
//</editor-fold>
    
    }
    
    }
