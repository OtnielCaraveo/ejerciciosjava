/*
 Calcular el doble de un número ingresado, a ese resultado calcularle el 10% y 
mostrar ese valor. 
 */
package ejerciciospractico;

import java.util.Scanner;

/**
 *
 * @author Otniel
 */
class ejercicio16 {
    int n;
    
    public void doblediez(){
        Scanner in = new Scanner (System.in);
        System.out.println("Ingrese un numero: ");
        n=in.nextInt();
        System.out.print(n*2*.1);
    }
}
