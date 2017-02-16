/*
32.	 Leer un numero y escribir el valor absoluto del mismo. 
 */
package ejerciciospractico;

import java.util.Scanner;

/**
 *
 * @author Otniel
 */
class ejercicio32 {
    int n;
    
    public void num(){
        Scanner in = new Scanner(System.in);
        System.out.println("Digite un numero n: ");
        n = in.nextInt();
        System.out.println("El valor absoluto de n es: "+Math.abs(n));
    }
    
}
