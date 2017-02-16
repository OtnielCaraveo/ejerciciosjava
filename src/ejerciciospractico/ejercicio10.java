/*
Escribir un programa que pida un número entero y saque por pantalla el cociente
y el resto de la división entera entre ambos
 */
package ejerciciospractico;

import java.util.Scanner;

/**
 *
 * @author Otniel
 */
public class ejercicio10 {
    int a;
    int b;
    
    public void operador(){
        Scanner in = new Scanner (System.in);
        System.out.println("Dame el numero a:");
        a = in.nextInt();
        Scanner on = new Scanner (System.in);
        System.out.println("Dame el numero b:");
        b = on.nextInt();
        System.out.println("El cociente de la division a/b es:  "+(a/b));
        System.out.println("El resto de la division a/b es:  "+(a%b));
    }
}
