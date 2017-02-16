/*

 */
package ejerciciospractico;

import java.util.Scanner;

/**
 *
 * @author Otniel
 */
class ejercicio53 {
    String f;
    
    public void mayus(){
        Scanner sn= new Scanner (System.in);
        System.out.println("Escriba una frase: ");
        f= sn.nextLine();
        System.out.println(f.toUpperCase());
//        toUpperCase y toLowerCase te dan solo mayusculas o minusculas respectivamente
    }
}
