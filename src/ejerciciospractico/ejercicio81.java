/*
Escribir un programa que pida un número entero y determine si es múltiplo de 2 y de 5.  
 */
package ejerciciospractico;

import java.util.Scanner;

/**
 *
 * @author Otniel
 */
class ejercicio81 {
    int m,sd,sc;
    public void multi(){
        Scanner in = new Scanner (System.in);
        System.out.print("DIGITE UN NUMERO: ");
        m= in.nextInt();
        sd= m%2;
        sc= m%5;
        if(sd==0){
            System.out.println("El numero "+ m + " es multiplo de 2");
        }
        if(sc==0){
            System.out.println("El numero "+ m + " es multiplo de 5");
        }
    }
}
