/*
Realizar un algoritmo en el cual se obtenga la siguiente información 2*A + 2*B 
 */
package ejerciciospractico;

import java.util.Scanner;

/**
 *
 * @author Otniel
 */
class ejercicio18 {
    int a;
    int b;
    
    public void algo(){
        Scanner in = new Scanner (System.in);
        System.out.println("Ingrese numero A: ");
        a= in.nextInt();
        Scanner on = new Scanner (System.in);
        System.out.println("Ingrese numero B: ");
        b= on.nextInt();
        System.out.println(" 2*A + 2*B = "+((2*a)+(2*b)));
    }
}
