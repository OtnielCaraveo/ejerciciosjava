/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciospractico;

import java.util.Scanner;

/**
 *
 * @author Otniel
 */
class ejercicio14 {
    float n;
    float p;
    
    public void porcent(){
        Scanner in = new Scanner (System.in);
        System.out.println("Ingrese un numero: ");
        n= in.nextFloat();
        p=(float) (n*.15);
        System.out.println("El 15% de "+n+" es: "+p);
    }
}
