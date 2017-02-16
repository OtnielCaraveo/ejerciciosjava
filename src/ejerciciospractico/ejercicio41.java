/*
41.	Un departamento de climatología ha realizado recientemente su conversión 
al sistema métrico. Diseñar un algoritmo para realizar las siguientes conversiones: 
a. Leer la temperatura dada en la escala Celsius e imprimir en su equivalente 
Fahrenheit (la fórmula de conversión es “F=9/5 ºC+32”). 
b. Leer la cantidad de agua en pulgadas e imprimir su equivalente en 
milímetros (25.5 mm = 1 pulgada). 
 */
package ejerciciospractico;

import java.util.Scanner;

/**
 *
 * @author Otniel
 */
class ejercicio41 {
    int c,m;
    public void convert(){
    Scanner in = new Scanner(System.in);
    System.out.println("Grados Centigrados: ");
    c =in.nextInt();
    System.out.println("Grados Centigrados a Farenheit: "+(((1.8)*c)+32));
    Scanner on = new Scanner(System.in);
    System.out.println("Cantidad de agua en pulgadas: ");
    m =on.nextInt();        
    System.out.println("Cantidad de agua en milimetros: "+(m*25.5));
    }

    
}
