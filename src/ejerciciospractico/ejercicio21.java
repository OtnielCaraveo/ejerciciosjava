/*
Calcular el área de un rectángulo conociendo el valor de sus lados. 
 */
package ejerciciospractico;

import java.util.Scanner;

/**
 *
 * @author Otniel
 */
class ejercicio21 {
    int lado1;
    int lado2;
    
    public void rect(){
        Scanner in = new Scanner (System.in);
        System.out.println("Ingrese Base: ");
        lado1 = in.nextInt();
        Scanner on = new Scanner (System.in);
        System.out.println("Ingrese Altura: ");
        lado2 = on.nextInt();
        System.out.println("El area del rectangulo es: "+(lado1*lado2));
    }
    
}
