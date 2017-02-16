/*
Escribir un programa que pida una calificación e imprima “Apto” o “No Apto”
según si la calificación es mayor o menor que 5 respectivamente.  
 */
package ejerciciospractico;

import java.util.Scanner;

/**
 *
 * @author Otniel
 */
class ejercicio78 {
    int cal;
    public void apto(){
        Scanner in = new Scanner (System.in);
        System.out.print("CALIFICACION :");
        cal= in.nextInt();
        if(cal>5){
            System.out.println("--->APTO.");
        }
        else{
            System.out.println("NO APTO:<---");
        }
    }
}
