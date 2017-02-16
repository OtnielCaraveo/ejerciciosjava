/*
 Calcular el nuevo salario de un obrero si obtuvo un incremento del 25% sobre
su salario anterior. 
 */
package ejerciciospractico;

import java.util.Scanner;

/**
 *
 * @author Otniel
 */
class ejercicio15 {
    int salario;
    
    public void aumento(){
    Scanner in = new Scanner (System.in);
    System.out.println("Salario anterior: ");
    salario = in.nextInt();
    System.out.println("Su salario aumento 25% ");
    System.out.println("Su salario actual es: "+(salario*1.25));
}
}
