/*
Realizar una aplicación que calcule las cuatro operaciones básicas, 
suma, resta, división, multiplicación, con dos números. 
 */
package ejerciciospractico;

import java.util.Scanner;

/**
 *
 * @author Otniel
 */
class ejercicio25 {
    float num1;
    float num2;
    
    public void operador(){
        Scanner in = new Scanner (System.in);
        System.out.println("Digite  un  numero:");
        num1 = in.nextInt();
        Scanner on = new Scanner (System.in);
        System.out.println("Digite otro numero:");
        num2 = on.nextInt();
        System.out.println("LAS OPERACIONES DE AMBOS NUMEROS: ");
        System.out.println("SUMA:             "+(num1+num2));
        System.out.println("RESTA:            "+(num1-num2));
        System.out.println("MULTIPLICACION:   "+(num1*num2));
        System.out.println("DIVISION:         "+(num1/num2));
    }
}
