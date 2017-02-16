/*
Resuelva un algoritmo que solucione el problema de calcular el área de un 
triangulo con la fórmula: AREA = BASE x ALTURA / 2. 
 */
package ejerciciospractico;

import java.util.Scanner;

/**
 *
 * @author Otniel
 */
class ejercicio19 {
    int base;
    int altura;
    
    public void triangulo(){
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese base del triangulo: ");
        base = in.nextInt();
        Scanner on = new Scanner(System.in);
        System.out.println("Ingrese altura del triangulo: ");
        altura = on.nextInt();
        System.out.println("El area del triangulo es: "+ ((base*altura)/2));
    }
}
