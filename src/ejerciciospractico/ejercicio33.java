/*
Calcular el número de pulsaciones que una persona debe tener por cada 
10 segundos de ejercicio, si la formula es: num. pulsaciones = (220 - edad)/10
 */
package ejerciciospractico;

import java.util.Scanner;

/**
 *
 * @author Otniel
 */
class ejercicio33 {
    int a;
    
    public void edad(){
        Scanner in = new Scanner(System.in);
        System.out.println("¿Cuantos años tiene? ");
        a = in.nextInt();
        System.out.println("El ritmo normal de sus pulsaciones es: "+((220-a)/10) +" pulsaciones por 10 segundos de ejercicio");
}
}
