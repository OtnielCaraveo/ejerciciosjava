/*
Escribir un programa que lea diez números, los guarde en un vector 
y a continuación los imprima en orden inverso al de su entrada
 */
package ejerciciospractico;

import java.util.Scanner;

/**
 *
 * @author Otniel
 */
class ejercicio46 {
    int d=1;
    int[] vector = new int[10];
    int n=0;
    int m;
    int p;    public void arre (){
    
        for(int i=9;i>=0;i--){
        Scanner in = new Scanner (System.in);
        System.out.println("Digite numero " +d+ " : ");
        m= in.nextInt();
        vector [n]= m;
        d=d+1;
        n=n+1;  
        }
        n=9;
        System.out.println("Los numero al orden inverso son: ");
        for(int i=9;i>=0;i--){
        System.out.println(vector[n]);
        n=n-1;  
        }
        
    }
    
}
